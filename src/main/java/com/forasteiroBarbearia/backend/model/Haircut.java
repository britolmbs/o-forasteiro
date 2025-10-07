package com.forasteiroBarbearia.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "haircuts")
@Data
public class Haircut {

    @Id
    private String id;

    private String name;
    private  Double price;
    private Boolean status = true;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "haircut")
    private List<Service> services;
}
