package org.elevator.controller;

import org.elevator.model.Elevator;

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
}