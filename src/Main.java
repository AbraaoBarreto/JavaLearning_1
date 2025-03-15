import br.com.barrecorp.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();

        movie1.setNome("Os Vingadores");
        movie1.setAnoDeLancamento(2012);
        movie1.setDuracaoEmMinutos(180);
        movie1.setIncluidoNoPlano(true);

        movie1.avalia(8);
        movie1.avalia(9);
        movie1.avalia(10);
        movie1.avalia(7);

        movie1.pegaMedia();

        movie1.ExibeFichaTecnica();
    }
}

