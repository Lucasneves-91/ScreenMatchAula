package br.com.screenMatch.Main;

import br.com.screenMatch.models.Film;
import br.com.screenMatch.models.Series;
import br.com.screenMatch.models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args){
        Film myFilm = new Film("The Substance", 2024);
        myFilm.avaliation(9);
        Film otherFilm = new Film("Harry Potter e a Pedra Filosofal", 2001);
        myFilm.avaliation(8);
        Series series = new Series("Flea Bag",2016);

        ArrayList<Title> list = new ArrayList<>();
        list.add(myFilm);
        list.add(otherFilm);
        list.add(series);

        for (Title item : list) {
            System.out.println(item.getName());
            if(item instanceof Film film && film.getClassifiable() > 2){
                System.out.println("Classificação " + film.getClassifiable());
            }
        }


    }
}
