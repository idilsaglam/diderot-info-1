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

    public boolean ajouteEnclos(Animal animal){
        for (int i = 0; i<contenu.length; i++) {
            if (contenu[i].ajouteAnimal(animal)) {
                return true;
            }
        }
        return false;
    }

    public void nourrir(){
        for (int i = 0; i < contenu.length; i++) {
            for (int j = 0; j < contenu[i].tabAnimal.length; j++) {
                if ( contenu[i].tabAnimal[j].faim > 5) {
                    contenu[i].tabAnimal[j].nourrir();
                }
            }
        }
    }
}
