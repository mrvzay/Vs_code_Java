package genericsStudentsChallenge;

import java.util.Comparator;
import java.util.List;

import genericsStudentsChallenge.model.LPAStudent;
import genericsStudentsChallenge.model.LPAStudentComparator;
import genericsStudentsChallenge.util.QueryList;

public class Main {

  public static void main(String[] args) {

    QueryList<LPAStudent> queryList = new QueryList<>();
    for (int i = 0; i < 25; i++) {
      queryList.add(new LPAStudent());
    }

    System.out.println("Ordered");
    queryList.sort(Comparator.naturalOrder());
    printList(queryList);

    System.out.println("Matches");
    var matches = queryList
        .getMatches("PercentComplete", "50");
    matches.sort(new LPAStudentComparator());
    printList(matches);

    System.out.println("Matchess");
    var matchess = queryList.getMatches("Course", "Python");
    matchess.sort(new LPAStudentComparator());
    printList(matchess);

    System.out.println("Ordered");
    matches.sort(null);
    printList(matches);
    
    System.out.println("Orderedd");
    matchess.sort(null);
    printList(matchess);


  }

  public static void printList(List<?> students) {

    for (var student : students) {
      System.out.println(student);
    }
  }
}