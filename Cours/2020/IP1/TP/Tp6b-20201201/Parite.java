public class Parite{

    public static String sort(int[] tab){
	String result = "";
	int temp=0;
	for(int i=0; i<tab.length; i++){
	    for(int j=i+1; j<tab.length; j++){
		if(tab[i] > tab[j]){
		    temp=tab[i];
		    tab[i]=tab[j];
		    tab[j]=temp;
		}
	    }
	}
	for(int i=0;i< tab.length; i++){
	    result+=(tab[i] + " ");
	}
	return result;
     }

    public static void main(String[] args) {
	System.out.println(sort(new int[]{1,2,3,4,5,6,8,10}));
	System.out.println(sort(new int[]{10,2,6,3,1}));
    }
}
