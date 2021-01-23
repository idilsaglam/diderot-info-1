public class Main {
    public static void main(String[] args){
        //créer un zèbre mâle de 5 ans, pesant 300 kg s’appelant Marti
        Animal a = new Animal("Zebre",'m',5,300,"Marti",0);

        //hippopotame femelle de 7 ans, d’une tonne et demie s’appelant Gloria
        Animal b = new Animal("hippo",'f',7,1500,"Gloria",0);

        //Pour diminiuer le poids de Gloria de 50 kg (Question 4 :))
        b.poids -= 50;
    }


    // Exercice 7 yi yapmadim daha ona bakcam bir daha


    public static int lePlusGros(Animal[] tab){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<tab.length; i++){
            if(tab[i].poids > max){
                max = tab[i].poids;
            }
        }
        return max;
    }

    public static Animal reproduction(Animal a, Animal b){
        if((a.sexe != b.sexe) && (a.espece.equals(b.espece)) && (a.faim < 5 && b.faim < 5)){

        }
    }


}
