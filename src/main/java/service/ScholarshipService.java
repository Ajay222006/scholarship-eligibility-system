package service;

import org.springframework.stereotype.Service;

@Service
public class ScholarshipService {

    public boolean isEligible(double income, double marks) {
        return income < 500000 && marks >= 75;
    }
}