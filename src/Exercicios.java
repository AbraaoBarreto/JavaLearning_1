package src;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        String name = "Abraão Barreto";
        String adress = "rua Arnon de Melo";
        double salario = 1500.90;
        String date = "27/02/2002";

        System.out.println("Eu " + name + " morando no endereço " + adress + " confirmo que recebi o salario " + salario + " na data " + date);
    }
}

// 1- Crie um programma que realize a media de duas notas decimais e exiba o resultado
class Primeiro{
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 9.5;
        double media = (nota1 + nota2) / 2;

        System.out.println("A media foi de: " + media);

    }
}

// 2- Declare uma var do tipo double e uma do tipo int. Faça o casting da var double para int e imprima o resultado
class Segunda {
    public static void main(String[] args) {
        double num1 = 7.5;
        int num2 = (int) num1;

        System.out.println(num2);
    }
}

// 3- Declare uma var do tipo char e uma do tipo String. Atribua valor a elas e concatene-as em uma uma mensagem
class Terceira {
    public static void main(String[] args) {
        char artigo = 'A';
        String substantivo = " menina ";

        System.out.println(artigo + substantivo + "é bonita.");
    }
}

// 4- Declare uma var do tipo double <precoProduto> e uma do tipo int <quantidade>. Calcule o valor total do produto
// pela quantidade e apresente o resultado em uma mensagem
class Quarta {
    public static void main(String[] args) {
        double preco = 399.99;
        int quantidade = 17;
        double valorTotal = preco * quantidade;

        System.out.println(String.format("O preço final é de :R$%.2f", valorTotal));
    }
}

// 5- Declare uma var do tipo double <valorEmDolar>. Atribua um valor em dolares a ela. Considere que o valor em
// dolar é 4,94 reais. Faça a conversao dos valores em dolar para reais e imprima o resultado formatado.
class Quinta {
    public static void main(String[] args) {
        double valorEmDolar = 400;
        double dolarToReal = 4.94;
        double valorEmReal = valorEmDolar * dolarToReal;

        System.out.println(String.format("Convertendo $%.2f em reais: R$%.2f", valorEmDolar, valorEmReal));
    }
}

// 6- Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o
// preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor
// percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao
// preço original e imprima o novo preço com desconto.
class Sexta {
    public static void main(String[] args) {
        double precoOriginal = 50;
        double percentualDesconto = 10;
        double valorDescontado = (percentualDesconto / 100) * precoOriginal;
        double novoValor = precoOriginal - valorDescontado;

        System.out.println("O valor do produto, depois do desconto ficou é: " + novoValor);
    }
}

// 7- Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo",
// caso contrário, exiba "Número negativo".
class Setima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("o numero é positivo.");
        } else if (num < 0) {
            System.out.println("o numero é negativo.");
        } else {
            System.out.println("O numero zero é neutro.");
        }
    }
}

// 8- Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são
// iguais, diferentes, o primeiro é maior ou o segundo é maior.
class Oitava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira de, forma sequencial, dois numero inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("Os numeros sao diferentes, onde o primeiro numero é maior que o segundo.");
            } else {
                System.out.println("Os numeros sao diferentes, onde o segundo numero é maior que o primeiro.");
            }

        } else {
            System.out.println("Os dois numeros são iguais");
        }
    }
}

// 9- Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
class Nona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = """
                      Escolha uma das opções a baixo de acordo com seu numero:
                      
                      1. Calcular a área do quadrado
                      2. Calcular a área do círculo
                      """;

        System.out.println(menu);
        int resposta = scanner.nextInt();

        while (resposta != 1 && resposta != 2) {
            System.out.println("Número invalido!");
            System.out.println(menu);
            resposta = scanner.nextInt();
        }

        if (resposta == 1) {
            System.out.println("A formula pra calcular a area de um quadrado é a= Lˆ2");
        } else {
            System.out.println("A formula pra calcular a area de um circulo é a = πrˆ2");
        }
    }
}

// 10- Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
class Decima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero.");
        int num = scanner.nextByte();
        int multiplicador = 1;
        int resultado;

        while (multiplicador < 11) {
            resultado = num * multiplicador;
            System.out.println(String.format("%d x %d = %d", num, multiplicador, resultado));
            multiplicador++;
        }
    }
}

// 11- Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e
// exiba uma mensagem correspondente.
class Onze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um numero inteiro:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }

    }
}

// 12- Crie um programa que solicite ao usuário um número e calcule o fatorial desse numero
class Doze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);

    }

}