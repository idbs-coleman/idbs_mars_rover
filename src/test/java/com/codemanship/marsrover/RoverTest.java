package com.codemanship.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    void testRoverInitialised() {
        Rover rover = new Rover();
        assertEquals(5, rover.getX());
        assertEquals(6, rover.getY());
        assertEquals("N", rover.getDirection());
    }
}
