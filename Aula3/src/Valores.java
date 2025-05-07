/* Crie um programa que solicite ao usuário que preencha um vetor de valores inteiros de tamanho x (a ser informado pelo próprio usuário durante a execução do programa). Uma vez que os valores forem lidos e armazenados no vetor, o programa deverá informar ao usuário:
*        qual a média dos valores lidos;
*        quantidade de números positivos;
*        quantidade de números negativos;
*        quantidade de zeros;
*        quantidade de números pares;
*        quantidade de números ímpares.
* Para cada um desses casos acima, crie uma função capaz de calcular e retornar as respostas.
* "Pontapé" para o exercício está disponível no diretório dessa aula, com o nome Exercicio2.java:
* Tip: A partir do vetor preenchido com os valores, pode-se passá-lo como parâmetro para cada função criada para resolução do exercicio. Cada um dos itens solicitados no exercício pode ser implementado por meio de uma função. */

public class Valores {
    public static void main (String[] args) {
        int a = 13; 
        int b = 10; 
        int c = 30; 
        
        String resposta1 = ""; 
        String resposta2 = ""; 
        
        resposta1 += a; 
        resposta1 += b; 
        resposta1 += c; 
        
        resposta2 += a + b + c; 
        
        System.out.println (resposta1); 
        System.out.println (resposta2); 
     }
}
