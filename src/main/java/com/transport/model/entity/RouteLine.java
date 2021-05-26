package com.transport.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "route_line")
public class RouteLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "stop_order", nullable = false)
    private int stopOrder;

    @Column(name = "time_prev", nullable = false)
    private LocalTime timePrev;

    @Column(name = "distance_prev", nullable = false)
    private int distancePrev;

    private int routeId;

    private int stopId;
}
