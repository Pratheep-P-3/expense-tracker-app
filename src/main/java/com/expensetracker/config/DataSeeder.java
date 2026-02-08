package com.expensetracker.config;

import com.expensetracker.entity.Category;
import com.expensetracker.enums.CategoryApplicableTo;
import com.expensetracker.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class DataSeeder {

    /**
     * Seeds improved categories with proper applicability
     * Categories that make sense for BOTH types are marked as BOTH
     */
    @Bean
    public CommandLineRunner seedCategories(CategoryRepository categoryRepository) {
        return args -> {
            // Check if categories already exist
            if (categoryRepository.count() == 0) {
                List<Category> categories = Arrays.asList(
                        // BOTH - Can be personal or organizational
                        new Category("Transportation", CategoryApplicableTo.BOTH), // Personal commute OR business travel
                        new Category("Utilities", CategoryApplicableTo.BOTH), // Home OR office utilities
                        new Category("Subscriptions", CategoryApplicableTo.BOTH), // Personal Netflix OR business software
                        new Category("Insurance", CategoryApplicableTo.BOTH), // Personal health OR business liability
                        new Category("Education", CategoryApplicableTo.BOTH), // Personal courses OR employee training
                        new Category("Travel", CategoryApplicableTo.BOTH), // Vacation OR business trip
                        new Category("Meals & Dining", CategoryApplicableTo.BOTH), // Personal dining OR client meals
                        new Category("Equipment", CategoryApplicableTo.BOTH), // Personal laptop OR office equipment
                        new Category("Miscellaneous", CategoryApplicableTo.BOTH), // Catch-all
                        
                        // PERSONAL only
                        new Category("Groceries", CategoryApplicableTo.PERSONAL),
                        new Category("Healthcare", CategoryApplicableTo.PERSONAL),
                        new Category("Entertainment", CategoryApplicableTo.PERSONAL),
                        new Category("Clothing", CategoryApplicableTo.PERSONAL),
                        new Category("Personal Care", CategoryApplicableTo.PERSONAL),
                        new Category("Gifts", CategoryApplicableTo.PERSONAL),
                        new Category("Hobbies", CategoryApplicableTo.PERSONAL),
                        new Category("Pet Care", CategoryApplicableTo.PERSONAL),
                        new Category("Home Maintenance", CategoryApplicableTo.PERSONAL),
                        
                        // ORGANIZATIONAL only
                        new Category("Office Supplies", CategoryApplicableTo.ORGANIZATIONAL),
                        new Category("Marketing & Advertising", CategoryApplicableTo.ORGANIZATIONAL),
                        new Category("Professional Services", CategoryApplicableTo.ORGANIZATIONAL),
                        new Category("Payroll", CategoryApplicableTo.ORGANIZATIONAL),
                        new Category("Rent & Lease", CategoryApplicableTo.ORGANIZATIONAL),
                        new Category("Legal Fees", CategoryApplicableTo.ORGANIZATIONAL),
                        new Category("Taxes", CategoryApplicableTo.ORGANIZATIONAL)
                );

                categoryRepository.saveAll(categories);
                System.out.println("✓ " + categories.size() + " categories seeded successfully");
            } else {
                System.out.println("✓ Categories already exist, skipping seed");
            }
        };
    }
}
