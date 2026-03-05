package com.informatics.pharmacy_869_2026.service;

import com.informatics.pharmacy_869_2026.data.entity.Medicine;

import java.util.List;

public interface MedicineService {
    List<Medicine> getMedicines();

    Medicine getMedicineById(Long id);

    Medicine createMedicine(Medicine medicine);

    Medicine updateMedicine(Medicine medicine, Long id);

    void deleteMedicine(Long id);
}
