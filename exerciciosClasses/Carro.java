package exerciciosClasses;
//Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a
// ficha técnica e calcular a idade do carro.
public class Carro {
    String modelo, cor;
    int ano;

    int calculaIdade(int anoAtual){
        return anoAtual - ano;
    }

    void ExibeFichaTec(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}
