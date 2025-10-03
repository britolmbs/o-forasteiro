package com.forasteiroBarbearia.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    private String id;

    private String name;
    private String email;
    private String endereco;
    private String password;
    private String stripe_customer_id;

    @Column(name = "created_at" , updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updateAt;

    @OneToMany(mappedBy = "user")
    private List<Haircut> haircuts;

    @OneToMany(mappedBy = "user")
    private List<Serice> serices;

    @OneToOne(mappedBy = "user")
    private Subscription subscription;
}
