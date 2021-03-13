import java.lang.*;
	public class third{
	public void fs() {
		int i=0;int sum=0;
		while(i<255){
		sum+=i;
		i++;
		System.out.println("New number:"+ i+"sum:"+ sum);
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		third test = new third();
		test.fs();
	}
}