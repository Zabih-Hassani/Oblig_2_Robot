public class Robot {
    private String name;
    private int batteryLevel;
    private int distancetoPark;
    private String botType;

    // gi robotten 4 attributter: name, batteryLevel, distancetoPark og botType
    public Robot(
        String name,
        int batteryLevel,
        int distancetoPark,
        String botType
    ){
        this.name=name;
        this.batteryLevel=batteryLevel;
        this.distancetoPark=distancetoPark;
        this.botType=botType;
    }
    public String getName(){return this.name;}
    public int getBatteryLevel(){return batteryLevel;}
    public int getDistancetoPark(){return this.distancetoPark;}
    public String getBotType(){return this.botType;}

    public void setName(String name){this.name=name;}
    public void setBatteryLevel(int batteryLevel){this.batteryLevel=batteryLevel;}
    public void setDistancetoPark(int distancetoPark){this.distancetoPark=distancetoPark;}
    public void setBotType(String botType){this.botType=botType;}

    public String reportStatus() {
        System.out.println("Name:------------ "+ this.name);
        System.out.println("BatteryLevel:---- "+ this.batteryLevel+"%");
        System.out.println("DistancetoPark:-- "+ this.distancetoPark);
        System.out.println("BotType:--------- "+ this.botType);
        System.out.println("Enheten---------- "+(batteryLevel*100)+ " meter bort fra parken.");
        // Metode for å rapportere statusen til robotten
        // Endre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
        // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
        // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
        return "";
        }

    public void canWalkToThePark(World world) {
        // Metode for å sjekke om roboten kan gå til parken basert på omgivelsene
        // System.out.println(navn + " sjekker om det er mulig å gå til parken...");
        // Sjekk om det regner
        if (!world.getIsRaining() && world.isSunday() && batteryLevel >1) {
            System.out.println("--------- RUNING ---------");
            System.out.println("Raining:--------- "+ world.getIsRaining());
            System.out.println("Sunday:---------- "+ world.isSunday());
            System.out.println("BatteryLevel:---- "+ this.batteryLevel +"%");
            System.out.println("--------------------------");
            System.out.println();
            System.out.println();
            // skriv ut hvorfor boten ikke kan gå i parken med System.out.println
        }
        // Sjekk om det er søndag. Kan bare gå i parken på søndager.
        // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken.
        else{
            System.out.println("--------- STOP ---------");
            System.out.println("Raining:--------- "+ world.getIsRaining());
            System.out.println("Sunday:---------- "+ world.isSunday());
            System.out.println("BatteryLevel:---- "+ this.batteryLevel +"%");
            System.out.println("--------------------------");
            System.out.println();
            System.out.println();
            }
    }


    // lag en metode som heter canDanceAtClub, som sjekker om boten kan være med på danseklubben
       // bottypen må være av type B-Bot (hint .equals)
       // En bot trenger minimum 50% batterikapasitet for å være med
       // Det kan ikke være mandag. Da er danseklubben stengt.

    public void Club(World world){
        if(botType.equals("B-Bot")&& batteryLevel>=50 && !world.isMonday()){
            System.out.println("--------- Dance ---------");
            System.out.println("Bottype:--------- "+ botType);
            System.out.println("Mandag:---------- "+ world.isMonday());
            System.out.println("BatteryLevel:---- "+ this.batteryLevel +"%");
        }
        else{
             System.out.println("-------Can not Dance -------");
            System.out.println("Bottype:--------- "+ botType);
            System.out.println("Mandag:---------- "+ world.isMonday());
            System.out.println("BatteryLevel:---- "+ this.batteryLevel +"%");
        }
    }
}
