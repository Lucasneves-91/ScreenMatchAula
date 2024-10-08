package br.com.screenMatch.models;

import br.com.screenMatch.calculation.Classifiable;

public class Episodes implements Classifiable {
    private int number;
    private String name;
    private Series series;
    private int fullView;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getFullView() {
        return fullView;
    }

    public void setFullView(int fullView) {
        this.fullView = fullView;
    }

    @Override
    public int getClassifiable() {
        if (fullView > 100) {
            return 4;
        } else {
            return 2;
    }
}}

