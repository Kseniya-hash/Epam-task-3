package by.epamtc.dubovik.task1.runner;

import java.io.IOException;
import java.util.Scanner;

import by.epamtc.dubovik.task1.*;
import by.epamtc.dubovik.task1.arrayfiller.*;

public class Runner {
	
	public static void main(String[] args) {
		String fileName = "src/by/epamtc/dubovik/task1/files/array_elements.txt";
		System.out.println("Выберите способ заполнения элементов массива\n"
				+ "FILE - заполнение элементов из файла\n"
				+ "CONSOLE - заполнение элементов с консоли\n"
				+ "RANDOM - заполнение случайными числами");
		Scanner in = new Scanner(System.in);
		Option option = Option.valueOf(in.nextLine().toUpperCase().trim());
		System.out.println("Введите количество элементов массива");
		int size = in.nextInt();
		Array array = null;
		try {
			switch (option){
				case FILE:
					array = ArrayFileReader.readArray(size, fileName);
					break;
				case CONSOLE:
					System.out.println("Введите элементы массива");
					array = ArrayConsoleReader.readArray(size);
					break;
				case RANDOM:
					System.out.println("Введите нижнюю границу массива");
					int lower = in.nextInt();
					System.out.println("Введите верхнюю границу массива");
					int higher = in.nextInt();
					array = ArrayRandomGenerator.generateElements(size, lower, higher);
					break;
				default:
					System.out.println("Вы ввели неверное значение");
			}
			System.out.println("Массив:");
			System.out.println(array);
			System.out.println("Все простые числа:");
			System.out.println(ArrayMathematic.findPrimes(array));
			System.out.println("Все числа Фибоначи:");
			System.out.println(ArrayMathematic.findFibonacci(array));
			System.out.println("Все трехзначные без повторяющихся цифр");
			System.out.println(ArrayMathematic.findNumbersWithoutRepeats(array, 3));
			System.out.println("Максимальный элемент массива:");
			System.out.println(array.findMaxElement());
			System.out.println("Минимальный элемент массива:");
			System.out.println(array.findMinElement());
			System.out.println("Отсортированный массив:");
			array.bubbleSort();
			System.out.println(array);
			System.out.println("Введите элемент, который нужно найти в массиве:");
			int value = in.nextInt();
			System.out.println("Его индекс:");
			System.out.println(array.binarySearch(value));
		} catch (IOException e) {
			System.out.println("Невозможно заполнить массив из файла");
		} catch (InvalidBorderException e) {
			System.out.println("Граница введена не верно");
		}
	}

}
