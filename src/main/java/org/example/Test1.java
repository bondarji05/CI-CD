
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();

        int result = calculator.summa(2, 3);

        assertEquals(5, result);
    }
}
