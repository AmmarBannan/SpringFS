import java.lang.*;
	public class Second{
	public void fs() {
		int i=0;
		while(i<255){
		if(i%2!=0){
		System.out.println(i);}
		i++;
		}
	}
	
	public static void main(String[] args) {
		Second test = new Second();
		test.fs();
	}
}