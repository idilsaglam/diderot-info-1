import java.util.Arrays;

public class Test {

    public static void main(String[] args){
        Fruit f = new Fruit("pamplemousse",330);
        Fruit g = new Fruit("pamplemousse",330);
        Fruit h=f;
        System.out.println("Test termine");
        Fruit.afficher(f);
        Fruit.afficher(Fruit.hybridation(new Fruit("Pomme",10),new Fruit("Banane",2)));

        Panier.afficher(

                new Panier(new Fruit[]{
                        new Fruit("Pomme",20),
                        new Fruit("Poire",30)
                }
                )
         );
        System.out.println(Panier.hybridePanier(
                new Fruit("Banane",10),
                new Panier(new Fruit[]{
                        new Fruit("Ananas",40),
                        new Fruit("Poire",20),
                        new Fruit("Pomme",10)}
                )));
    }
}


