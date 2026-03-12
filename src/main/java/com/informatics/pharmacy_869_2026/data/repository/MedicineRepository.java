package com.informatics.pharmacy_869_2026.data.repository;

import com.informatics.pharmacy_869_2026.data.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    List<Medicine> findByNameStartingWith(String nameStart);
}
