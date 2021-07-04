package by.epamtc.dubovik.task2.runner;

import java.util.Scanner;

import by.epamtc.dubovik.task2.sorting.JaggedArraySorting;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Введите количество строк");
		Scanner in = new Scanner(System.in);
		int rowCount = in.nextInt();
		int[][]array = new int[rowCount][];
		for(int i  = 0; i < rowCount; ++i) {
			System.out.println("Введите количество элементов строки");
			int count = in.nextInt();
			array[i] = new int[count];
			System.out.println("Введите элементы строки");
			for(int j = 0; j < count; ++j) {
				array[i][j] = in.nextInt();
			}
		}
		System.out.println("Массив до сортировки");
		PrintArray.printJaggedArray(array);
		
		JaggedArraySorting.sortBySummInc(array);
		System.out.println("По возрастанию суммы элементов строк");
		PrintArray.printJaggedArray(array);
		
		JaggedArraySorting.sortBySummDec(array);
		System.out.println("По убыванию суммы элементов строк");
		PrintArray.printJaggedArray(array);
		
		JaggedArraySorting.sortByMaxInc(array);
		System.out.println("По возрастанию максимальных элементов строк");
		PrintArray.printJaggedArray(array);
		
		JaggedArraySorting.sortByMaxDec(array);
		System.out.println("По убыванию максимальных элементов строк");
		PrintArray.printJaggedArray(array);
		
		JaggedArraySorting.sortByMinInc(array);
		System.out.println("По возрастанию минимальных элементов строк");
		PrintArray.printJaggedArray(array);
		
		JaggedArraySorting.sortByMinDec(array);
		System.out.println("По убыванию минимальных элементов строк");
	}
}
