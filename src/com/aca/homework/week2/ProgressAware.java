package com.aca.homework.week2;

public class ProgressAware {

    private boolean isVisible;
    private final long startMillis;

    public ProgressAware() {
        this.startMillis = System.currentTimeMillis();
        this.isVisible = true;
    }

    public void showProgress(int seconds) {

        long millisElapsed = System.currentTimeMillis() - startMillis;
        long secondsAsMillis = seconds * 1000L;
        if (millisElapsed >= secondsAsMillis) {
            hideProgress();
        } else {
            long completionPercentage = (millisElapsed * 100) / secondsAsMillis;
            System.out.printf("%d%% done\n", completionPercentage);
        }
    }

    public void showProgress() {
        if (isVisible()) {
            System.out.println("Progress became visible");
        }
    }

    public void hideProgress() {
        this.isVisible = false;
        System.out.println("Progress became invisible");
    }

    public long getStartMillis() {
        return this.startMillis;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

}
