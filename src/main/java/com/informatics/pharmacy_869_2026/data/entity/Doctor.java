package com.informatics.pharmacy_869_2026.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.informatics.pharmacy_869_2026.data.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Doctor extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    private Set<Recipe> recipes;
}
