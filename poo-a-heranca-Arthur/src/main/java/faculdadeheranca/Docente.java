package faculdadeheranca;

import java.util.Scanner;

//           sub-classe  <-  super-classe
public class Docente extends Funcionario{
    private String formacao;
    private String cidade;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nome='" + getNome() + '\'' +
                ", formação='" + getFormacao() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                '}';
    }

        public static Docente construir(){
            var docente = new Docente();
            var scanner = new Scanner(System.in);

            System.out.println("Nome:");
            docente.setNome(scanner.nextLine());

            System.out.println("Formação:");
            docente.setFormacao(scanner.nextLine());;

            System.out.println("Cidade:");
            docente.setCidade(scanner.nextLine());

            return docente;
        }
    }
