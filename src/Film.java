public class Film {
    String name;
    int year;
    int duration;
    boolean plan;
    double sumAvaliation;
    int totalAvaliation;

    void description() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + year);
        System.out.println("Duração em minutos: " + duration);
        System.out.println("Incluído no plano: + " + plan);

    }

    void avaliation (double note) {
        sumAvaliation += note;
        totalAvaliation ++;
    }

    double media (){
        return sumAvaliation / totalAvaliation;
    }
}
