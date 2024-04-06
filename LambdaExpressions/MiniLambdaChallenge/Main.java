package MiniLambdaChallenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

  public static void main(String[] args) {

    Consumer<String> printWords = new Consumer<String>() {

      @Override
      public void accept(String sentence) {
        String[] parts = sentence.split(" ");
        for (String part : parts) {
          System.out.println(part);
        }
      }
    };

    // Challenge 1
    Consumer<String> printWordsLambda = sentence -> {
      String[] parts = sentence.split(" ");
      for (String part : parts) {
        System.out.println(part);
      }
    };

    printWords.accept("Let's split this up into an array");
    printWordsLambda.accept("Let's split this up into an array");

    Consumer<String> printWordsLambdaForEach = sentence -> {
      String[] parts = sentence.split(" ");
      Arrays.asList(parts).forEach(s -> System.out.println(s));
    };

    printWordsLambdaForEach.accept("Let's split this up an array");

    Consumer<String> printWordsConcise = sentence -> {
      Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
    };

    printWordsConcise.accept("Let's split this up an array");

    // Challenge 2
    UnaryOperator<String> everySecondChar = source -> {
      StringBuilder returnVal = new StringBuilder();
      for (int i = 0; i < source.length(); i++) {
        if (i % 2 == 1) {
          returnVal.append(source.charAt(i));
        }
      }
      return returnVal.toString();
    };

    // Challenge 3
    System.out.println(everySecondChar.apply("1234567890"));

    // Challenge 5
    String result = everySecondCharacter(everySecondChar, "1234567890");
    System.out.println(result);

    // Challenge 6
    Supplier<String> iLoveJava = () -> "I love Java!";
    Supplier<String> iLoveJava2 = () -> {
      return "I love Java!";
    };

    // Challenge 7
    System.out.println(iLoveJava.get());
    System.out.println(iLoveJava2.get());

  }

  public static String everySecondChar(String source) {

    StringBuilder returnVal = new StringBuilder();
    for (int i = 0; i < source.length(); i++) {
      if (i % 2 == 1) {
        returnVal.append(source.charAt(i));
      }
    }
    return returnVal.toString();
  }

  // Challenge 4
  public static String everySecondCharacter(Function<String, String> func, String source) {

    return func.apply(source);
  }

}
