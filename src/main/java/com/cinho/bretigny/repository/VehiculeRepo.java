package com.cinho.bretigny.repository;

import com.cinho.bretigny.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepo extends JpaRepository<Vehicule, Long> {
}
