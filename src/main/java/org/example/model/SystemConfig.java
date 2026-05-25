package org.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component

public class SystemConfig {
    @Value("Bibabibo")
    private String name;

    public void branchName() {
        System.out.println("Branch Name: " + name);
    }
}