public class Enclos {
    public Animal[] tabAnimal;
    public int population;
    Enclos (int maxSize, int population) {
        tabAnimal = new Animal[maxSize];
        this.population = population;
    }

    public boolean ajouteAnimal(Animal a){
        if (tabAnimal.length > population) {
            tabAnimal[population] = a;
            population++;
            return true;
        }
        return false:
    }

}
