package br.com.screenMatch.calculation;

import br.com.screenMatch.models.Title;

public class TimeCalculation {

    private int totalTime;

    public void insert(Title title) {
        totalTime += title.getDuration();
    }

    public int getTotalTime() {
        return totalTime;
    }
}
