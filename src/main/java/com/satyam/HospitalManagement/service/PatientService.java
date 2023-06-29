package com.satyam.HospitalManagement.service;

import com.satyam.HospitalManagement.model.City;
import com.satyam.HospitalManagement.model.Doctor;
import com.satyam.HospitalManagement.model.Patient;
import com.satyam.HospitalManagement.repository.DoctorRepo;
import com.satyam.HospitalManagement.repository.PatientRepo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    
    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private DoctorRepo doctorRepo;
    
    public ResponseEntity<String> addPatient(Patient patient) {
        String email = patient.getEmail();
        String phoneNumber = patient.getPhoneNumber();
        Patient patient1 = patientRepo.findByEmail(email);

        Patient patient2 = patientRepo.findByPhoneNumber(phoneNumber);
        if(patient1 != null || patient2 != null){
            return ResponseEntity.badRequest().body("Email or phone number already present");
        }

        patientRepo.save(patient);
        return ResponseEntity.ok("Patient added successfully");
    }

    public String suggestDoctor(Long patientId) {
        Patient patient = patientRepo.findById(patientId).get();
        String cityName = patient.getCity();
        if(!isCityExist(cityName)){
            return "We are still waiting to expand your location";
        }
        String symptom = patient.getSymptom();
        if(StringUtils.containsIgnoreCase(symptom,"ear") ||StringUtils.containsIgnoreCase(symptom,"nose") || StringUtils.containsIgnoreCase(symptom,"throat")){
            return doctorRepo.findBySpeciality("ENT");
        }
        if(StringUtils.containsIgnoreCase(symptom,"women reproductive") ||StringUtils.containsIgnoreCase(symptom,"Dysmenorrhea") || StringUtils.containsIgnoreCase(symptom,"pelvic")){
            return doctorRepo.findBySpeciality("Gynaecology");
        }
        if(StringUtils.containsIgnoreCase(symptom,"skin") ||StringUtils.containsIgnoreCase(symptom,"face") || StringUtils.containsIgnoreCase(symptom,"beauty")){
            return doctorRepo.findBySpeciality("Dermatology");
        }
        if(StringUtils.containsIgnoreCase(symptom,"bones")){
            return doctorRepo.findBySpeciality("Orthopedic");
        }
        return "There isn’t any doctor present at your location for your symptom";
    }

    public static boolean isCityExist(String cityName){
        for(City city: City.values()){
            if (city.name().equalsIgnoreCase(cityName)) {
                return true;
            }
        }
        return false;
    }
}
