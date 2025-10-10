package com.forasteiroBarbearia.backend.repository;

import com.forasteiroBarbearia.backend.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, String > {
}
