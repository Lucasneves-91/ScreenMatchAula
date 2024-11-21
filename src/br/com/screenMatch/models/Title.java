package br.com.screenMatch.models;

import br.com.screenMatch.Exception.YearConversionErrorException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable <Title> {

    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int year;
    private int duration;
    private boolean plan;
    private double sumAvaliation;
    private int totalAvaliation;

    public Title(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Title(OmdbTitle myTitleOmdb) {
        this.name = myTitleOmdb.title();
        if(myTitleOmdb.year().length() > 4) {
            throw new YearConversionErrorException("Não consegui converter o ano porque tem mais de 04 caracteres.");
        }
        this.year = Integer.valueOf(myTitleOmdb.year());
        this.duration = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isPlan() {
        return plan;
    }

    public void setPlan(boolean plan) {
        this.plan = plan;
    }

    public double getSumAvaliation() {
        return sumAvaliation;
    }

    public void setSumAvaliation(double sumAvaliation) {
        this.sumAvaliation = sumAvaliation;
    }

    public int getTotalAvaliation() {
        return totalAvaliation;
    }

    public void setTotalAvaliation(int totalAvaliation) {
        this.totalAvaliation = totalAvaliation;
    }

    public void description() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + year);
        System.out.println("Duração em minutos: " + duration);
        System.out.println("Incluído no plano: + " + plan);

    }

    public void avaliation(double note) {
        sumAvaliation += note;
        totalAvaliation ++;
    }

    public double media(){
        return sumAvaliation / totalAvaliation;
    }


    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "Title{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                '}';
    }
}
