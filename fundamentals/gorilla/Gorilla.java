public class Gorilla extends Mammal{
    public Gorilla(int energy) {
		super(energy);
	}
    public void climb(){
        denergy(10);
        System.out.println("energy decrease by 10");
    }
    public void throwSomething(){
        denergy(5);
        System.out.println("energy decrease by 5");
    }
    public void eatBananas(){
        inenergy(10);
        System.out.println("energy increase by 10");
    }
}