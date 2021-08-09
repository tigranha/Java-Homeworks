package com.aca.homework.week2;

public class LineProgressAware extends ProgressAware {

    final int lineLength;

    public LineProgressAware(int lineLength) {
        super();
        if (lineLength <= 0) {
            throw new RuntimeException();
        }
        this.lineLength = lineLength;
    }

    @Override
    public void showProgress(int seconds) {
        if (this.isVisible()) {
            long millisElapsed = System.currentTimeMillis() - this.getStartMillis();

            if (millisElapsed >= seconds * 1000L) {
                this.hideProgress();
            } else {
                long currentProgress = this.lineLength * millisElapsed / (seconds * 1000L);
                System.out.printf("Line width is: %d, Progress length is %d\n", this.lineLength, currentProgress);

            }

        }
    }
}
