package com.alexr03.sorting;

import com.alexr03.SortingFunction;

public class SelectionSort extends SortingFunction {

    public SelectionSort() {
        this.timer.resetTimer();
    }

    @Override
    public Integer[] sort(Integer[] array) {
        this.timer.startTimer();

        int n = array.length;

        // One by one move boundary of unsorted subarrayay
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted arrayay
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
                this.timer.incrementArrayAccess();

                if (array[j] < array[min_idx]) {
                    this.timer.incrementComparisons();
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }

        this.timer.stopTimer();
        return array;
    }
}
