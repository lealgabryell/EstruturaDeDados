import java.util.ArrayList;

public class Carro extends Veiculo{

    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, String cor, int numeroDePortas) {
        super(marca, modelo, ano, cor);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

}
