package com.alexr03;

public class SortingFunction {

    public TimerHelper timer = new TimerHelper();

    public Integer[] sort(Integer[] array) {
        return new Integer[0];
    }

    public void printStats(){
        System.out.println("Time taken: " + this.timer.getFriendlyElapsedTime());
        System.out.println("Counter Statistics: " + this.timer.getFriendlyCounters());
    }
}
