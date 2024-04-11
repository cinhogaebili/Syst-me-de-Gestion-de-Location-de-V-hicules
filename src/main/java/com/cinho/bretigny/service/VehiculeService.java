package com.cinho.bretigny.service;

import com.cinho.bretigny.model.Vehicule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VehiculeService {
    Vehicule saveVehicule(Vehicule v);
    Vehicule updateVehicule(Vehicule v);
    void deleteVehicule(Vehicule v);
    void deleteVehiculeById(Long id);
    List<Vehicule> getAllVehicules();

}
