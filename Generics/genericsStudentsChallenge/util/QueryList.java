package genericsStudentsChallenge.util;

import java.util.ArrayList;
import java.util.List;


import genericsStudentsChallenge.model.Student;

public class QueryList<T extends Student & QueryItem> extends ArrayList<T> {

  // private List<T> items;

  public QueryList() {

  }

  public QueryList(List<T> items) {
    super(items);
    // this.items = items;
  }

  public static <S extends QueryItem > List<S> getMatches(List<S> items, String field, String value) {

    List<S> matches = new ArrayList<>();
    for (var item : items) {
      if (item.matchFiledValue(field, value)) {
        matches.add(item);
      }
    }

    return matches;
  }

  public List<T> getMatches(String field, String value) {

    QueryList<T> matches = new QueryList<>();
    for (var item : this) {
      if (item.matchFiledValue(field, value)) {
        matches.add(item);
      }
    }

    return matches;
  }

}
