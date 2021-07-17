package daggerok;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Ng15AppTests {

    @Test
    public void contextLoads() {
        assertTrue("foo".equals("foo"));
    }

    @Test
    void test(){
        assertThat("foo").isEqualTo("foo");
    }
}