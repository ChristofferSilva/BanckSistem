package Poo;

public class Sistema {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.marca = "Toyota";
        carro1.modelo = "Ford";
        carro1.ano = 2025;


        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println(carro1.marca);

        carro1.acelerar();
    }
}
