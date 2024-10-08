import br.com.screenMatch.calculation.FilterRecommendation;
import br.com.screenMatch.calculation.TimeCalculation;
import br.com.screenMatch.models.Episodes;
import br.com.screenMatch.models.Film;
import br.com.screenMatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("The Substance");
        myFilm.setYear(2024);
        myFilm.setDuration(140);
        System.out.println("Duração do filme: " + myFilm.getDuration());

        myFilm.description();
        myFilm.avaliation(9);
        myFilm.avaliation(7);
        myFilm.avaliation(8);
        System.out.println("Total de Avaliações: " + myFilm.getTotalAvaliation());
        System.out.println(myFilm.media());

        Series series = new Series();
        series.setName("Flea Bag");
        series.setYear(2016);
        series.description();
        series.setSeasons(2);
        series.setEpisodesBySeason(6);
        series.setMinutesPerEpisode(20);
        System.out.println("Duração para maratonar " + series.getName() + " : " + series.getDuration());

        Film otherFilm = new Film();
        otherFilm.setName("Harry Potter e a Pedra Filosofal");
        otherFilm.setYear(2001);
        otherFilm.setDuration(152);

        TimeCalculation calculator = new TimeCalculation();
        calculator.insert(myFilm);
        calculator.insert(otherFilm);
        calculator.insert(series);
        System.out.println(calculator.getTotalTime());

        FilterRecommendation filter = new FilterRecommendation();
        filter.filter(myFilm);

        Episodes episodes = new Episodes();
        episodes.setNumber(1);
        episodes.setSeries(series);
        episodes.setFullView(168);
        filter.filter(episodes);


    }
}