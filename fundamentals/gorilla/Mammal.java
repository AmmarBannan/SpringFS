class Mammal{
    public int energy;
    public Mammal(int energy){
        this.energy=energy;
        // System.out.println("current energy is 100");
    }
    public void inenergy(int energy){
        this.energy+=energy;
    }
    public void denergy(int energy){
        this.energy-=energy;
    }
    public void displayEnergy(){
        System.out.println("current energy is :"+this.energy);
    }
    
}