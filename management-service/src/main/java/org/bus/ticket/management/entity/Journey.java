package org.bus.ticket.management.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Data
public class Journey {

    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID id;
    private String departureStation;
    private String destinationStation;
    private LocalTime time;
    private Double price;
    private Integer freePlaces;
}
