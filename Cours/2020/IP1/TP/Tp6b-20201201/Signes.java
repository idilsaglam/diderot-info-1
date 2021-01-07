public class Signes {

    public static String sameSign(int[] tab1, int[] tab2){
	int[] res = new int[tab1.length];
	String result = "";
	for(int i=0; i<tab1.length; i++){
	    for(int j=0;j<tab2.length; j++){
		if(tab1[i] * tab2[j] < 0){
		    res[i] = -1;
		}else{
		    res[i]=1;
		}
	    }
	}
	for(int i=0; i<res.length; i++){
	    result+= res[i];
	}
	return result;

    }

    public static void main(String[] args) {
        System.out.println(sameSign(new int[]{1000,7,1,1,1},new int[]{-1,1,-1,-1000}));
	
    }
}
