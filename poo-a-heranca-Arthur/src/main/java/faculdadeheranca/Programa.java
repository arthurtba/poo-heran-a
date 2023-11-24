package faculdadeheranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("UniALFA Faculdade");

        List<Funcionario> funcionarios = new ArrayList<>();


        cadastrarFuncionarios(funcionarios);

        funcionarios.forEach(Funcionario::imprimir);
    }

    private static void cadastrarFuncionarios(List<Funcionario> funcionarios) {
        var scanner = new Scanner(System.in);
        do {
            System.out.println("Escolha um cadastro");
            System.out.println("Docente [d]");
            System.out.println("Técnico [t]");
            System.out.println("Assistente [a]");
            System.out.println("Coordenador [c]");
            var tipoCadastro = scanner.nextLine();

            if (tipoCadastro.equals("d")) funcionarios.add(Docente.construir());
            if (tipoCadastro.equals("t")) funcionarios.add(Tecnico.construir());
            if (tipoCadastro.equals("a")) funcionarios.add(Assistente.construir());
            if (tipoCadastro.equals("c")) funcionarios.add(Coordenador.construir());


            System.out.println("Continuar[1]");
        } while (scanner.nextLine().equals("1"));
    }
}
