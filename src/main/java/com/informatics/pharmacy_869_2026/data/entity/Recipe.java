package com.informatics.pharmacy_869_2026.data.entity;

import com.informatics.pharmacy_869_2026.data.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Recipe extends BaseEntity {

    private LocalDate creationDate;

    @ManyToOne
    private Doctor doctor;
}
