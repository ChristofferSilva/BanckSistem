package Test.Aplication;

public class calculadora {
    public static void main(String[] args) {

        int conta1 = 1;
        int conta2 = 2;
        int conta3 = 3;
        int conta4 = 4;
        int conta5 = 5;


        System.out.println("Multiplicação por 1 :");

        for (int i = 1; i <= 10; i++) {

             int resultado = conta1 * i;
             System.out.println(conta1 + " x " + i + " = " + resultado);

        }
         System.out.println("Multiplicação por 2 :");
         for (int i = 1; i <= 10; i++) {
             int resultado = conta2 * i;
             System.out.println(conta2 + " x " + i + " = " + resultado);
         }
        System.out.println("Multiplicação por 3 :");

         for (int i = 1; i <= 10; i++) {
             int resultado = conta3 * i;
             System.out.println(conta3 + " x " + i + " = " + resultado);

         }
        System.out.println("Multiplicação por 4 :");

         for (int i = 1; i <= 10; i++) {
             int resultado = conta4 * i;
             System.out.println(conta4 + " x " + i + " = " + resultado);
         }
        System.out.println("Multiplicação por 5 :");
         for (int i = 1; i <= 10; i++) {
             int resultado = conta5 * i;
             System.out.println(conta5 + " x " + i + " = " + resultado);
         }


    }
}
