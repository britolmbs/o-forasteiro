package com.forasteiroBarbearia.backend.repository;

import com.forasteiroBarbearia.backend.model.Haircut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HaircutRepository extends JpaRepository<Haircut, String > {
}
