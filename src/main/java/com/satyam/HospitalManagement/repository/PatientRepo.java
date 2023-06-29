package com.satyam.HospitalManagement.repository;

import com.satyam.HospitalManagement.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    Patient findByEmail(String email);

    Patient findByPhoneNumber(String phoneNumber);
}
