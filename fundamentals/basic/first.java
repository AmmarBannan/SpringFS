import java.lang.*;
	public class First{
	public void fs() {
		int i=0;
		while(i<255){
		System.out.println(i);
		i++;
		}
	}
	
	public static void main(String[] args) {
		First test = new First();
		test.fs();
	}
}