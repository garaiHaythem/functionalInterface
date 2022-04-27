package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

  public static void main(String[] args) {
    // Function take one argument and produces one result
    int increment = incrementByOne(2);
    System.out.println(increment);
    System.out.println("----------");
    int increment2 = incrementFunctionByOne.apply(5);
    System.out.println(increment2);

    // BiFunction take two argument and produces one result
    System.out.println("incrementByOneAndMultiply : " + incrementByOneAndMultiply(4, 100));

    System.out.println("incrementByOneAndMultiplyBiFunction : " +incrementByOneAndMultiplyBiFunction.apply(4,100));


  } 
  

  static Function<Integer, Integer> incrementFunctionByOne =
      number -> number + 1;

  static int incrementByOne(int number) {
    return number + 1;
  }

  static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
      (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1)
          * numberToMultiplyBy;

  static int incrementByOneAndMultiply(int number, int numberToMultiplyBy) {
    return (number + 1) * numberToMultiplyBy;
  }

}
