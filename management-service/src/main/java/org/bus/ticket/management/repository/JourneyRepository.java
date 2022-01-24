package org.bus.ticket.management.repository;

import org.bus.ticket.management.entity.Journey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JourneyRepository extends JpaRepository<Journey, UUID> {
}
