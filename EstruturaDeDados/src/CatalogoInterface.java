import java.util.ArrayList;

public interface CatalogoInterface {
    public void clear();
    public Integer count();
    public ArrayList<Veiculo> copiaLista(ArrayList<Veiculo> veiculos);
    public void addIfNotExists(Veiculo veiculo);
    public void nomeDaCorReverso(Veiculo veiculo);
    public String popLast();
}
