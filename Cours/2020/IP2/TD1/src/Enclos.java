public class Enclos {
    public Animal[] tabAnimal;
    public int population;
    Enclos (int maxSize, int population) {
        tabAnimal = new Animal[maxSize];
        this.population = population;
    }

    public static boolean ajouteAnimal(Animal a,Enclos enclos){
        if (enclos.tabAnimal.length > enclos.population) {
            enclos.tabAnimal[enclos.population] = a;
            enclos.population++;
            return true;
        }
        return false;
    }

}
