package mylabs.mylab2;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPersonTest {

    @Test
    void testEquals() {
        EqualsVerifier.forClass(MyPerson.class).verify();
        MyPerson person = new MyPerson("foo", "bar", 42);
        assertEquals(person, MyPerson.fromJson(MyPerson.toJson(person)));
    }
}
