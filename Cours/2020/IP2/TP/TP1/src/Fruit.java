public class Fruit {
    public String nom;
    public int poids;

    public Fruit(String n, int p) {
        nom = n;
        poids = p;
    }
    public void afficher(){
        System.out.println("Ce fruit est un(e) " + this.nom +" et pèse " + this.poids* 1000 + " grammes");
    }
    public static Fruit hybridation(Fruit f1, Fruit f2){
        String newName = f1.nom + f2.nom;
        int newPoids = f1.poids + f2.poids;
        return new Fruit(newName,newPoids);
    }

}
