package controller;

import model.Student;
import service.ScholarshipService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scholarship")
public class ScholarshipController {

    ScholarshipService service = new ScholarshipService();

    @PostMapping("/check")
    public boolean checkEligibility(@RequestBody Student student) {
        return service.isEligible(student.getIncome(), student.getMarks());
    }
}