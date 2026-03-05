package com.informatics.pharmacy_869_2026.service.impl;

import com.informatics.pharmacy_869_2026.data.entity.Medicine;
import com.informatics.pharmacy_869_2026.data.repository.MedicineRepository;
import com.informatics.pharmacy_869_2026.service.MedicineService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
// @RequiredArgsConstructor
public class MedicineServiceImpl implements MedicineService {


    private final MedicineRepository medicineRepository;

    @Override
    public List<Medicine> getMedicines() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine getMedicineById(Long id) {
        return medicineRepository.findById(id).orElseThrow(() -> new RuntimeException("Medicine not found"));
    }

    @Override
    public Medicine createMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public Medicine updateMedicine(Medicine medicine, Long id) {

        Medicine updatedMedicine = this.getMedicineById(id);
        updatedMedicine.setName(medicine.getName());
        updatedMedicine.setExpirationDate(medicine.getExpirationDate());
        return medicineRepository.save(updatedMedicine);
    }

    // TODO: Check what is Soft and Hard Delete
    public void deleteMedicine(Long id) {
        medicineRepository.deleteById(id);
    }


}
