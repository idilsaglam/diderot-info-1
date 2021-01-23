public class Test {

    public static void main(String[] args){
        Fruit f = new Fruit("pamplemousse",330);
        Fruit g = new Fruit("pamplemousse",330);
        Fruit h=f;
        System.out.println("Test termine");
        f.afficher();
        Fruit.hybridation(new Fruit("Pomme",10),new Fruit("Banane",2)).afficher();
    }
}


