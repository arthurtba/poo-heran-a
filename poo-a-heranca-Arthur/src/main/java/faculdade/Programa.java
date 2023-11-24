package faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("UniALFA Faculdade");

        List<Docente> docentes = new ArrayList<>();
        List<Tecnico> tecnicos = new ArrayList<>();
        List<Assistente> assistentes = new ArrayList<>();
        List<Coordenador> coordenadores = new ArrayList<>();

        cadastrarFuncionarios(docentes, tecnicos, assistentes, coordenadores);

        imprimirListas(docentes, tecnicos, assistentes, coordenadores);
    }

    private static void cadastrarFuncionarios(List<Docente> docentes, List<Tecnico> tecnicos, List<Assistente> assistentes, List<Coordenador> coordenadores) {
        var scanner = new Scanner(System.in);
        do {
            System.out.println("Escolha um cadastro");
            System.out.println("Docente [d]");
            System.out.println("Técnico [t]");
            System.out.println("Assistente [a]");
            System.out.println("Coordenador [c]");
            var tipoCadastro = scanner.nextLine();

            if (tipoCadastro.equals("d")) docentes.add(Docente.construir());
            if (tipoCadastro.equals("t")) tecnicos.add(Tecnico.construir());
            if (tipoCadastro.equals("a")) assistentes.add(Assistente.construir());
            if (tipoCadastro.equals("c")) coordenadores.add(Coordenador.construir());


            System.out.println("Continuar[1]");
        } while (scanner.nextLine().equals("1"));
    }
    private static void imprimirListas(List<Docente> docentes,
                                       List<Tecnico> tecnicos,
                                       List<Assistente> assistentes,
                                       List<Coordenador> coordenadores) {
        docentes.forEach(Docente::imprimir);
        tecnicos.forEach(Tecnico::imprimir);
        assistentes.forEach(Assistente::imprimir);
        coordenadores.forEach(Coordenador::imprimir);
    }

}
