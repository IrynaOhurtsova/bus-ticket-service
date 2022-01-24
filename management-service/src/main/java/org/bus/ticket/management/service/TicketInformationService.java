package org.bus.ticket.management.service;

import org.bus.ticket.management.dto.TicketInformationDto;

import java.util.UUID;

public interface TicketInformationService {

    TicketInformationDto getTicketInformation(UUID ticketId);
}
