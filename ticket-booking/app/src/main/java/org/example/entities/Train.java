package org.example.entities;


import java.sql.Time;
import java.util.*;

public class Train {

    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String, String> stationTimes;
    private List<String> stations;

    public Train(){} // empty train constructor

    public Train(String newTrainId, String newTrainNo, List<List<Integer>> newSeats, Map<String, String> newStationTimes, List<String> newStations){
        this.trainId = newTrainId;
        this.trainNo = newTrainNo;
        this.seats = newSeats;
        this.stationTimes = newStationTimes;
        this.stations = newStations;
    }


    public List<String> getStation(){
        return this.stations;
    }
    
    public List<List<Integer>> getSeats(){
        return this.seats;
    }

    public void setSeats(List<List<Integer>> newSeats){
        this.seats = newSeats;
    }

    public String getTrainId(){
        return this.trainId;
    }
    
    public String getTrainNo(){
        return this.trainNo;
    }
    

    public Map<String,String> getStationTimes(){
        return this.stationTimes;
    }

    public void setTrainNo(String newTrainNo){
        this.trainNo = newTrainNo;
    }

    public void setTrainId (String newTrainId){
        this.trainId = newTrainId;
    }

    public void setStationTimes(Map<String,String> newStationTimes){
        this.stationTimes = newStationTimes;
    }

    public void setStation (List<String> newStation){
        this.stations = newStation;
    }

    public String getTrainInfo(){
        return String.format("Train Id : %s Train No : %s", this.trainId, this.trainNo);
    }
}

