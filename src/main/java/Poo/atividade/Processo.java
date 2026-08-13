package Poo.atividade;

public class Processo {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.nome = "Jose";
        p1.idade = 25;
        p1.profissao = "motorista";

        System.out.println("Olá, meu nome é : " +p1.nome);
        System.out.println("Tenho " + p1.idade + " anos.");
        System.out.println("Minha profissão é : " + p1.profissao);

        p1.apresentar();
    }
}
