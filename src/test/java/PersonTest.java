import org.junit.jupiter.api.Test;

import java.util.Optional;


class PersonTest {

    @Test
    void getAge() {
        Person person = new Person("asd", "ads");
        Optional<String> address = Optional.ofNullable(person.address);

        System.out.println(address.isPresent());

    }
}