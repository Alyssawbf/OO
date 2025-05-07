public class Calculadora {
    // Def atributos
    int op1, op2, resultado;
    
    // Def métodos contrutores
    public Calculadora(){
        // AUTOgen
    }

    public Calculadora(int o1, int o2){
        op1 = o1;
        op2 = o2;
    }

    // Def métodos de atribuição
    public void setOp1(int o1){
        op1 = o1;
    }
    public void setOp2(int o2){
        op2 = o2;
    }

    // Def métodos de informação
    public int getOp1(){
        return op1;
    }
    public int getOp2(){
        return op2;
    }
    public int getResultado(){
        return resultado;
    }

    // Def métodos pŕoptios
    public int somar(){
        resultado = op1 + op2;
        return resultado;
    }
    public int subtrair(){
        resultado = op1 - op2;
        return resultado;
    }
    public int multiplicar(){
        resultado = op1 * op2;
        return resultado;
    }
    public int dividir(){
        resultado = op1 / op2;
        return resultado;
    }
}
