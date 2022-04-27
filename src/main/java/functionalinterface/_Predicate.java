package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

  public static void main(String[] args) {
    System.out.println("Without predicate");
    System.out.println(isValidPhoneNumber("07000000000"));
    System.out.println(isValidPhoneNumber("09012345678"));
    System.out.println("With predicate");
    System.out.println(isValidPhoneNumberPredicate.test("07000000000"));
    System.out.println(isValidPhoneNumberPredicate.test("09012345678"));

  }

  static boolean isValidPhoneNumber(String phoneNumber) {
    return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
  }

  static Predicate<String> isValidPhoneNumberPredicate = phoneNumber ->
       phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}
