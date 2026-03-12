package com.informatics.pharmacy_869_2026.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Medicine extends BaseEntity{
    private String name;

    private BigDecimal price;

    private LocalDate expirationDate;

}
