package com.alexr03.sorting;

import com.alexr03.SortingFunction;

public class InsertionSort extends SortingFunction {

    public InsertionSort() {
        this.timer.resetTimer();
    }

    @Override
    public Integer[] sort(Integer[] array) {
        this.timer.startTimer();

        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            this.timer.incrementArrayAccess();

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                this.timer.incrementComparisons();
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        this.timer.stopTimer();

        return array;
    }
}
