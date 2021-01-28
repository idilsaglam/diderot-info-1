public class Main {


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
        if(a.sexe != b.sexe && a.faim<5 && b.faim<5){
            return new Animal(a.nom+b.nom,'',)
        }
    }

    public static void main(String[] args){
        //créer un zèbre mâle de 5 ans, pesant 300 kg s’appelant Marti
        Animal d = new Animal("Marti",'m',5*365,300,"zebre",0);

        //hippopotame femelle de 7 ans, d’une tonne et demie s’appelant Gloria
        Animal e = new Animal("Gloria",'f',7*365,1500,"hippopotame",0);

        //Pour diminiuer le poids de Gloria de 50 kg (Question 4)
        e.poids -= 50;

        //Question 5
        Animal a = new Animal("Melman",'m',1230,998,"girafe",0);
        Animal b = a;
        b.poids= 950;
        System.out.println("Questionn 5 = " + a.poids);
        //Réponse de question 5: Ce code change le poids de a avec le poids de b.

        Animal.description(new Animal("Rico",'m',1129,30,"manchot",0));
        Animal.descriptionBis(new Animal("Rico",'m',1129,30,"manchot",0));
        System.out.println(lePlusGros(
                new Animal[]{
                        new Animal("lolo",'f',300,20,"girafe",3),
                        new Animal("tutu",'m',2000,6500,"manchot",2),
                        new Animal("lala",'f',900,204,"zebre",5),
                }));
    }



}
