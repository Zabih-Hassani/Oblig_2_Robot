public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)

        World todaysWorld = new World(122, false);
        Robot one = new Robot("Dancatron 2000", 80, 4000, "B-Bot");
        
        one.reportStatus();
        one.canWalkToThePark(todaysWorld);
        one.Club(todaysWorld);
        Robot robot_2= new Robot("Dancatron 4000",50,
             1500, "Spark-E");
        robot_2.reportStatus();
        robot_2.canWalkToThePark(todaysWorld);
        robot_2.Club(todaysWorld);   
        
        
        // Opprett to Robot-objekter
        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene

        // Sjekk om robotene kan gå til danseklubben
        // Sjekk om robotene kan gå til parken
    }
}
