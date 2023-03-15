public class Celular {
    private String modelo;
    private String marca;
    private int armazenamentoInterno;
    private double tamanhoTela;
    private int bateriaAtual;
    private int bateriaTotal;

  
    public Celular(String modelo, String marca, int armazenamentoInterno, double tamanhoTela, int bateriaTotal) {
        this.modelo = modelo;
        this.marca = marca;
        this.armazenamentoInterno = armazenamentoInterno;
        this.tamanhoTela = tamanhoTela;
        this.bateriaTotal = bateriaTotal;
        this.bateriaAtual = bateriaTotal;
    }

    public void carregarBateria() {
        this.bateriaAtual = this.bateriaTotal;
        System.out.println("Bateria carregada.");
    }

    public int verificarBateria() {
        return this.bateriaAtual;
    }

    public void tirarFoto() {
        System.out.println("Foto tirada.");
    }

    public void fazerLigacao() {
        System.out.println("Ligação realizada.");
    }
    
    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada: " + mensagem);
    }
    
    public void navegarInternet() {
        System.out.println("Navegando na internet.");
    }
}