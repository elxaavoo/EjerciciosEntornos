import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @Test
    void isPalindrome() {
        assertAll(
                ()->assertTrue(Palindromo.isPalindrome("dedo")),
                ()->assertTrue(Palindromo.isPalindrome("oloo.lo")),
                ()->assertTrue(Palindromo.isPalindrome("olo"))
        );

    }
}