package com.example.ghuraghuri.controller;

import com.example.ghuraghuri.model.PlanLocation;
import com.example.ghuraghuri.service.PlanLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planLocation")
@CrossOrigin
public class PlanLocationController {
    @Autowired
    PlanLocationService planLocationService;

    @PostMapping("/add")
    public String addPlan(@RequestBody PlanLocation planLocation){
        planLocationService.newPlanLocation(planLocation);
        return "New Plan added";
    }

    @GetMapping("/getAll")
    public List<PlanLocation> getAllPlans(){
        return planLocationService.getAllPlanLocations();
    }
}
