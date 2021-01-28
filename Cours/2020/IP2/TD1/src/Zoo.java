public class Zoo {
    public String ville;
    public Enclos[] contenu;

    Zoo(String nom, int nombreEnclos, int tailleTab){
        ville = nom;
        contenu = new Enclos[nombreEnclos];
        for (int i = 0; i<contenu.length; i++) {
            contenu[i] = new Enclos(tailleTab, 0);
        }

    }

    //public static boolean ajouteEnclos(Animal animal,Zoo zoo){


    public static void nourrir(Zoo zoo){
        for (int i = 0; i < zoo.contenu.length; i++) {
            for (int j = 0; j < zoo.contenu[i].tabAnimal.length; j++) {
                if ( zoo.contenu[i].tabAnimal[j].faim > 5) {
                    zoo.contenu[i].tabAnimal[j].nourrir();
                }
            }
        }
    }
}
