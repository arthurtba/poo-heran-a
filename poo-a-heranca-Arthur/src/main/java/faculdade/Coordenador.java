package faculdade;

import java.util.Scanner;

public class Coordenador {
    private String nome;
    private String curso;
    private String turno;

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", turno='" + turno + '\'' +
                '}';
    }

    public void imprimir(){
        System.out.println(this);
    }

    public static Coordenador construir(){
        var coordenador = new Coordenador();
        var scanner = new Scanner(System.in);

        System.out.println("Nome:");
        coordenador.nome = scanner.nextLine();

        System.out.println("Formação:");
        coordenador.curso = scanner.nextLine();

        System.out.println("Cidade:");
        coordenador.turno = scanner.nextLine();

        return coordenador;
    }
}

