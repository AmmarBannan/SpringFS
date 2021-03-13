public class Bat extends Mammal{

    public Bat(int energy) {
        super(energy);
	}
    public void fly(){
        if(energy-50 < 0){
            System.out.println("you cant fly no energy lift!!");
        }
        else{
            denergy(50);
            System.out.println("energy decrease by 50");
        }
    }
    public void eatHumans(){
        inenergy(25);
        System.out.println("energy increase by 25");
    }
    public void attackTown(){
        if(energy-100 < 0){
            System.out.println("you cant attack no energy left!!");
        }
        else{
            denergy(100);
            System.out.println("energy increase by 100");
        }
    }
}