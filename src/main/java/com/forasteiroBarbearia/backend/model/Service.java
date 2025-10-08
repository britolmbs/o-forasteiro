package com.forasteiroBarbearia.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "services")
@Data
public class Service {

    @Id
    private String id;

    private String customer;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "haircut_id")
    private Haircut haircut;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
