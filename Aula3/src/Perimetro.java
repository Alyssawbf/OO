/*Crie um programa que seja capaz de ler os dados e calcular o perímetro e a área das seguintes figuras geométricas:
 * círculo, quadrado, retângulo, trapézio e triângulo
 * O usuário deverá inicialmente informar qual a figura geométrica e, a partir de então, o programa deverá ler os dados da figura e calcular seu perímetro e área.
 * Utilize funções para o cálculo da área e do perímetro da figura.
 */
import javax.swing.JOptionPane;
import java.lang.Math;

public class Perimetro {
    public static void main(String[] args) throws Exception {
        int figura = 0;
        float perimetro = 0.0f;
        float area = 0.0f;
        String figuras[] = { "Círculo", "Quadrado", "Retângulo", "Trapézio", "Triângulo"};
        boolean funciona = true;
        do{
            String escolha = JOptionPane.showInputDialog(null, "Escolha uma figura entre os valores abaixo:\nATENÇÃO: Escrever somente o número relacionado a figura desejada\n1 - Círculo\n2 - Quadrado\n3 - Retângulo\n4 - Trapézio\n5 - Triângulo", "Perímetro e área", JOptionPane.DEFAULT_OPTION);
            figura = Integer.parseInt(escolha);
            // JOptionPane.showMessageDialog(null, "Escolha: " + escolha + "\nFigura: " + figura);
        }
        while(figura <= 0 && figura > 5);
        switch (figura) {
            case 1:
                float raio = lerFloat( "raio" );
                perimetro = periCirculo( raio );
                area = areaCirculo( raio );
                break;
            case 2:
                float lado = lerFloat( "lado" );
                perimetro = periQuadrado( lado );
                area = areaQuadrado( lado );
                break;
            case 3:
                float altura = lerFloat( "altura" );
                float comprimento = lerFloat( "comprimento" );
                perimetro = periRetangulo( altura, comprimento );
                area = areaRetangulo( altura, comprimento );
                break;
            case 4:
                funciona = false;
                break;
            case 5:
                float ladoA = lerFloat( "lado a" );
                float ladoB = lerFloat( "lado b" );
                float ladoC = lerFloat( "lado c" );
                int triValido = existeTriangulo( ladoA, ladoB, ladoC );
                perimetro = periTriangulo( ladoA, ladoB, ladoC );
                area = areaTriangulo( triValido, ladoA, ladoB, ladoC );
            default:
                JOptionPane.showMessageDialog(null, "Caso não iodentificado", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
        }
        if(funciona){
            JOptionPane.showMessageDialog(null, "Sua figura é um " + figuras[figura] + "\nO perímetro da figura é " + perimetro + "\nA área da figura é " + area, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Essa opção ainda não está disponível", "Desculpe o transtorno", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static float lerFloat( String valor ){
        String input = JOptionPane.showInputDialog(null, "Digite o " + valor, "Entrada de valor", JOptionPane.QUESTION_MESSAGE);
        float numero = Float.parseFloat( input );
        return numero;
    }

    public static float periCirculo( float raio ){
        float pi = (float) Math.PI;
        float resultado = 2*pi*raio;
        return resultado;
    }
    public static float areaCirculo( float raio ){
        float pi = (float) Math.PI;
        float raioQuad = (float) Math.pow(raio, 2.0d);
        float resultado = pi * raioQuad;
        return resultado;
    }

    public static float periQuadrado( float lado ){
        return ( 4 * lado );
    }
    public static float areaQuadrado( float lado ){
        double areaD = Math.pow(lado, 2);
        float area = (float) areaD;
        return area;
    }

    public static float periRetangulo( float altura, float comprimento ){
        float perimetro = 2 * altura + 2 * comprimento;
        return perimetro;
    }
    public static float areaRetangulo( float altura, float comprimento ){
        return ( altura*comprimento );
    }

    // public static float periTrapezio(){}
    // public static float areaTrapezio(){}

    public static int existeTriangulo( float a, float b, float c ){
        boolean la = ( ( Math.abs( b - c ) < a ) && ( a < ( b + c ) ) );
        boolean lb = ( ( Math.abs( a - c ) < b ) && ( b < ( a + c ) ) );
        boolean lc = ( ( Math.abs( a - b ) < c ) && ( c < ( a + b ) ) );
        // 0 = não forma um triângulo
        int naoExiste = 0;
        if( la && lb && lc ){
            if( (a>b) && (a>c) ){
                // 1 = a é o maior lado
                naoExiste = 1;
                // 4 = a é hipotenusa
                if( a*a == ( b*b + c*c ) ) naoExiste+= 3;
            }
            else if( (b>a) && (b>c) ){
                // 2 = b é o maior
                naoExiste = 2;
                // 5 = b é a hipotenusa
                if( b*b == ( a*a + c*c ) ) naoExiste += 3;
            }
            else{
                // 3 = c é o maior lado
                naoExiste = 3;
                // 6 = c é a hipotenusa
                if( c*c == ( a*a + b*b ) ) naoExiste += 3;
            }
        }
        return naoExiste;
    }
    public static float periTriangulo( float a, float b, float c ){
        return ( a + b + c );
    }
    public static float areaTriangulo( int naoRet, float a, float b, float c ){
        float n = 0.0f;
        double alturaD = 0.0d;
        float altura = 0.0f;
        float resultado = 0.0f;
        switch (naoRet) {
            case 1:
                // a = m+n
                // b*b = h*h + m*m
                // c*c = h*h + n*n
                // cos(C) = m/b   cos(B) = n/c
                // b*b = a*a + c*c - 2*a*c*cos(B)
                // b*b = a*a + c*c - 2*a*n
                // n = (a*a - b*b + c*c)/(2*a)
                // h = sqrt(c*c-n*n)
                // Teorema de Herão
                n = ( a*a - b*b + c*c )/(2*a);
                alturaD = Math.sqrt( c*c - n*n );
                altura = (float) alturaD;
                resultado = a*altura;                
                break;
            case 2:
                n = ( b*b - c*c + a*a )/(2*b);
                alturaD = Math.sqrt( a*a - n*n );
                altura = (float) alturaD;
                resultado = a*altura;
                break;
            case 3:
                n = ( c*c - a*a + b*b )/(2*c);
                alturaD = Math.sqrt( b*b - n*n );
                altura = (float) alturaD;
                resultado = a*altura;
                break;
            case 4:
                resultado = b*c;
                break;
            case 5:
                resultado = a*c;
                break;
            case 6:
                resultado = a*b;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Caso de triângulo não identificado", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
        }
        return resultado;
    }

}
