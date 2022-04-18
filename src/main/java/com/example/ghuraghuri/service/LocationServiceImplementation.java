package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Location;
import com.example.ghuraghuri.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImplementation implements LocationService{

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    EntityManager entityManager;

    @Override
    public Location newLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> getLocationsSortDown() {
        ArrayList<Location> results = (ArrayList<Location>) entityManager.createNativeQuery("SELECT * FROM location ORDER BY location.name ASC").getResultList();
        return results;
    }

    @Override
    public List<Location> getLocationsSortUp() {
        ArrayList<Location> results = (ArrayList<Location>) entityManager.createNativeQuery("SELECT * FROM location ORDER BY location.name DESC").getResultList();
        return results;
    }

    @Override
    public List<Location> searchLocationsName(String name) {
        /*
        String query = "SELECT * FROM location WHERE name LIKE '%" + Name + "%' ORDER BY name ASC";
        List<Location> results = entityManager.createNativeQuery(query).getResultList();
        return results;
         */
        return locationRepository.findByNameContaining(name);
    }

    @Override
    public List<Location> searchLocationsDivision(String Division) {
        /*
        String query = "SELECT * FROM location WHERE division LIKE '%" + Division + "%' ORDER BY name ASC";
        List<Location> results = entityManager.createNativeQuery(query).getResultList();
        return results;
         */
        return locationRepository.findByDivisionContaining(Division);
    }

    @Override
    public List<Location> searchLocationsType() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> searchLocationsNameDivision() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> searchLocationsNameType() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> searchLocationsDivisionType() {
        return locationRepository.findAll();
    }

    @Override
    public List<Location> searchLocationsNameDivisionType() {
        return locationRepository.findAll();
    }
}
