package com.satyam.HospitalManagement.repository;

import com.satyam.HospitalManagement.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {
    Doctor findByEmail(String email);

    Doctor findByPhone(String phoneNumber);

    String findBySpeciality(String ent);
}
