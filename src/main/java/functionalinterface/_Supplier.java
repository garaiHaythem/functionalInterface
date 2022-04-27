package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

  public static void main(String[] args) {
    System.out.println("Using classic function");
    System.out.println(getPassword());
    System.out.println("Using Supplier function");
    System.out.println(getPasswordSupplier.get());

  }

  static String getPassword() {
    return "123456789";
  }

  static Supplier<String> getPasswordSupplier = () -> "123456789";
}
