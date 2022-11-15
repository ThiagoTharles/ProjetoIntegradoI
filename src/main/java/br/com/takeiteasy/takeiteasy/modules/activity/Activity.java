package br.com.takeiteasy.takeiteasy.modules.activity;
<<<<<<< HEAD
=======

import br.com.takeiteasy.takeiteasy.modules.clock.Timer;
>>>>>>> 59cc2dc1eec35f7e8a78740a0f96fc129e5f8bd5

import java.util.Timer;
/**
 * THis represents the model Activity 
 * allowing to retrieve and modify the data of model
 */
public class Activity {
    private String name;
    private Double hourAllocated;
    private Timer sumary;

    public Activity(String name, double hourAllocated) {
        this.name = name;
        this.hourAllocated = hourAllocated;
    }

    public Activity(String name, double hourAllocated, Timer sumary) {
        this.name = name;
        this.hourAllocated = hourAllocated;
        this.sumary = sumary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourAllocated() {
        return hourAllocated;
    }

    public void setHourAllocated(double hourAllocated) {
        this.hourAllocated = hourAllocated;
    }

    public Timer getSumary() {
        return sumary;
    }

    public void setSumary(Timer sumary) {
        this.sumary = sumary;
    }

}
