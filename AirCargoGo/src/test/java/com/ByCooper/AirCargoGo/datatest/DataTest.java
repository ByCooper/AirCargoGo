package com.ByCooper.AirCargoGo.datatest;

import com.ByCooper.AirCargoGo.model.Flight;
import com.ByCooper.AirCargoGo.model.Segment;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DataTest {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    static Segment seg1 = Segment.builder()
            .departureDate(LocalDateTime.parse("2024-01-10 18:00", formatter))
            .arrivalDate(LocalDateTime.parse("2024-01-10 20:00", formatter))
            .build();

    static Segment seg2 = Segment.builder()
            .departureDate(LocalDateTime.parse("2024-01-10 22:00", formatter))
            .arrivalDate(LocalDateTime.parse("2024-01-10 23:00", formatter))
            .build();

    static Segment seg3 = Segment.builder()
            .departureDate(LocalDateTime.parse("2024-01-11 01:00", formatter))
            .arrivalDate(LocalDateTime.parse("2024-01-11 02:00", formatter))
            .build();

    static Segment seg4 = Segment.builder()
            .departureDate(LocalDateTime.parse("2024-01-11 03:00", formatter))
            .arrivalDate(LocalDateTime.parse("2024-01-11 06:00", formatter))
            .build();

    static Segment seg5 = Segment.builder()
            .departureDate(LocalDateTime.parse("2024-01-11 08:00", formatter))
            .arrivalDate(LocalDateTime.parse("2024-01-11 10:00", formatter))
            .build();

    public static final Flight FLY_TWO_HOUR_ONLY = Flight.builder()
            .segments((List.of(seg1)))
            .build();

    public static final Flight FLY_WITH_TWO_SEGMENT = Flight.builder()
            .segments((List.of(seg1, seg5)))
            .build();

    public static final Flight FLY_WITH_STOPOVER_ONE_TWO_HOUR = Flight.builder()
            .segments((List.of(seg1, seg2)))
            .build();

    public static final Flight FLY_WITH_STOPOVER_TWO_TWO_HOUR = Flight.builder()
            .segments((List.of(seg2, seg3, seg4)))
            .build();

    public static final List<Flight> TOTAL_FLY = new ArrayList<>(List.of(FLY_TWO_HOUR_ONLY,
                                                                            FLY_WITH_STOPOVER_ONE_TWO_HOUR,
                                                                            FLY_WITH_TWO_SEGMENT,
                                                                            FLY_WITH_STOPOVER_TWO_TWO_HOUR));
}
