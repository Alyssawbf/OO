/*Crie um programa "Hello World" em Java, capaz de ler seu nome e apresentar a seguinte mensagem:
"Olá <Fulano>, seja bem vindo!" Apresente a mensagem em modo console e modo gráfico. */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Escreva seu nome:\n");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.println("Olá " + nome + ", seja bem vindo!\n");
        input.close();

        JOptionPane.showMessageDialog(null, "Hello World!");

        nome = JOptionPane.showInputDialog(null, "Escreva seu nome:", "Olá!", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", seja bem vindo!", "Olá!", JOptionPane.INFORMATION_MESSAGE);
    }
}
