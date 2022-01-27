package org.bus.ticket.management.mapper;

import org.bus.ticket.management.dto.TicketInformationDto;
import org.bus.ticket.management.entity.Journey;
import org.bus.ticket.management.entity.Ticket;
import org.bus.ticket.payment.entity.PaymentStatus;
import org.springframework.stereotype.Component;

@Component
public class ToTicketInformationDtoMapper {

    public TicketInformationDto mapToTicketInformationDto(Ticket ticket, Journey journey, PaymentStatus paymentStatus) {
        return TicketInformationDto.builder()
                .id(ticket.getId())
                .departureStation(journey.getDepartureStation())
                .destinationStation(journey.getDestinationStation())
                .freePlaces(journey.getFreePlaces())
                .price(journey.getPrice())
                .time(journey.getTime())
                .paymentStatus(org.bus.ticket.management.dto.PaymentStatus.valueOf(paymentStatus.toString()))
                .build();
    }
}
