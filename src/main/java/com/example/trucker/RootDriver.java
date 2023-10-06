package com.example.trucker;

public class RootDriver {

    private double payRate;
    private double startTime;
    private double endTime;

    public RootDriver() {
        payRate = 0.0;
        startTime =0.0;
        endTime = 0.0;
    }

    public RootDriver(double rate, double start, double end) {
        this.payRate = rate;
        startTime = start;
        endTime = end;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }
}
