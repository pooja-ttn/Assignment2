package com.ttn.entity;

/*Question 9-
Create a class Address for Author with instance variables streetNumber, location, State.
*/

public class Address {
   private int streetNumber;
   private String location;
    private String state;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
