import java.util.ArrayList;

public class Catalogo implements CatalogoInterface{
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    @Override
    public void clear(){
        if(!veiculos.isEmpty()){
            veiculos.clear();
        }else{
            System.out.println("Lista ja esta vazia!");
        }
    }
    @Override
    public Integer count(){
        int counter = 0;
        for (Veiculo c : veiculos){
            if(c instanceof Carro){
                counter++;
            }
        }
        return counter;
    }
    @Override
    public ArrayList<Veiculo> copiaLista(ArrayList<Veiculo> veiculos) {
        ArrayList<Veiculo> copia = new ArrayList<>(veiculos);
        return copia;
    }
    @Override
    public void addIfNotExists(Veiculo veiculo){
        if(!veiculos.contains(veiculo)){
            veiculos.add(0, veiculo);
        }else{
            System.out.println("Veiculo ja existe!");
        }
    }

    @Override
    public void nomeDaCorReverso(Veiculo veiculo){

        if(!(veiculo==null)) {
            for (Veiculo v : veiculos) {
                if (v.equals(veiculo)) {
                    StringBuilder stringBuilder = new StringBuilder(v.getCor());
                    System.out.println(stringBuilder.reverse());
                    break;
                }
            }
        }else{
            System.out.println("Veiculo nao existe!");
        }
    }

    @Override
    public String popLast(){
        String last = veiculos.get(0).toString();
        veiculos.remove(0);
        return last;
    }

}
