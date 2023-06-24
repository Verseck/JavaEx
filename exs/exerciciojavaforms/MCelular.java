package exerciciojavaforms;

public class MCelular {
    private String marca;
    private String modelo;
    private String cor;
    private int capacidadeArmazenamento;
    private double preco;

    
    public MCelular() {
       
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        
        MCelular celular = new MCelular();

       
        celular.setMarca("xiaomi");
        celular.setModelo("redmi note8");
        celular.setCor("azul");
        celular.setCapacidadeArmazenamento(64);
        celular.setPreco(1200.00);

        
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Capacidade de Armazenamento: " + celular.getCapacidadeArmazenamento() + "GB");
        System.out.println("Preço: R$" + celular.getPreco());
    }
}

