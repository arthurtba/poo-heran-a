package faculdade;

import java.util.Scanner;

public class Assistente {
    private String nome;
    private String setor;
    private String atribuicao;

    @Override
    public String toString() {
        return "Assistente{" +
                "nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", atribuicao='" + atribuicao + '\'' +
                '}';
    }

        public void imprimir () {
            System.out.println(this);
        }

        public static Assistente construir () {
            var assistente = new Assistente();
            var scanner = new Scanner(System.in);

            System.out.println("Nome:");
            assistente.nome = scanner.nextLine();

            System.out.println("Setor:");
            assistente.setor = scanner.nextLine();

            System.out.println("Atribuição:");
            assistente.atribuicao = scanner.nextLine();

            return assistente;
        }
    }
