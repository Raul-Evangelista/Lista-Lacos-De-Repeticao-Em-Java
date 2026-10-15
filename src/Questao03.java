import java.util.Scanner;

//      Aluno: Raul Alexandre Evangelista

public class Questao03 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

//      Introdução
        System.out.println(" | Questão 03 - Categorização da Idade de Oito Pessoas |\n");

//      Entrada Repeticional
        boolean idadeInvalida = false;
        int idade;
        int contador = 0;
        int faixaEtaria1 = 0;
        int faixaEtaria2 = 0;
        int faixaEtaria3 = 0;
        int faixaEtaria4 = 0;
        int faixaEtaria5 = 0;
        double percentualEtario1;
        double percentualEtario5;

        while (contador < 8 && !idadeInvalida) {

            contador++;

            System.out.print("Digite, em anos, a idade da pessoa: ");
            idade = leitor.nextInt();          

            if (idade < 0) {
                idadeInvalida = true;

            } else if (idade <= 15) {
                faixaEtaria1++;

            } else if (idade <= 30) {
                faixaEtaria2++;

            } else if (idade <= 45) {
                faixaEtaria3++;

            } else if (idade <= 60) {
                faixaEtaria4++;

            } else {
                faixaEtaria5++;

            }
            
        }

//      Pulando uma linha
        System.out.println();

//      Saída Condicional do if
        if (idadeInvalida) {
            System.out.println("As idades informadas não podem ser menores do que zero.");
            System.out.println("\n| Fim do Programa | ");

        } else {
//      Saída Condicional do Else
            percentualEtario1 = faixaEtaria1 * 100.0 / contador;
            percentualEtario5 = faixaEtaria5 * 100.0 / contador;

            System.out.println("Quantidade de pessoas na primeira faixa etária: " + faixaEtaria1
                + "\nQuantidade de pessoas na segunda faixa etária: " + faixaEtaria2
                + "\nQuantidade de pessoas na terceira faixa etária: " + faixaEtaria3
                + "\nQuantidade de pessoas na quarta faixa etária: " + faixaEtaria4
                + "\nQuantidade de pessoas na quinta faixa etária: " + faixaEtaria5
            );

            System.out.printf("%nPercentual de pessoas na primeira faixa etária: %.2f%% %n",percentualEtario1);
            System.out.printf("Percentual de pessoas na última faixa etária: %.2f%% %n",percentualEtario5);
            System.out.println("\n| Fim do Programa | ");

        }     

        leitor.close();

    }
}
