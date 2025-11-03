package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class PhoneTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Phone(null));
    }

    @Test
    public void constructor_invalidPhone_throwsIllegalArgumentException() {
        String invalidPhone = "";
        assertThrows(IllegalArgumentException.class, () -> new Phone(invalidPhone));
    }

    @Test
    public void isValidPhone() {
        // null phone number
        assertThrows(NullPointerException.class, () -> Phone.isValidPhone(null));

        // invalid phone numbers
        assertFalse(Phone.isValidPhone("")); // empty string
        assertFalse(Phone.isValidPhone(" ")); // spaces only
        assertFalse(Phone.isValidPhone("phone")); // non-numeric
        assertFalse(Phone.isValidPhone("9011p041")); // alphabets within digits
        assertFalse(Phone.isValidPhone("++6512345678"));
        assertFalse(Phone.isValidPhone("+651--2345678")); // too many dashes
        assertFalse(Phone.isValidPhone("+65123456  78")); // too many spaces between blocks of numbers

        // valid phone numbers
        assertTrue(Phone.isValidPhone("91")); // less than 3 numbers
        assertTrue(Phone.isValidPhone("93121534"));
        assertTrue(Phone.isValidPhone("124293842033123")); // long phone numbers
        assertTrue(Phone.isValidPhone("+65 1234 5678"));
        assertTrue(Phone.isValidPhone("+1 123 1234 5678"));
        assertTrue(Phone.isValidPhone("+65-1234-5678"));
        assertTrue(Phone.isValidPhone("0912345678"));
        assertTrue(Phone.isValidPhone("0 9 1 2 3 4 5 6 7 8")); // spaces
    }

    @Test
    public void equals() {
        Phone phone = new Phone("12345678");

        // same values -> returns true
        assertTrue(phone.equals(new Phone("12345678")));

        // same object -> returns true
        assertTrue(phone.equals(phone));

        // null -> returns false
        assertFalse(phone.equals(null));

        // different types -> returns false
        assertFalse(phone.equals(5.0f));

        // different values -> returns false
        assertFalse(phone.equals(new Phone("87654321")));
    }
}
