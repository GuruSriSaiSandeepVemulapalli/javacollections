package Optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonRepositoryTest {

    PersonRepository personRepository = new PersonRepository();

    @Test
    public void whenIdIsNull_thenExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class,
                () ->
                        Optional
                                .ofNullable(personRepository.searchNameById(null))
                                .orElseThrow(IllegalArgumentException::new));
        System.out.println(personRepository.searchNameById(null));
    }

    @Test
    public void whenIdIsNonNull_thenNoExceptionIsThrown() {
        assertAll(
                () ->
                        Optional
                                .ofNullable(personRepository.searchNameById("id"))
                                .orElseThrow(RuntimeException::new));
        System.out.println(personRepository.searchNameById("id"));
    }

    @Test
    public void whenIdNonNull_thenReturnsNameUpperCase() {
        String name = Optional
                .ofNullable(personRepository.searchNameById("id"))
                .map(String::toUpperCase)
                .orElseThrow(RuntimeException::new);
        System.out.println(name);
        assertEquals("NAME", name);
    }
}
