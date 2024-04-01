package interfacess;

public class Test {

  public static void main(String[] args) {

    inFlight(new Jet());

    // OrbitEarth.log("Testing " + new Satellite());

    // every line start or end writing a JDK8 <-- this means
    // enum next lectures, default, public, static and private methods
    // using in interfaces
    orbit(new Satellite()); // JDK8
  }

  private static void inFlight(FlighEnabled flier) {

    flier.takeOff();
    flier.transition(FlightStages.LAUNCH);
    flier.fly();
    if (flier instanceof Trackable tracked) {
      tracked.track();
    }
    flier.land();
  }

  private static void orbit(OrbitEarth flier) { // JDK 8

    flier.takeOff();
    flier.fly();
    flier.land();
  }
}
