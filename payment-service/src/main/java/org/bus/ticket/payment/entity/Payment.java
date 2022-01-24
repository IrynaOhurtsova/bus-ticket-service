package org.bus.ticket.payment.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private Double sum;
}
