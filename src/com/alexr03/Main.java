package com.alexr03;

import com.alexr03.sorting.BubbleSort;
import com.alexr03.sorting.InsertionSort;
import com.alexr03.sorting.MergeSort;
import com.alexr03.sorting.SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static ArrayList<SortingFunction> sortingFunctions = new ArrayList<>();

    public static void main(String[] args) {
        Integer[] array = generateRandomArray(40000).toArray(Integer[]::new);
        System.out.println("!!ARRAY BEING USED: " + Arrays.toString(array) + "!!");
        printDivider();
        addToSortingFunctions();

        for (SortingFunction sortingFunction : sortingFunctions) {
            System.out.println("[" + sortingFunction.getClass().getSimpleName() + "]");
            Integer[] sortedArray = sortingFunction.sort(array);
//            System.out.println("Sorted array: " + Arrays.toString(sortedArray));
            sortingFunction.printStats();
            printDivider();
        }
    }

    private static void addToSortingFunctions() {
        sortingFunctions.add(new BubbleSort());
        sortingFunctions.add(new SelectionSort());
        sortingFunctions.add(new InsertionSort());
        sortingFunctions.add(new MergeSort());
        System.out.println("Added all sorting functions to list. Ready to proceed...");
        printDivider();
    }

    private static List<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(100000));
        }
        return list;
    }

    public static void printDivider() {
        System.out.println("-------------------------------------------------------------------------");
    }
}
