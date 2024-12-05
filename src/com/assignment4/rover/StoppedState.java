package com.assignment4.rover;

/**
 * Concrete state representing when the rover is stopped
 * @author Morgan
 * @version 1.0
 */
class StoppedState implements RoverState {
    private final MoonRover rover;

    public StoppedState(MoonRover rover) {
        this.rover = rover;
    }

    @Override
    public void moveForward() {
        System.out.println("Starting to move forward");
        rover.setState(new MovingForwardState(rover));
    }

    @Override
    public void moveBackward() {
        System.out.println("Starting to move backward");
        rover.setState(new MovingBackwardState(rover));
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning left while stopped");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning right while stopped");
    }

    @Override
    public void stop() {
        System.out.println("Already stopped");
    }
}

