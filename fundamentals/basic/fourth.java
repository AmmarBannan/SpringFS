import java.lang.*;
	public class fourth{
	
	public static void fs(int[] x) {
		for(int y:x){
		System.out.println(y);
		}
}
	public static void ffs(int[] x) {
		int max=x[0];
		for(int y:x){
			if(max < y){max=y;
		}
		}
		System.out.println(max);
}
		public static void sth(int[] x) {
		int sum=0;
		for(int y:x){
			sum+=y;
		}
		int size=x.length;
		System.out.println(sum/size);
}
		public static void svth() {
		int[] y= new int[113];
		int i=0;
		int j=0;
		while(i<=255){
			if(i%2!=0){y[j]=i;j++;System.out.println(i);};
			i++;
		}
		
}
		public static void eth(int[] x,int z) {
		int i=0;
		for(int y:x){
			if(y>z)i++;
		}
		System.out.println(i);
		
}
		public static void nth(int[] x) {
			//for(int i:x){
			//i=i*i;
			//System.out.println(i);
		for(int i=0;i<length.x;i++){x[i]=x[i]*x[i];}
///////////////////////////////////////////
		//}
		for(int l:x){
			System.out.println(l);
		}
		
}
		public static void teth(int[] x) {
			for(int i:x){
			if(i>0)System.out.println(i);
		}

		
}
	public static void elth(int[] x) {
		int max=x[0];
		int min=x[0];
		int sum=0;int length=0;
		for(int y:x){
			sum+=y;
			if(max<y)max=y;
			if(min<y)min=y;
			length++;
		}	
		int avg=sum/length;
			
		System.out.println("max:"+max+"  min:"+min+"  avg:"+avg);
}
	public static void twth(int[] x) {
		int y=x[0];
		for(int i=0;i<x.length;i++){
			if(i==x.length-1){x[i]=y;}
			else{x[i]=x[i+1];}
			
		}
		for(int l:x){
			System.out.println(l);
		}					
}

	public static void main(String[] args) {
		int[] myArray={3,4,5,6,7,1,-1,3,32,-2,2,1,1,9,-4};
		fourth test = new fourth();
		//test.fs(myArray);
		//test.ffs(myArray);
		//test.sth(myArray);
		//test.svth();
		//test.eth(myArray,5);
		//test.nth(myArray);
		//test.teth(myArray);
		//test.elth(myArray);
		test.twth(myArray);		
	
	}
}
