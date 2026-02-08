package com.expensetracker.dto;

import com.expensetracker.enums.CategoryApplicableTo;

public class CategoryRequestDTO {

    private String name;
    private CategoryApplicableTo applicableTo;

    // Constructors
    public CategoryRequestDTO() {
    }

    public CategoryRequestDTO(String name, CategoryApplicableTo applicableTo) {
        this.name = name;
        this.applicableTo = applicableTo;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryApplicableTo getApplicableTo() {
        return applicableTo;
    }

    public void setApplicableTo(CategoryApplicableTo applicableTo) {
        this.applicableTo = applicableTo;
    }
}
