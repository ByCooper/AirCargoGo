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
    static Segment seg1 = new Segment(LocalDateTime.parse("2024-01-10 18:00", formatter),
                                LocalDateTime.parse("2024-01-10 20:00", formatter));

    static Segment seg2 = new Segment(LocalDateTime.parse("2024-01-10 22:00", formatter),
                                LocalDateTime.parse("2024-01-10 23:00", formatter));

    static Segment seg3 = new Segment(LocalDateTime.parse("2024-01-11 01:00", formatter),
                                LocalDateTime.parse("2024-01-11 02:00", formatter));

    static Segment seg4 = new Segment(LocalDateTime.parse("2024-01-11 03:00", formatter),
                                LocalDateTime.parse("2024-01-11 06:00", formatter));

    static Segment seg5 = new Segment(LocalDateTime.parse("2024-01-11 08:00", formatter),
                                 LocalDateTime.parse("2024-01-11 10:00", formatter));

    public static final Flight FLY_TWO_HOUR_ONLY = new Flight(List.of(seg1));

    public static final Flight FLY_WITH_TWO_SEGMENT = new Flight(List.of(seg1, seg5));

    public static final Flight FLY_WITH_STOPOVER_ONE_TWO_HOUR = new Flight(List.of(seg1, seg2));

    public static final Flight FLY_WITH_STOPOVER_TWO_TWO_HOUR = new Flight(List.of(seg2, seg3, seg4));

    public static final List<Flight> TOTAL_FLY = new ArrayList<>(List.of(FLY_TWO_HOUR_ONLY,
                                                                            FLY_WITH_STOPOVER_ONE_TWO_HOUR,
                                                                            FLY_WITH_TWO_SEGMENT,
                                                                            FLY_WITH_STOPOVER_TWO_TWO_HOUR));
}
