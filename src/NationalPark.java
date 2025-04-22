public class NationalPark {
    // step three
    public String parkName;
    public boolean RequiresParkPass;
    public int yearEstablished;

    public int randomInt;

    public int spinForCampsite();

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
    }
// Step 4

    public void randomInt () {
        randomInt=(int)(Math.random()*16 );
        System.out.println("you spun the wheel and you won campsite number "+ randomInt +" !");
    }
   // trailOfTheDay ();
    public void trailOfTheDay(String trailName){
        System.out.println("Today trail of the day is " + trailName);
    }
}