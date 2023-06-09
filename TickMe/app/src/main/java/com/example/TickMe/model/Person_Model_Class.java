package com.example.TickMe.model;

//Model Class Represents JSON equivalent of JSON data in Database

import androidx.annotation.NonNull;

public class Person_Model_Class {
    public String Driver_Name;
    public String Passenger_Name;
    public String Driver_Location;
    public String Passenger_Location;
    public String patient;
    public String email;

    public String getDriver_Name()
    {
        return Driver_Name;
    }
    public String getPassenger_Name()
    {
        return Passenger_Name;
    }
    public String getDriver_Location()
    {
        return Driver_Location;
    }
    public String getPassenger_Location()
    {
        return Passenger_Location;
    }

    public Person_Model_Class(String Driver_Name, String Passenger_Name, String Driver_Location, String Passenger_Location )
    {
        this.Driver_Location = Driver_Location;
        this.Passenger_Location = Passenger_Location;
        this.Driver_Name = Driver_Name;
        this.Passenger_Name = Passenger_Name;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
