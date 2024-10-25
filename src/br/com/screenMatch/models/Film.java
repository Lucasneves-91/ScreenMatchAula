package br.com.screenMatch.models;

import br.com.screenMatch.calculation.Classifiable;

public class Film extends Title implements Classifiable {
    String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassifiable() {
        return (int) media() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYear() + ")";
    }
}
