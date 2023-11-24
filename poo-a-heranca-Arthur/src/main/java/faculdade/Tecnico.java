package faculdade;

import java.util.Scanner;

public class Tecnico {
    private String nome;
    private String departamento;
    private String especialidade;

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

    public void imprimir(){
        System.out.println(this);
    }

    public static Tecnico construir(){
        var tecnico = new Tecnico();
        var scanner = new Scanner(System.in);

        System.out.println("Nome:");
        tecnico.nome = scanner.nextLine();

        System.out.println("Departamento:");
        tecnico.departamento = scanner.nextLine();

        System.out.println("Especialidade:");
        tecnico.especialidade = scanner.nextLine();

        return tecnico;
    }
}
