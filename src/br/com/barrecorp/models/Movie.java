package br.com.barrecorp.models;

public class Movie {
    private String nome;
    private int anoDeLancamento, totalDeNotas;
    private double duracaoEmMinutos, somaDasAvaliacoes, media;
    private boolean incluidoNoPlano;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }



    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeNotas++;
    }

    public double pegaMedia(){
        media = somaDasAvaliacoes / totalDeNotas;
        return media;
    }

    public void ExibeFichaTecnica(){
        System.out.println("Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Nota media do filme: " + media);
        System.out.println("Total de avaliações: " + totalDeNotas);
    }


}
