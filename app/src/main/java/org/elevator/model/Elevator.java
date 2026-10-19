package org.elevator.model;

public class Elevator {
    private final int elevatorId;
    private int currentFloor;
    private Direction direction;
    private ElevatorState state;

    public Elevator(int elevatorId, int currentFloor) {
        this.elevatorId = elevatorId;
        this.currentFloor = currentFloor;
    }
}
