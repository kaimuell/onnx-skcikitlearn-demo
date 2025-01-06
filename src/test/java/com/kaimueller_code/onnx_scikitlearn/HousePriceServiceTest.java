package com.kaimueller_code.onnx_scikitlearn;

import ai.onnxruntime.OrtException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HousePriceServiceTest {

    @Autowired
    HousePriceService service;

    @Test
    public void testHousePrice() throws OrtException {
        House house = new House();
        house.setLongitude(-122.55);
        house.setLatitude(37.59);
        house.setHousingMedianAge(31.0);
        house.setTotalRooms(1331.0);
        house.setTotalBedrooms(245.0);
        house.setPopulation(598.0);
        house.setHouseholds(225.0);
        house.setMedianIncome(4.1827);
        house.setOceanProximity("NEAR OCEAN");
        house.setRatioBedrooms(0.184072);
        house.setPeoplePerHousehold(2.657778);

        System.out.println(service.inferHousePrice(house));
    }

}