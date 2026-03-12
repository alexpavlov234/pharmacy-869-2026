package com.informatics.pharmacy_869_2026.controller;


import com.informatics.pharmacy_869_2026.data.entity.Medicine;
import com.informatics.pharmacy_869_2026.service.MedicineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
@RequiredArgsConstructor
public class MedicineApiController {

    private final MedicineService medicineService;

    @GetMapping
    public List<Medicine> getMedicines(){
        return medicineService.getMedicines();
    }

    @GetMapping("/{id}")
    public Medicine getMedicineById(@PathVariable Long id){
        return medicineService.getMedicineById(id);
    }

    @PostMapping
    public Medicine createMedicine(@RequestBody Medicine medicine){
        return medicineService.createMedicine(medicine);
    }

    @PutMapping("/{id}")
    public Medicine updateMedicine(@RequestBody Medicine medicine, @PathVariable Long id) {
        return medicineService.updateMedicine(medicine, id);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicine(@PathVariable Long id) {
        medicineService.deleteMedicine(id);
    }

    @GetMapping("/by-name-starts/{nameStart}")
    public List<Medicine> findByNameStartingWith(@PathVariable String nameStart){
        return medicineService.findByNameStartingWith(nameStart);
    }
}
