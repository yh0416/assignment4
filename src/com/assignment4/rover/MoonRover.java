package com.assignment4.rover;

/**
 * Main Moon Rover class that delegates all actions to its current state
 *
 * @author Morgan
 * @version 1.0
 */
public class MoonRover {
    private RoverState currentState;

    /**
     * Constructor initializes the rover in a stopped state
     */
    public MoonRover() {
        currentState = new StoppedState(this);
    }

    /**
            * Sets the current state of the rover
     * @param state The new state to set
     */
    public void setState(RoverState state) {
        this.currentState = state;
    }

    /**
     * Commands the rover to move forward
     */
    public void moveForward() {
        currentState.moveForward();
    }

    /**
     * Commands the rover to move backward
     */
    public void moveBackward() {
        currentState.moveBackward();
    }

    /**
     * Commands the rover to turn left
     */
    public void turnLeft() {
        currentState.turnLeft();
    }

    /**
     * Commands the rover to turn right
     */
    public void turnRight() {
        currentState.turnRight();
    }

    /**
     * Commands the rover to stop
     */
    public void stop() {
        currentState.stop();
    }

}
