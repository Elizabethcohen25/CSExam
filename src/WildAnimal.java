public class WildAnimal {
    //step 8
    public int numberSpotted;
    public String animalName;
    public boolean isEndangered;

    public WildAnimal(int pnumberSpotted, String panimalName, boolean pisEndangered){
        numberSpotted=pnumberSpotted;
        animalName=panimalName;
        isEndangered=pisEndangered;
    }
    public void printInfo(){
        System.out.println("Spotted: "+"numberspotted");
        System.out.println("Name:"+"animalName");
        System.out.println("Endangered:"+"isEndangered");
    }
}
