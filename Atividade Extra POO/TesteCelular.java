public class TesteCelular {
    public static void main(String[] args) {
        
        Celular celular = new Celular("Galaxy S21", "Samsung", 128, 6.2, 4000);
        celular.carregarBateria();

        System.out.println("Bateria atual: " + celular.verificarBateria());
        celular.tirarFoto();
        
        celular.fazerLigacao();
        
        celular.enviarMensagem("Olá, como vai?");
        
        celular.navegarInternet();
    }
}