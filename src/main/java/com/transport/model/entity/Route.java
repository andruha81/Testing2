package com.transport.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int number;

    @Column(nullable = false)
    private String description;

    @Column(name = "start_weekday", nullable = false)
    private LocalTime startWeekday;

    @Column(name = "end_weekday", nullable = false)
    private LocalTime endWeekday;

    @Column(name = "interval_weekday", nullable = false)
    private LocalTime intervalWeekday;

    @Column(name = "start_dayoff", nullable = false)
    private LocalTime startDayoff;

    @Column(name = "end_dayoff", nullable = false)
    private LocalTime endDayoff;

    @Column(name = "interval_dayoff", nullable = false)
    private LocalTime intervalDayoff;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private TransportType type;

    @OneToMany(mappedBy = "route", fetch = FetchType.EAGER)
    private Set<Transport> transports;
}
