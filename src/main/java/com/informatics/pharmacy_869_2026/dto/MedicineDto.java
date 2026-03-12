package com.informatics.pharmacy_869_2026.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicineDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private LocalDate expirationDate;
}
