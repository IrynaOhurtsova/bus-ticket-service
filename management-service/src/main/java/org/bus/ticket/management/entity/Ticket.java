package org.bus.ticket.management.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Ticket {

    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private UUID journeyId;
}
