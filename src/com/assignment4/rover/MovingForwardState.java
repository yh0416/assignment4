package com.assignment4.rover;


/**
 * Concrete state representing when the rover is moving forward
 * @author Morgan
 * @version 1.0
 */
public class MovingForwardState implements RoverState{
    private final MoonRover rover;

    public MovingForwardState(MoonRover rover) {
        this.rover = rover;
    }

    @Override
    public void moveForward() {
        System.out.println("Already moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Changing direction to backward");
        rover.setState(new MovingBackwardState(rover));

    }

    @Override
    public void turnLeft() {
        System.out.println("Turning left while moving forward");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning right while moving forward");
    }

    @Override
    public void stop() {
        System.out.println("Stopping from forward motion");
        rover.setState(new StoppedState(rover));
    }
}
