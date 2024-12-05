package com.assignment4.rover;

/**
 * Interface defining all possible states and actions for the Moon Rover
 * @author Morgan
 * @version 1.0
 */
interface  RoverState {
    void moveForward();
    void moveBackward();
    void turnLeft();
    void turnRight();
    void stop();
}
