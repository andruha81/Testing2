package com.transport.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String model;

    @Column(name = "seat_num", nullable = false)
    private int seatNum;

    @Column(name = "drive_type", nullable = false)
    private String driveType;

    @Column(length = 5, precision = 2, nullable = false)
    private BigDecimal len;

    @Column(length = 5, precision = 2, nullable = false)
    private BigDecimal width;

    @Column(name = "door_num", nullable = false)
    private int doorNum;

    @Column(name = "battery_power")
    private int batteryPower;

    @Column(name = "car_num")
    private int carNum;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id")
    private TransportType transportType;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "route_id")
    private Route route;
}
