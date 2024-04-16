public class Televisao {

    private String marca;
    private String modelo;
    private String status;
    private int canal;
    private Integer senha;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Televisao(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.canal = 0;
        this.senha = null;
    }

    public Televisao(String marca, String modelo, Integer senha, int canal) {
        this.marca = marca;
        this.modelo = modelo;
        this.senha = senha;
        this.canal = canal;
        this.ligar();
    }

    public boolean isLigado() {
        return this.status.equals("ligado");
    }

    public boolean ligar() {
        if (this.modelo.equals("Smart TV") && this.senha != null) {
            this.status = "ligado";
            return true;
        }
        return false;
    }

    public void desligar() {
        this.status = "desligado";
    }

    public static void main(String[] args) {
        Televisao tv1 = new Televisao("Samsung", "Smart TV", 1234, 5);
        System.out.println("Status TV1: " + tv1.getStatus()); // Deve imprimir "ligado"

        Televisao tv2 = new Televisao("LG", "TV Simples");
        System.out.println("Status TV2: " + tv2.getStatus()); // Deve imprimir "desligado"
        tv2.ligar();
        System.out.println("Status TV2 após ligar: " + tv2.getStatus()); // Deve imprimir "desligado"
    }
}
