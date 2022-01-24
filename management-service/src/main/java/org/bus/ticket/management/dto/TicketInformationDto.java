package org.bus.ticket.management.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class TicketInformationDto {

    private String departureStation;
    private String destinationStation;
    private LocalTime time;
    private Double price;
    private Integer freePlaces;
    private PaymentStatus paymentStatus;

}
