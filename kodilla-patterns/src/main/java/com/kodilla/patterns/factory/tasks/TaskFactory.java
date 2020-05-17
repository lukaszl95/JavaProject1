package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "ShoppingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String DRIVINGTASK = "DrivingTask";

    public Task makeTask (String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Diner", "Pizza", 4);
            case PAINTINGTASK:
                return new PaintingTask("Fence", "Brown", "Rail");
            case DRIVINGTASK:
                return new DrivingTask("Travel", "Warsaw", "Plane");
            default:
                return null;
        }
    }

}