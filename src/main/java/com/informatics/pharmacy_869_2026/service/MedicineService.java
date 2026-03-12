package com.informatics.pharmacy_869_2026.service;

import com.informatics.pharmacy_869_2026.data.entity.Medicine;
import com.informatics.pharmacy_869_2026.dto.CreateMedicineDto;
import com.informatics.pharmacy_869_2026.dto.MedicineDto;

import java.util.List;

public interface MedicineService {
    List<MedicineDto> getMedicines();

    Medicine getMedicineById(Long id);

    CreateMedicineDto createMedicine(CreateMedicineDto createMedicineDto);

    Medicine updateMedicine(Medicine medicine, Long id);

    void deleteMedicine(Long id);

    List<Medicine> findByNameStartingWith(String nameStart);
}
