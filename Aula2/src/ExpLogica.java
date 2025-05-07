/* Crie um programa que leia três valores a,b e c, todos do tipo float, e retorne o valor lógico da seguinte expressão:
* a*a == (b * b + c * c)
* Utilize a entrada e saída gráfica de Java para ler e apresentar os resultados.
* 
* Dica: para realizar a entrada e saida gráfica você deverá fazer o type-casting de String para float.
 */

import javax.swing.JOptionPane;

public class ExpLogica {
    public static void main(String[] args) throws Exception {
        String input = JOptionPane.showInputDialog(null, "Digite o 1º valor:", "Digite 3 valores", JOptionPane.QUESTION_MESSAGE);
        float a = Float.parseFloat(input);
        input = JOptionPane.showInputDialog(null, "Digite o 2º valor:", "Digite 3 valores", JOptionPane.QUESTION_MESSAGE);
        float b = Float.parseFloat(input);
        input = JOptionPane.showInputDialog(null, "Digite o 3º valor:", "Digite 3 valores", JOptionPane.QUESTION_MESSAGE);
        float c = Float.parseFloat(input);

        /*JOptionPane.showMessageDialog(null, "Float a = " + a + "\nFloat b = " + b + "\nFloat c = " + c, "Teste", JOptionPane.PLAIN_MESSAGE);*/

        /*float aa = a*a;
        *float bb = b*b;
        *float cc = c*c;
        *float ccbb = bb + cc;
        *boolean teste = aa == ccbb;*/
        boolean resultado = ( (a*a) == ( (b*b) + (c*c) ) );

        /*JOptionPane.showMessageDialog(null, "aa = " + aa + "    bb = " + bb + " cc = " + cc + "\n" + aa + " == " + ccbb + "\nTeste: " + teste + "\nResultado: " + resultado, "Teste", JOptionPane.PLAIN_MESSAGE);*/

        String output = "Teorema de Pitágoras:\na*a == (b * b + c * c)\na = " + a + "   b = " + b + "   c = " + c + "\nValor: ";

        JOptionPane.showMessageDialog(null, output + resultado, "Expressão lógica", JOptionPane.INFORMATION_MESSAGE);
    }
}
