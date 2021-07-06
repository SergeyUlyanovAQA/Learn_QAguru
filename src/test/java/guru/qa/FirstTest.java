package guru.qa;

import org.junit.jupiter.api.*;

public class FirstTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach");
    }
    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }

    @Test
    void firstTest() {
        System.out.println("firstTest");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("secondTest");
        Assertions.assertTrue(true);
    }
}
