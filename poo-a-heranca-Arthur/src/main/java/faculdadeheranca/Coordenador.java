package faculdadeheranca;

import java.util.Scanner;

public class Coordenador extends Funcionario{
    private String curso;
    private String turno;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + getNome() + '\'' +
                ", curso='" + getCurso()+ '\'' +
                ", turno='" + getTurno() + '\'' +
                '}';
    }

    public static Coordenador construir(){
        var coordenador = new Coordenador();
        var scanner = new Scanner(System.in);

        System.out.println("Nome:");
        coordenador.setNome(scanner.nextLine());

        System.out.println("Curso:");
        coordenador.setCurso(scanner.nextLine());;

        System.out.println("Turno:");
        coordenador.setTurno(scanner.nextLine());;

        return coordenador;
    }
}

