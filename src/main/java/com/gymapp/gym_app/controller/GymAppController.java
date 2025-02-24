package com.gymapp.gym_app.controller;


import com.gymapp.gym_app.Models.Gym;
import com.gymapp.gym_app.Repository.GymRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GymAppController {
    @Autowired
    private GymRepository gymRepository;

    @Transactional
    @PostMapping("/addMember")
    public ResponseEntity<Map<String, String>> MemberEntry(@RequestBody Gym gym){
        Gym gymob = gymRepository.save(gym);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "Member Added");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/viewAllMembers")
    public ResponseEntity<List<Gym>> MemberList(){
        List<Gym> member = gymRepository.findAll();
        return ResponseEntity.ok(member);
    }

}
