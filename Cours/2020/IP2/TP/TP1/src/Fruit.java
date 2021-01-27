public class Fruit {
    public String nom;
    public int poids;

    public Fruit(String n, int p) {
        nom = n;
        poids = p;
    }

    public static void afficher(Fruit f) {
        System.out.println(
                String.format(
                        "Ce fruit est un(e) %s et pèse %d grammes",
                        f.nom,
                        f.poids * 1000
                )
        );
    }

    public static Fruit hybridation(Fruit f1, Fruit f2) {
        String newName = f1.nom + f2.nom;
        int newPoids = f1.poids + f2.poids;
        return new Fruit(newName, newPoids);
    }

    @Override
    public String toString() {
        return String.format("Name: %s Poids: %d\n", this.nom, this.poids);
    }
}
