package com.assignment4.rover;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for the Moon Rover implementation
 * @author Morgan
 * @version 1.0
 */
public class MoonRoverTest {

    @Test
    public void testInitialState() {
        MoonRover rover = new MoonRover();
        // Initial state should be stopped
        rover.stop(); // Should print "Already stopped"
    }

    @Test
    public void testForwardMovement() {
        MoonRover rover = new MoonRover();
        rover.moveForward();
        rover.moveForward(); // Should print "Already moving forward"
        rover.stop();
    }

    @Test
    public void testStateTransitions() {
        MoonRover rover = new MoonRover();
        rover.moveForward();    // Stopped -> Moving Forward
        rover.moveBackward();   // Moving Forward -> Moving Backward
        rover.stop();          // Moving Backward -> Stopped
    }

    @Test
    public void testTurningWhileMoving() {
        MoonRover rover = new MoonRover();
        rover.moveForward();
        rover.turnLeft();
        rover.turnRight();
        rover.stop();
    }
}