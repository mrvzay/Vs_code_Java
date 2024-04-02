package genericsExtra;

import java.util.ArrayList;
import java.util.List;

import genericsExtra.model.LPAStudent;
import genericsExtra.model.Student;
import genericsExtra.util.QueryItem;
import genericsExtra.util.QueryList;

record Employee(String name) implements QueryItem {

  @Override
  public boolean matchFiledValue(String fieldName, String value) {
    return false;
  }
}

public class Main {

  public static void main(String[] args) {

    int studentCount = 10;
    List<Student> students = new ArrayList<>();
    for (int i = 0; i < studentCount; i++) {
      students.add(new Student());
    }
    students.add(new LPAStudent());
    // printList(students);
    printMoreLists(students);

    List<LPAStudent> lpaStudents = new ArrayList<>();
    for (int i = 0; i < studentCount; i++) {
      lpaStudents.add(new LPAStudent());
    }
    // printList(lpaStudents);
    printMoreLists(lpaStudents);

    testLists(new ArrayList<>(List.of("Able", "Barry", "Charlie")));
    testLists(new ArrayList<>(List.of(1, 2, 3)));

    var queryList = new QueryList<>(lpaStudents);
    var matches = queryList.getMatches("Course", "Python");
    printMoreLists(matches);

    var students2021 = QueryList.getMatches(students, "YearStarted", "2021");
    printMoreLists(students2021);

    // QueryList<Employee> employeeList = new QueryList<>();
  }

  public static void printMoreLists(List<? extends Student> students) {

    for (var student : students) {
      System.out.println(student);
    }
    System.out.println();
  }

  public static void testLists(List<?> list) {

    for (var element : list) {
      if (element instanceof String s) {
        System.out.println("String: " + s.toUpperCase());
      } else if (element instanceof Integer i) {
        System.out.println("Integer: " + i.floatValue());
      }
    }
  }

  // public static void testLists(List<String> list) {

  // for (var element : list) {
  // System.out.println("String: " + element.toUpperCase());
  // }
  // }

  // public static void testLists(List<Integer> list) {

  // for (var element : list) {
  // System.out.println("Integer: " + element.floatValue());
  // }
  // }

  // public static <T extends Student> void printList(List<T> students) {

  // for (var student : students) {
  // System.out.println(student.getYearStarted() + ": " + student);
  // }
  // System.out.println();
  // }

}
