package com.informatics.pharmacy_869_2026.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateMedicineDto {


    @NotBlank
    @Size(min = 5, max = 20, message = "Min 5, max 20")
    private String name;

    @DecimalMin(value = "0", message = "Price has to be greater than or equal to 0")
    private BigDecimal price;

    private LocalDate expirationDate;
}
