public class Main {
    public static void main(String[] args){
        //créer un zèbre mâle de 5 ans, pesant 300 kg s’appelant Marti
        Animal a = new Animal("Zebre",'m',5,300,"Marti",0);

        //hippopotame femelle de 7 ans, d’une tonne et demie s’appelant Gloria
        Animal b = new Animal("hippo",'f',7,1500,"Gloria",0);

        //Pour diminiuer le poids de Gloria de 50 kg (Question 4 :))
        b.poids -= 50;
    }

    public static void description(Animal a){
        System.out.println("Je m'appelle" + a.nom + ", Je suis un" + a.espece + " " + a.sexe + ", j'ai" + ""+a.jours + " jours et je pese" + a.poids + " kg.");
    }

    // Exercice 7 yi yapmadim daha ona bakcam bir daha

    public static void nourrir(Animal a){
        if(a.faim > 1) {
            a.faim = a.faim - 1;
        }
    }

    public static int lePlusGros(Animal[] tab){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<tab.length; i++){
            if(tab[i].poids > max){
                max = tab[i].poids;
            }
        }
        return max;
    }

    //public static int reproduction(Animal a, Animal b){



}
