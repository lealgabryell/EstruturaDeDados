public class Motocicleta extends Veiculo {
    private boolean possuiBau;

    public Motocicleta(String marca, String modelo, int ano, String cor, boolean possuiBau) {
        super(marca, modelo, ano, cor);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }
}
