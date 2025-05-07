public class ExercicioCalc {
    public static void main(String[] args) throws Exception{
        Calculadora c1, c2;
        
        c1 = new Calculadora();
        c2 = new Calculadora(2, -2);

        c1.setOp1(2);
        c1.setOp2(3);

        c1.somar();
        c2.somar();

        System.out.println("O resultado de " + c1.getOp1() + " + " + c1.getOp2() + " é igual a " + c1.getResultado());
        System.out.println("O resultado de " + c2.getOp1() + " + " + c2.getOp2() + " é igual a " + c2.getResultado());
    }
}
