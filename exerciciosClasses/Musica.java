package exerciciosClasses;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento, numAvaliacoes;
    double avaliacaoTotal, media;

    void exibeFichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nota media das avaliações: " + media);
    }

    void avaliaMusica(double nota){
        avaliacaoTotal += nota;
        numAvaliacoes++;
    }

    double media(){
        media = avaliacaoTotal / numAvaliacoes;
        return media;
    }
}
