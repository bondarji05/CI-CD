
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2 {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(9, 3);

        assertEquals(6, result);
    }
}
