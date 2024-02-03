package com.ByCooper.AirCargoGo.service;

import com.ByCooper.AirCargoGo.model.Flight;

import java.util.List;

public class GetPrintResultFilterCargo {

    public static void getTwoHourCargo(List<Flight> airCargo) {
        System.out.println("Авиарейсы продолжительностью не более 2-х часов"
                + '\n'
                + "===================================================================================================="
                + '\n' + airCargo.toString());
    }
    public static void getTwoHourStopover(List<Flight> airCargo) {
        System.out.println("Авиарейсы с одной пересадкой продолжительностью не более 2-х часов"
                + '\n'
                + "===================================================================================================="
                + '\n' + airCargo.toString());
    }
    public static void getTwoHourSeveralStopover(List<Flight> airCargo) {
        System.out.println("Авиарейсы с двумя пересадками продолжительностью не более 2-х часов"
                + '\n'
                + "===================================================================================================="
                + '\n' + airCargo.toString());
    }
    public static void getFlyWithoutStopover(List<Flight> airCargo) {
        System.out.println("Авиарейсы без пересадок"
                + '\n'
                + "===================================================================================================="
                + '\n' + airCargo.toString());
    }
    public static void getFlyWithStopover(List<Flight> airCargo) {
        System.out.println("Авиарейсы с пересадками"
                + '\n'
                + "===================================================================================================="
                + '\n' + airCargo.toString());
    }
}
