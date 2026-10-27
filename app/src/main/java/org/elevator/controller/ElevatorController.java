package org.elevator.controller;

import org.elevator.model.Direction;
import org.elevator.model.Elevator;
import org.elevator.model.ElevatorState;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ElevatorController {
    private final Elevator elevator;
    private final NavigableSet<Integer> upStops = new TreeSet<>();
    private final NavigableSet<Integer> downStops = new TreeSet<>();

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
    }

    public void addStop(int floor) {
        if(floor > elevator.getCurrentFloor()) {
            this.upStops.add(floor);
        } else if (floor < elevator.getCurrentFloor()) {
            this.downStops.add(floor);
        } else {
            System.out.println("You're already at selected floor. Please select another floor");
        }
    }

    public Integer getNextStop() {
        if (upStops.isEmpty() && downStops.isEmpty()) {
            elevator.setElevatorState(ElevatorState.IDLE);
            elevator.setDirection(Direction.IDLE);
            return null;
        } else if (elevator.getDirection() == Direction.UP) {
            if (!upStops.isEmpty()) {
                return upStops.first();
            } else {
                elevator.setDirection(Direction.DOWN);
                return getNextStop();
            }
        } else if (elevator.getDirection() == Direction.DOWN) {
            if (!downStops.isEmpty()) {
                return downStops.last();
            } else {
                elevator.setDirection(Direction.UP);
                return getNextStop();
            }
        }

        return null;
    }
}