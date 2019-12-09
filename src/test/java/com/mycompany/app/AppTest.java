package com.mycompany.app;

import com.mycompany.app.App;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    int a = 3;

    /**
     * Rigorous Test :-)
     */

    @BeforeEach
    void pri() {
        System.out.println("Hello Jupiter!");
    }

    @Test
    void appTest1() {
        int pdt1 = App.calculator(8);
        assertEquals(64, pdt1);
        assertEquals(9, a * a );
        System.out.println("this is foo1");
    }

    @AfterEach
    void aftPri() {
        System.out.println("Bye Jupiter!");
    }
}
