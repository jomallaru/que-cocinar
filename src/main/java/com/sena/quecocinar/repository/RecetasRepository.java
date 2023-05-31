package com.sena.quecocinar.repository;

import com.sena.quecocinar.model.Recetas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecetasRepository extends JpaRepository <Recetas, Long>{


}
