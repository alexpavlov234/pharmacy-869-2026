package com.informatics.pharmacy_869_2026.data.repository;

import com.informatics.pharmacy_869_2026.data.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@SuppressWarnings("unused")
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    List<Medicine> findByName(String name);
    List<Medicine> findByNameStartsWith(String name);
}
