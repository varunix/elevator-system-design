package org.elevator.model;

public class Elevator {
    private final int elevatorId;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    public Elevator(int elevatorId, int currentFloor) {
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
        this.direction = Direction.IDLE;
        this.state = ElevatorState.IDLE;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public ElevatorState getElevatorState() {
        return state;
    }

    public void setElevatorState(ElevatorState state) {
        this.state = state;
    }
}