import br.com.screenMatch.models.Film;

public class Main {
    public static void main(String[] args) {
        Film film = new Film();

        film.setName("The Matrix");
        film.setYear(1999);
        film.setDuration(135);
        film.setPlan(true);

        film.description();
        film.avaliation(9);
        film.avaliation(8);
        film.avaliation(8);

        System.out.println("Média de avaliações do filme: " + film.media());


    }
}