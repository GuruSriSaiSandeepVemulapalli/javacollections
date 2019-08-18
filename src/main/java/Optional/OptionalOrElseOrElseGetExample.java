package Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OptionalOrElseOrElseGetExample {
    public static List<String> names = Arrays.asList("John", "Jones", "Kelly", "Cristina", "Raven");

    private static final Logger LOG = LoggerFactory.getLogger(OptionalOrElseOrElseGetExample.class);

    public String getRandomName() {
        LOG.info("getRandomName() method - start");
        Random random = new Random();
        int index = random.nextInt(5);
        LOG.info("getRandomName() method - end");
        return names.get(index);
    }

    public String getNameUsingOrElse(String name) {
        return Optional.ofNullable(name)
                .orElse(getRandomName());
    }

    public String getNameUsingOrElseGet(String name) {
        return Optional.ofNullable(name)
                .orElseGet(() -> getRandomName());
    }
}
