package composition;

public class Product {

  private String model;
  private String manufacturer;
  private int width;
  private int height;
  private int depth;

  public Product(String model, String manufacturer) {
    this.model = model;
    this.manufacturer = manufacturer;
  }

}

class Monitor extends Product {

  private int size;
  private String resolution;

  public Monitor(String model, String manufacturer) {
    super(model, manufacturer);
  }

  public Monitor(String model, String manufacturer, int size, String resolution) {
    super(model, manufacturer);
    this.size = size;
    this.resolution = resolution;
  }

  public void drawPixelAt(int x, int y, String color) {
    System.out.println(String.format(
        "Drawing pixle at %d,%d in color %s ", x, y, color));
  }

}

class Motherboard extends Product {

  private int ramSolots;
  private int cardSolots;
  private String bios;

  public Motherboard(String model, String manufacturer) {
    super(model, manufacturer);
  }

  public Motherboard(String model, String manufacturer, int ramSolots, int cardSolots, String bios) {
    super(model, manufacturer);
    this.ramSolots = ramSolots;
    this.cardSolots = cardSolots;
    this.bios = bios;
  }

  public void loadProgram(String programeName) {
    System.out.println("Program " + programeName + " is now loading...");
  }

}

class ComputerCase extends Product {

  private String powerSuplly;


  public ComputerCase(String model, String manufacturer) {
    super(model, manufacturer);
  }

  public ComputerCase(String model, String manufacturer, String powerSupply) {
    super(model, manufacturer);
    this.powerSuplly = powerSupply;
  }

  public void pressPowerButton() {
    System.out.println("Power button pressed");
  }
}
