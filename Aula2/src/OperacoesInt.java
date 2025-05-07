/* Crie um programa que seja capaz de fazer a leitura de dois valores inteiros a e b, e realize as seguintes operações:
* a + b
* a - b
* a * b
* a / v
* a ^ b
* Faça a leitura dos valores e apresentação dos resultados via console. */

import java.util.Scanner;
import java.lang.Math;

public class OperacoesInt {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor digite 2 valores inteiros\n");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("a = " + a + ";\tb = " + b + "\na + b = " + (a+b) + "\na - b = " + (a-b) + "\na * b = " + (a*b) + "\na / b = " + (a/b) + "\na ^ b = " + (int) Math.pow(a,b) + "\n");
        input.close();
    }    
}
