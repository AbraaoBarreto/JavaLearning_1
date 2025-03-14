package exerciciosClasses;

public class Main {
    public static void main(String[] args) {

        //1- Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibeMensagem();

        //2- Crie uma classe Calculadora com um método que recebe um número como
        // parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobraNumero(5));

        //3- Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao
        // e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular
        // a média de avaliações.
        Musica musica1 = new Musica();
        musica1.titulo = "isso é sério";
        musica1.artista = "Matuê";
        musica1.anoDeLancamento = 2024;
        musica1.avaliaMusica(8);
        musica1.avaliaMusica(9);
        musica1.avaliaMusica(10);
        musica1.media();
        musica1.exibeFichaTecnica();

        //4- Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha
        // técnica e calcular a idade do carro.
        Carro carro1 = new Carro();
        carro1.modelo = "SUV";
        carro1.cor = "Preto";
        carro1.ano = 2020;
        carro1.ExibeFichaTec();
        System.out.println("Idade do carro: " + carro1.calculaIdade(2025) + " anos.");

        //5- Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
        // Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método
        // para exibir as informações.
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Abraão";
        aluno1.idade = 23;
        aluno1.ExibeInfoAluno();

    }
}
