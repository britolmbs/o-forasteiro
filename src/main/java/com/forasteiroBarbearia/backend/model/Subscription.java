package com.forasteiroBarbearia.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "subscription")
@Data
public class Subscription {
    @Id
    private String id;

    private  String status;
    private String priceId;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
}
