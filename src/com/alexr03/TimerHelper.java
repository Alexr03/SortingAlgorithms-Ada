package com.alexr03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimerHelper {
    private long startTime;

    private long endTime;

    private long arrayAccesses = 0;

    private long comparisons = 0;

    public void incrementArrayAccess() {
        this.arrayAccesses++;
    }

    public void incrementComparisons() {
        this.comparisons++;
    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        endTime = System.currentTimeMillis();
    }

    public void resetTimer() {
        this.arrayAccesses = 0;
        this.comparisons = 0;
        this.startTimer();
        this.stopTimer();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public String getFriendlyCounters() {
        return String.format("ArrayAccessed: %s times | Comparisons: %s times", this.arrayAccesses, this.comparisons);
    }

    public String getFriendlyElapsedTime() {
        long elapsedTime = getElapsedTime();

        Date date = new Date(elapsedTime);
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss.SSS");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String dateFormatted = formatter.format(date);
        return dateFormatted + String.format(" | [%s miliseconds seconds]", elapsedTime);
    }
}
