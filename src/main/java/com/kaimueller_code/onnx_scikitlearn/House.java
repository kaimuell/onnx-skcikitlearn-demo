package com.kaimueller_code.onnx_scikitlearn;

import ai.onnxruntime.OnnxTensor;
import ai.onnxruntime.OrtEnvironment;
import ai.onnxruntime.OrtException;

import java.util.HashMap;
import java.util.Map;


public class House {
    private double longitude;
    private double latitude;
    private double housingMedianAge;
    private double totalRooms;
    private double totalBedrooms;
    private double population;
    private double households;
    private double medianIncome;
    private double ratioBedrooms;
    private double peoplePerHousehold;
    private String oceanProximity;

    public Map<String, OnnxTensor> toTensorMap(OrtEnvironment env) throws OrtException {
        Map<String, OnnxTensor> map = new HashMap<>();
        map.put("longitude", OnnxTensor.createTensor(env, new double[][] {{longitude}}));
        map.put("latitude", OnnxTensor.createTensor(env, new double[][] {{latitude}}));
        map.put("housing_median_age", OnnxTensor.createTensor(env, new double[][] {{housingMedianAge}}));
        map.put("total_rooms", OnnxTensor.createTensor(env, new double[][] {{totalRooms}}));
        map.put("total_bedrooms",OnnxTensor.createTensor(env, new double[][] {{totalBedrooms}}));
        map.put("population", OnnxTensor.createTensor(env, new double[][] {{population}}));
        map.put("households", OnnxTensor.createTensor(env, new double[][] {{households}}));
        map.put("median_income", OnnxTensor.createTensor(env, new double[][] {{medianIncome}}));
        map.put("ratio_bedrooms", OnnxTensor.createTensor(env, new double[][] {{ratioBedrooms}}));
        map.put("people_per_household", OnnxTensor.createTensor(env, new double[][] {{peoplePerHousehold}}));
        map.put("ocean_proximity", OnnxTensor.createTensor(env, new String[][] {{oceanProximity}}));

        return map;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getTotalBedrooms() {
        return totalBedrooms;
    }

    public void setTotalBedrooms(double totalBedrooms) {
        this.totalBedrooms = totalBedrooms;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getHousingMedianAge() {
        return housingMedianAge;
    }

    public void setHousingMedianAge(double housingMedianAge) {
        this.housingMedianAge = housingMedianAge;
    }

    public double getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(double totalRooms) {
        this.totalRooms = totalRooms;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getHouseholds() {
        return households;
    }

    public void setHouseholds(double households) {
        this.households = households;
    }

    public double getMedianIncome() {
        return medianIncome;
    }

    public void setMedianIncome(double medianIncome) {
        this.medianIncome = medianIncome;
    }

    public double getRatioBedrooms() {
        return ratioBedrooms;
    }

    public void setRatioBedrooms(double ratioBedrooms) {
        this.ratioBedrooms = ratioBedrooms;
    }

    public double getPeoplePerHousehold() {
        return peoplePerHousehold;
    }

    public void setPeoplePerHousehold(double peoplePerHousehold) {
        this.peoplePerHousehold = peoplePerHousehold;
    }

    public String getOceanProximity() {
        return oceanProximity;
    }

    public void setOceanProximity(String oceanProximity) {
        this.oceanProximity = oceanProximity;
    }
}
