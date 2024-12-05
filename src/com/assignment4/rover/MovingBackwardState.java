package com.assignment4.rover;

/**
 * Concrete state representing when the rover is moving backward
 * @author Morgan
 * @version 1.0
 */
class MovingBackwardState implements RoverState {
    private final MoonRover rover;

    public MovingBackwardState(MoonRover rover) {
        this.rover = rover;
    }

    @Override
    public void moveForward() {
        System.out.println("Changing direction to forward");
        rover.setState(new MovingForwardState(rover));
    }

    @Override
    public void moveBackward() {
        System.out.println("Already moving backward");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning left while moving backward");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning right while moving backward");
    }

    @Override
    public void stop() {
        System.out.println("Stopping from backward motion");
        rover.setState(new StoppedState(rover));
    }
}