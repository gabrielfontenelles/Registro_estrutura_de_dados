import java.util.Scanner;

public class Main {
    public static class Aluno {
        private String nome;
        private int matricula;
        private double nota1;
        private double nota2;
        private double nota3;
        private double media;

        public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
            this.nome = nome;
            this.matricula = matricula;
            setNotas(nota1, nota2, nota3);
            calcularMedia();
        }

        private void calcularMedia() {
            this.media = (nota1 + nota2 + nota3) / 3;
        }

        public void setNotas(double nota1, double nota2, double nota3) {
            // Adicione validações se necessário
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            calcularMedia();
        }

        public String getNome() {
            return nome;
        }

        public int getMatricula() {
            return matricula;
        }

        public double getNota1() {
            return nota1;
        }

        public double getNota2() {
            return nota2;
        }

        public double getNota3() {
            return nota3;
        }

        public double getMedia() {
            return media;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos você deseja cadastrar?");
        int n = sc.nextInt();

        sc.nextLine(); // Consumir a quebra de linha pendente

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1));
            String nome = sc.nextLine();

            System.out.println("Digite o número de matrícula do aluno " + (i + 1));
            int matricula = sc.nextInt();

            System.out.println("Digite as três notas do aluno " + (i + 1));
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            alunos[i] = new Aluno(nome, matricula, nota1, nota2, nota3);

            sc.nextLine(); // Consumir a quebra de linha pendente
        }

        sc.close();

        System.out.println("Informações dos alunos cadastrados:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.println("Nome: " + alunos[i].getNome());
            System.out.println("Matrícula: " + alunos[i].getMatricula());
            System.out.println("Notas: " + alunos[i].getNota1() + ", " + alunos[i].getNota2() + ", " + alunos[i].getNota3());
            System.out.println("Média final: " + alunos[i].getMedia());
        }
    }
}
