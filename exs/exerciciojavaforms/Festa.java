package exerciciojavaforms;

import java.util.Scanner;

abstract class Festa {
    private String nomeAniversariante;
    private int idadeAniversariante;
    private String local;
    private String tema;
    private int numeroConvidados;
 
    public Festa(String nomeAniversariante, int idadeAniversariante, String local, String tema, int numeroConvidados) {
        this.nomeAniversariante = nomeAniversariante;
        this.idadeAniversariante = idadeAniversariante;
        this.local = local;
        this.tema = tema;
        this.numeroConvidados = numeroConvidados;
    }

    public String getNomeAniversariante() {
        return nomeAniversariante;
    }

    public void setNomeAniversariante(String nomeAniversariante) {
        this.nomeAniversariante = nomeAniversariante;
    }

    public int getIdadeAniversariante() {
        return idadeAniversariante;
    }

    public void setIdadeAniversariante(int idadeAniversariante) {
        this.idadeAniversariante = idadeAniversariante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNumeroConvidados() {
        return numeroConvidados;
    }

    public void setNumeroConvidados(int numeroConvidados) {
        this.numeroConvidados = numeroConvidados;
    }

    public abstract void realizarFesta();

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aniversariante: ");
        String nomeAniversariante = scanner.nextLine();

        System.out.print("Digite a idade do aniversariante: ");
        int idadeAniversariante = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o local da festa: ");
        String local = scanner.nextLine();

        System.out.print("Digite o tema da festa: ");
        String tema = scanner.nextLine();

        System.out.print("Digite o número de convidados: ");
        int numeroConvidados = scanner.nextInt();


        Festa festa = new Festa(nomeAniversariante, idadeAniversariante, local, tema, numeroConvidados) {
            @Override
            public void realizarFesta() {
                System.out.println("Realizando a festa de aniversário!");
            }
        };


        System.out.println("Nome do aniversariante: " + festa.getNomeAniversariante());
        System.out.println("Idade do aniversariante: " + festa.getIdadeAniversariante() + " anos");
        System.out.println("Local da festa: " + festa.getLocal());
        System.out.println("Tema da festa: " + festa.getTema());
        System.out.println("Número de convidados: " + festa.getNumeroConvidados());

      
        festa.realizarFesta();

       
        scanner.close();
    }
}
