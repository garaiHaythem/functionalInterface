package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationService {
    private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer) {
        return isValidEmail(customer.getEmail()) && isValidPhoneNumber(customer.getPhoneNumber()) && isAdult(customer.getDob());
    }

}
