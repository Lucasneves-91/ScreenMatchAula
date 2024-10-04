package br.com.screenMatch.models;

public class Title {

    private String name;
    private int year;
    private int duration;
    private boolean plan;
    private double sumAvaliation;
    private int totalAvaliation;

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
}
