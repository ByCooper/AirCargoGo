package com.ByCooper.AirCargoGo.service;

import com.ByCooper.AirCargoGo.datatest.DataTest;
import com.ByCooper.AirCargoGo.model.Flight;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.ByCooper.AirCargoGo.datatest.DataTest.*;
import static org.junit.jupiter.api.Assertions.*;

class FilterCargoTest {

    @Test
    void TestGetTwoHourCargo() {
        //Actual data
        List<Flight> actual = FilterCargo.getTwoHourCargo(TOTAL_FLY);

        //Extend data
        List<Flight> extend = new ArrayList<>(List.of(FLY_TWO_HOUR_ONLY));

        //Result test
        assertArrayEquals(extend.toArray(), actual.toArray());
    }

    @Test
    void TestGetTwoHourStopover() {
        //Actual data
        List<Flight> actual = FilterCargo.getTwoHourStopover(TOTAL_FLY);

        //Extend data
        List<Flight> extend = new ArrayList<>(List.of(FLY_WITH_STOPOVER_ONE_TWO_HOUR,
                                                        FLY_WITH_TWO_SEGMENT));

        //Result test
        assertArrayEquals(extend.toArray(), actual.toArray());

    }

    @Test
    void TestGetTwoHourSeveralStopover() {
        //Actual data
        List<Flight> actual = FilterCargo.getTwoHourSeveralStopover(TOTAL_FLY);

        //Extend data
        List<Flight> extend = new ArrayList<>(List.of(FLY_WITH_STOPOVER_TWO_TWO_HOUR));

        //Result test
        assertArrayEquals(extend.toArray(), actual.toArray());

    }

    @Test
    void TestGetFlyWithoutStopover() {
        //Actual data
        List<Flight> actual = FilterCargo.getFlyWithoutStopover(TOTAL_FLY);

        //Extend data
        List<Flight> extend = new ArrayList<>(List.of(FLY_TWO_HOUR_ONLY));

        //Result test
        assertArrayEquals(extend.toArray(), actual.toArray());

    }

    @Test
    void TestGetFlyWithStopover() {
        //Actual data
        List<Flight> actual = FilterCargo.getFlyWithStopover(TOTAL_FLY);


        //Extend data
        List<Flight> extend = new ArrayList<>(List.of(FLY_WITH_STOPOVER_ONE_TWO_HOUR,
                                                        FLY_WITH_TWO_SEGMENT,
                                                        FLY_WITH_STOPOVER_TWO_TWO_HOUR));

        //Result test
        assertArrayEquals(extend.toArray(), actual.toArray());

    }
}