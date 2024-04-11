package com.cinho.bretigny.repository;

import com.cinho.bretigny.model.Reserver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserverRepo extends JpaRepository<Reserver, Long> {
}
