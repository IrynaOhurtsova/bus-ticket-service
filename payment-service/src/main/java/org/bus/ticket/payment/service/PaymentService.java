package org.bus.ticket.payment.service;

import java.util.UUID;

public interface PaymentService {

    UUID buyTicket(String firstName, String lastName, String patronymic, Double sum);
}
