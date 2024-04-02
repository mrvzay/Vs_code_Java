package genericsStudentsChallenge.model;

public class LPAStudent extends Student {

  private double percentComplete;

  public LPAStudent() {

    percentComplete = ranodm.nextDouble(0, 100.001);
  }

  @Override
  public String toString() {
    return "%s %8.1f%%".formatted(super.toString(), percentComplete);
  }

  public double getPercentComplete() {
    return percentComplete;
  }

  @Override
  public boolean matchFiledValue(String fieldName, String value) {

    if (fieldName.equalsIgnoreCase("percentComplete")) {
      return percentComplete <= Integer.parseInt(value);
    }

    return super.matchFiledValue(fieldName, value);
  }
}
