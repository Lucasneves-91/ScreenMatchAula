package br.com.screenMatch.calculation;

import br.com.screenMatch.models.Title;

public class TimeCalculation {

    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void insert(Title title) {
        System.out.println("Adicionando duração em minutos de " + title);
        this.totalTime += title.getDuration();
    }
}
