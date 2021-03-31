import com.company.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void addLeg() {
        Dog husky = new Dog("Husky", "White", 4);
        int actualOutput = husky.addLeg(1);
        assertEquals(5, actualOutput);
    }
}