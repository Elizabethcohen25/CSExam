public class NationalPark {
    // step three
    public String parkName;
    public boolean RequiresParkPass;
    public int yearEstablished;

    public int randomInt;
    public double randomNum;

    public NationalPark wildAnimal;
    public NationalPark Secondsighting;
}


// step two
    // Public

    public static void main(String[] Args) {
        System.out.println("Hello World! Good Luck on your exams!");
        NationalPark greatOutdoors = new NationalPark();
    }

    // step three
    public NationalPark() {
        parkName = "Yellowstone";
        RequiresParkPass = true;
        yearEstablished = 1872;
        System.out.println("Welcome to " + parkName + "! It is " + RequiresParkPass + " that we are open. We were founded in " + yearEstablished + " ");
        yearEstablished = 1940;
        parkName = "Isle Royale";
        System.out.println("Welcome to " + parkName + "! It is " + RequiresParkPass + " that we are open. We were founded in " + yearEstablished + " ");

        randomInt();
        trailOfTheDay ("Greenstone Ridge");
        elevationMarkers();
        bearEncounterRisk();

    }
// Step 4

    public void randomInt () {
        randomInt=(int)(Math.random()*16 );
        System.out.println("you spun the wheel and you won campsite number "+ randomInt +" !");
    }
   // step 5
    public void trailOfTheDay(String trailName){
        System.out.println("Today trail of the day is " + trailName);
    }
    // step 6
public void elevationMarkers(){

}
// step 7
public void bearEncounterRisk(){
randomNum=Math.random();
    System.out.println();
    if (randomNum<0.3){
        System.out.println("Low risk of bears on the trail today");
        if (randomNum>=0.3&&randomNum<0.5){
            System.out.println("Moderate risk Stay alert and store food properly.");
            if(randomNum>=0.5&&randomNum<0.8){
                System.out.println("High Risk: Carry bear spray and make noise");
                if (randomNum>=0.8&&<1){
                    System.out.println("Extreme Risk! Avoid this area and report recent sightings!");
                }
            }
        }

//step 9
        WildAnimal = new NationalPark(2,"Grey Wolf", true)
                WildAnimal.printInfo();

        Secondsighting = new NationalPark(3,"Black Wolf",false)
                Secondsighting.printInfo();

}

}