package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.isAdult;
import static combinatorpattern.CustomerRegistrationValidator.isPhoneNumberValid;

public class
Main {

    public static void main(String[] args) {

        CustomerValidationService validationService = new CustomerValidationService();

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+01254650000",
                LocalDate.of(2000, 1, 1)
        );

/*        boolean valid = validationService.isValid(customer);
        System.out.println("Validation = " + valid);*/

        ValidationResult result = CustomerRegistrationValidator.isEmailValid().
                and(isPhoneNumberValid()).
                and(isAdult()).
                apply(customer);

        System.out.println(result);
    }

}
