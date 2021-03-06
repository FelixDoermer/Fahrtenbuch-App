package com.example.fahrtenbuch.db;


import java.util.Date;

public class FahrtItem extends ListObject {
    private Date rideStartTime;
    private String rideLocationStart;
    private String rideDestination;
    private int rideDistance;
    private int rideType;

    private int rideId;

    public FahrtItem(Date datum, int km, int rideType, int rideId) {
        this.rideStartTime = datum;
        this.rideDistance = km;
        this.rideType = rideType;
        this.rideId = rideId;
    }


    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public Date getDatum() {
        return rideStartTime;
    }

    public void setDatum(Date datum) {
        this.rideStartTime = datum;
    }

    public String getRideLocationStart() {
        return rideLocationStart;
    }

    public void setRideLocationStart(String rideLocationStart) {
        this.rideLocationStart = rideLocationStart;
    }

    public String getRideDestination() {
        return rideDestination;
    }

    public void setRideDestination(String rideDestination) {
        this.rideDestination = rideDestination;
    }

    public int getRideDistance() {
        return rideDistance;
    }

    public void setRideDistance(int rideDistance) {
        this.rideDistance = rideDistance;
    }

    public int getRideType() {
        return rideType;
    }

    public void setRideType(int rideType) {
        this.rideType = rideType;
    }

    @Override
    public int getType() {
        return TYPE_EINTRAG;
    }
}
