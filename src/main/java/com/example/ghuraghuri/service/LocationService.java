package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Location;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationService {
    public Location newLocation(Location location);
    public List<Location> getAllLocations();
    public List<Location> findByOrderByNameAsc();
    public List<Location> findByOrderByNameDesc();
    List<Location> findByName(String name);
    List<Location> findByDivisionOrderByNameAsc(String division);
    List<Location> findByDivisionOrderByNameDesc(String division);
    List<Location> findByTypeOrderByNameAsc(String division);
    List<Location> findByTypeOrderByNameDesc(String division);
    List<Location> findByDivisionAndTypeOrderByNameAsc(String division, String type);
    List<Location> findByDivisionAndTypeOrderByNameDesc(String division, String Type);
    /*public List<Location> getLocationsSortDown();
    public List<Location> getLocationsSortUp();
    public List<Location> searchLocationsName(String name);
    public List<Location> searchLocationsDivision(String division);
    public List<Location> searchLocationsType();
    public List<Location> searchLocationsNameDivision();
    public List<Location> searchLocationsNameType();
    public List<Location> searchLocationsDivisionType();
    public List<Location> searchLocationsNameDivisionType();*/
}
