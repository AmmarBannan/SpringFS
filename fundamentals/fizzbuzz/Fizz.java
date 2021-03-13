import java.lang.*;
	public class Fizz{
    public void calculateHypotenuse(int test) {
		if(test%3==0 && test%5==0){
		System.out.println("FizzBuzz");
		}

		else if(test%5==0){
		System.out.println("Fizz");
		}

		else if(test%3==0){
		System.out.println("Buzz");
		}
	}
	public static void main(String[] args) {
		Fizz get=new Fizz();
		get.calculateHypotenuse(15);

	}
}
	
