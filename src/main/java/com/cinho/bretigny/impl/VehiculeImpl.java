package com.cinho.bretigny.impl;

import com.cinho.bretigny.model.Vehicule;
import com.cinho.bretigny.repository.VehiculeRepo;
import com.cinho.bretigny.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehiculeImpl implements VehiculeService {

    @Autowired
    VehiculeRepo vehiculeRepo;
    @Override
    public Vehicule saveVehicule(Vehicule v) {
        return null;
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return null;
    }

    @Override
    public void deleteVehicule(Vehicule v) {

    }

    @Override
    public void deleteVehiculeById(Long id) {

    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return null;
    }
}
