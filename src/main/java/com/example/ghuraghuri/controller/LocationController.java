package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.Location;
import com.example.ghuraghuri.service.LocationService;
import com.example.ghuraghuri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.ws.rs.*;

import java.util.List;

@RestController
@RequestMapping("/location")
@CrossOrigin
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping("/add")
    public String addLocation(@RequestBody Location location){
        locationService.newLocation(location);
        return "New Location added";
    }

    @GetMapping("/getAll")
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }

    @GetMapping("/sortDown")
    public List<Location> getLocationsSortDown(){
        return locationService.getLocationsSortDown();
    }

    @GetMapping("/sortUp")
    public List<Location> getLocationsSortUp(){
        return locationService.getLocationsSortUp();
    }


    @GetMapping("/discoverSearchName/name")
    public ResponseEntity<List<Location>> searchLocationsName(@RequestParam String name){
        return new ResponseEntity<List<Location>>(locationService.searchLocationsName(name), HttpStatus.OK);
    }

    /*
    @GetMapping("/discoverSearchName")
    public List<Location> searchLocationsName(@QueryParam("name") String name){
        return locationService.searchLocationsName(name);
    }*/

    @GetMapping("/discoverSearchDivision/division")
    public ResponseEntity<List<Location>> searchLocationsDivision(@RequestParam String division){
        return new ResponseEntity<List<Location>>(locationService.searchLocationsDivision(division), HttpStatus.OK);
    }
}
