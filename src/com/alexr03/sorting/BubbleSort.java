package com.alexr03.sorting;

import com.alexr03.SortingFunction;
import com.alexr03.TimerHelper;

public class BubbleSort extends SortingFunction {

    public BubbleSort() {
        this.timer.resetTimer();
    }

    @Override
    public Integer[] sort(Integer[] array) {
        this.timer.startTimer();

        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++){
                this.timer.incrementArrayAccess();
                if (array[j] > array[j+1])
                {
                    this.timer.incrementComparisons();
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        this.timer.stopTimer();
        return array;
    }
}
