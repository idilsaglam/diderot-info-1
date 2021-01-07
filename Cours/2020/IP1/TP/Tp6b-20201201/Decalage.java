public class Decalage {

    public static void  shift(int[] tab){
	int n=1;
	for(int i=0;i<1; i++){
	    int j;
	    int last;
	    last=tab[tab.length-1];

	    for(j=tab.length-1; j>0; j--){
		tab[j]=tab[j-1];
	    }
	    tab[0] = last;
	}
	System.out.println();
	System.out.println("Array after right rotation");
	for(int i=0; i<tab.length; i++){
	    System.out.print(tab[i] + " ");
	}
    }


    public static void main(String[] args) {
        shift(new int[]{1000,1,2,3});
    }
}
