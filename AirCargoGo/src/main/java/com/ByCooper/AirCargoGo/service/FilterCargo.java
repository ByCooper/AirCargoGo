package com.ByCooper.AirCargoGo.service;

import com.ByCooper.AirCargoGo.model.Flight;
import com.ByCooper.AirCargoGo.model.Segment;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCargo {
    /**
     * Метод фильтрует перевозки продолжительностью 2 часа
     * @param airCargo
     * @return Лист перелетов без остановки
     */

    public static List<Flight> getTwoHourCargo(List<Flight> airCargo) {
        return airCargo.stream()
                .filter(e -> e.getSegments().size() == 1)
                .filter(e -> totalTimeOfCargo(e.getSegments().get(0)) == 2)
                .collect(Collectors.toList());
    }

    /**
     * Метод фильтрует перевозки c одной наземной пересадкой/перегрузкой продолжительностью 2 часа
     * @param airCargo
     * @return Лист перелетов без остановки
     */

    public static List<Flight> getTwoHourStopover(List<Flight> airCargo) {
        return airCargo.stream()
                .filter(e -> e.getSegments().size() == 2)
                .filter(e -> totalTimeOfCargo(Segment.builder()
                        .departureDate(e.getSegments().get(0).getArrivalDate())
                        .arrivalDate(e.getSegments().get(1).getDepartureDate())
                        .build()) >= 2)
                .collect(Collectors.toList());
    }

    /**
     * Метод фильтрует перевозки c двумя наземными пересадкой/перегрузкой общей продолжительностью 2 часа
     * @param airCargo
     * @return Лист перелетов без остановки
     */

    public static List<Flight> getTwoHourSeveralStopover(List<Flight> airCargo) {
        return airCargo.stream()
                .filter(e -> e.getSegments().size() == 3)
                .filter(e -> (totalTimeOfCargo(Segment.builder()
                        .departureDate(e.getSegments().get(0).getArrivalDate())
                        .arrivalDate(e.getSegments().get(1).getDepartureDate())
                        .build()))
                        + totalTimeOfCargo(Segment.builder()
                        .departureDate(e.getSegments().get(1).getArrivalDate())
                        .arrivalDate(e.getSegments().get(2).getDepartureDate())
                        .build()) >= 2)
                        .collect(Collectors.toList());
    }

    /**
     * Метод фильтрует перевозки без пересадки/перегрузки
     * @param airCargo
     * @return Лист перелетов без остановки
     */
    public static List<Flight> getFlyWithoutStopover(List<Flight> airCargo) {
        return airCargo.stream()
                .filter(e -> e.getSegments().size() == 1)
                .collect(Collectors.toList());
    }
    /**
     * Метод фильтрует перевозки с пересадками/перегрузками
     * @param airCargo
     * @return Лист перелетов с остановкой
     */
    public static List<Flight> getFlyWithStopover(List<Flight> airCargo) {
        return airCargo.stream()
                .filter(e -> e.getSegments().size() >= 2)
                .collect(Collectors.toList());
    }

    private static int totalTimeOfCargo(Segment segment) {
        return (int) ChronoUnit.HOURS.between(segment.getDepartureDate(), segment.getArrivalDate());
    }
}
