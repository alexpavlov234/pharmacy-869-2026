package com.informatics.pharmacy_869_2026.service.impl;


import com.informatics.pharmacy_869_2026.data.entity.Doctor;
import com.informatics.pharmacy_869_2026.data.repository.DoctorRepository;
import com.informatics.pharmacy_869_2026.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public List<Doctor> getDoctors() {
        return this.doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctor(long id) {
        return this.doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor with id=" + id + " not found!" ));
    }

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return this.doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor(Doctor doctor, long id) {
        return this.doctorRepository.findById(id)
                .map(doctor1 -> {
                    doctor1.setName(doctor.getName());
                    return this.doctorRepository.save(doctor1);
                }).orElseGet(()->
                        this.doctorRepository.save(doctor)
                );
    }

    @Override
    public void deleteDoctor(long id) {
        this.doctorRepository.deleteById(id);
    }
}
