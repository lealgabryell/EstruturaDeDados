public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Chevrolet", "Onix Premier", 2023, "Black", 4);
        Carro carro2 = new Carro("Mitsubish", "TR4", 2012, "Silver", 4);
        Carro carro3 = null;
        Motocicleta moto1 = new Motocicleta("Harley Davidson", "Modelo 1", 2023, "Golden", false);
        Motocicleta moto2 = new Motocicleta("Moto de resenha", "Modelo 2", 2021, "White", true);
        Catalogo c = new Catalogo();

        c.addIfNotExists(carro1);
        c.addIfNotExists(carro2);
        c.addIfNotExists(moto1);
        c.addIfNotExists(carro1);

        System.out.println(c.count());
        System.out.println(c.copiaLista(c.veiculos));
        System.out.println(c.popLast());
        c.nomeDaCorReverso(carro1);c.nomeDaCorReverso(carro3);
        c.addIfNotExists(moto2);
        System.out.println(c.copiaLista(c.veiculos));
        System.out.println(c.popLast());
        c.clear();
        System.out.println(c.copiaLista(c.veiculos));
    }
}