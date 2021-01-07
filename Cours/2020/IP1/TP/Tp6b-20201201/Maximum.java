public class Maximum {

    public static int max(int[] tab){
	int res=0;
	for(int i=0; i<tab.length;i++){
	    if(tab[i] > res){
		res=i;
	    }
	}
	return tab[res];
    }

    public static String  samesign(int[] t1, int[] t2){
	int[] res = new int[t1.length];
	String result="";
	for(int i=0; i<t1.length; i++){
	    for(int j=0; i<t2.length; i++){
		if(t1[i] * t2[j] < 0){
		    res[i]= -1;
		}else{
		    res[i]=1;
		}
	    }
	}
	for(int i=0; i<res.length; i++){
	    result+=res[i]
	}
	return res;
    }

    public static void main(String[] args) {
	System.out.println(max(new int[]{1000,7,1,1,1}));
	System.out.println(samesign(new int[] {1000,1,-1,1}, new int[]{-1,1,-1,-1000}));
    }
}
