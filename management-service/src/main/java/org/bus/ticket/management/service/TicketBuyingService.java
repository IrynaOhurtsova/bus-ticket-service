package org.bus.ticket.management.service;

import java.util.UUID;

public interface TicketBuyingService {

    UUID buyTicket(String firstName, String lastName, String patronymic, UUID journeyId);
}
