package org.bus.ticket.payment.service;

import org.bus.ticket.payment.entity.PaymentStatus;

import java.util.UUID;

public interface StatusService {

    PaymentStatus getStatusById(UUID paymentId);
}
