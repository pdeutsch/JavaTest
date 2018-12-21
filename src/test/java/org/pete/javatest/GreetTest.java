package org.pete.javatest;

import static org.junit.Assert.*;
import org.junit.Test;

public class GreetTest {
    Greet greet = new Greet();

    @Test
    public void test1() {
        String name = "Joel";
        String msg = greet.makeGreeting(name);

        assertTrue(msg.length() > name.length());
        assertTrue(msg.startsWith("HI"));
    }
}
