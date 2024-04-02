package genericsExtra.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import genericsExtra.model.LPAStudent;
import genericsExtra.model.Student;

public class QueryList<T extends Student & QueryItem> {

  private List<T> items;

  public QueryList(List<T> items) {
    this.items = items;
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

    List<T> matches = new ArrayList<>();
    for (var item : items) {
      if (item.matchFiledValue(field, value)) {
        matches.add(item);
      }
    }

    return matches;
  }

  public void sort(Comparator<?> naturalOrder) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sort'");
  }

  public void add(LPAStudent lpaStudent) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

}
