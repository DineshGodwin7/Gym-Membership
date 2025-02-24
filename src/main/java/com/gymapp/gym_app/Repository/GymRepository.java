package com.gymapp.gym_app.Repository;

import com.gymapp.gym_app.Models.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<Gym, Long> {
}
