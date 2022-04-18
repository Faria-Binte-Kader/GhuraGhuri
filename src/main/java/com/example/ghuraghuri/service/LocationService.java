package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Location;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationService {
    public Location newLocation(Location location);
    public List<Location> getAllLocations();
    public List<Location> getLocationsSortDown();
    public List<Location> getLocationsSortUp();
    public List<Location> searchLocationsName(String name);
    public List<Location> searchLocationsDivision(String division);
    public List<Location> searchLocationsType();
    public List<Location> searchLocationsNameDivision();
    public List<Location> searchLocationsNameType();
    public List<Location> searchLocationsDivisionType();
    public List<Location> searchLocationsNameDivisionType();
}
