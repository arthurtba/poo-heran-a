package faculdadeheranca;

import java.util.Scanner;

public class Assistente extends Funcionario{

    private String setor;
    private String atribuicao;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getAtribuicao() {
        return atribuicao;
    }

    public void setAtribuicao(String atribuicao) {
        this.atribuicao = atribuicao;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                "nome='" + getNome() + '\'' +
                ", setor='" + getSetor() + '\'' +
                ", atribuicao='" + getAtribuicao() + '\'' +
                '}';
    }



        public static Assistente construir () {
            var assistente = new Assistente();
            var scanner = new Scanner(System.in);

            System.out.println("Nome:");
            assistente.setNome(scanner.nextLine());

            System.out.println("Setor:");
            assistente.setSetor(scanner.nextLine());;

            System.out.println("Atribuição:");
            assistente.setAtribuicao(scanner.nextLine());;

            return assistente;
        }
    }
