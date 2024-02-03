package com.ByCooper.AirCargoGo;

import com.ByCooper.AirCargoGo.model.Flight;
import com.ByCooper.AirCargoGo.service.FilterCargo;
import com.ByCooper.AirCargoGo.service.FlightBuilder;
import com.ByCooper.AirCargoGo.service.GetPrintResultFilterCargo;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flight> airCargo = FlightBuilder.createFlights();
        System.out.println(airCargo);

        GetPrintResultFilterCargo.getTwoHourCargo(FilterCargo.getTwoHourCargo(airCargo));
        GetPrintResultFilterCargo.getFlyWithoutStopover(FilterCargo.getFlyWithStopover(airCargo));
        GetPrintResultFilterCargo.getFlyWithStopover(FilterCargo.getFlyWithStopover(airCargo));
        GetPrintResultFilterCargo.getTwoHourStopover(FilterCargo.getTwoHourStopover(airCargo));
        GetPrintResultFilterCargo.getTwoHourSeveralStopover(FilterCargo.getTwoHourSeveralStopover(airCargo));

        System.out.println(LocalDateTime.now());
    }
}
