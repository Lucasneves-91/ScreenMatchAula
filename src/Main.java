import br.com.screenMatch.calculation.TimeCalculation;
import br.com.screenMatch.models.Film;
import br.com.screenMatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Film favorite = new Film();
        Film other = new Film();
        Series series = new Series();
        TimeCalculation timeCalculation = new TimeCalculation();

        favorite.setName("The Matrix");
        favorite.setYear(1999);
        favorite.setDuration(135);
        favorite.setPlan(true);

        other.setName("Warriors");
        other.setYear(1988);
        other.setDuration(120);
        other.setPlan(true);

        series.setName("Dragon Ball");
        series.setYear(1999);
        series.setPlan(true);
        series.setActivates(false);
        series.setSeasons(26);
        series.setEpisodesBySeason(20);
        series.setMinutesPerEpisode(30);

        timeCalculation.insert(favorite);
        timeCalculation.insert(other);
        timeCalculation.insert(series);

        System.out.println("tempo Total " + timeCalculation.getTotalTime());


    }
}