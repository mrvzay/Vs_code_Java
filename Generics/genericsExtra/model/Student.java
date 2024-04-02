package genericsExtra.model;

import java.util.Random;

import genericsExtra.util.QueryItem;

public class Student implements QueryItem {

  private String name;
  private String course;
  private int yearStarted;

  protected static Random ranodm = new Random();

  private static String[] firstNames = { "Ann", "Bill", "Cathy", "John", "Tim" };
  private static String[] courses = { "C++", "Java", "Python" };

  public Student() {
    int lastNameIndex = ranodm.nextInt(65, 91);
    name = firstNames[ranodm.nextInt(5)] + " " + (char) lastNameIndex;
    course = courses[ranodm.nextInt(3)];
    yearStarted = ranodm.nextInt(2018, 2023);
  }

  @Override
  public String toString() {
    return "%-15s %-15s %d".formatted(name, course, yearStarted);
  }

  public int getYearStarted() {
    return yearStarted;
  }

  @Override
  public boolean matchFiledValue(String filedName, String value) {

    String fName = filedName.toUpperCase();
    return switch (fName) {
      case "NAME" -> name.equalsIgnoreCase(value);
      case "COURSE" -> course.equalsIgnoreCase(value);
      case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
      default -> false;
    };
  }
}
