import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Suma de metodos")
    void sum() {
        assertEquals(4,Calculator.sum(2,2));
    }

    @Test
    @DisplayName("Multiplicacion de metodos")
    void multi() {
        assertAll(
                ()->assertEquals(7,Calculator.multi(4,2)),
                ()->assertEquals(2,Calculator.multi(4,2)),
                ()->assertEquals(8,Calculator.multi(4,2))
        );

    }
}