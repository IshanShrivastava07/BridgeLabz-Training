package com.bridgelabz.parkease;

public class ParkingSlot {

    private String slotId;
    private boolean occupied;
    private String allowedVehicle;

    public ParkingSlot(String slotId, String allowedVehicle) {
        this.slotId = slotId;
        this.allowedVehicle = allowedVehicle;
        this.occupied = false;
    }

    public boolean park(Vehicle vehicle) {
        if (!occupied && vehicle.getClass().getSimpleName().equals(allowedVehicle)) {
            occupied = true;
            return true;
        }
        return false;
    }

    public void leave() {
        occupied = false;
    }

    public boolean isFree() {
        return !occupied;
    }

    public String getSlotId() {
        return slotId;
    }
}

