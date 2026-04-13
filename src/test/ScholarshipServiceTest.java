import org.junit.jupiter.api.Test;
import service.ScholarshipService;
import static org.junit.jupiter.api.Assertions.*;

public class ScholarshipServiceTest {

    ScholarshipService service = new ScholarshipService();

    @Test
    public void testEligible() {
        assertTrue(service.isEligible(300000, 80));
    }

    @Test
    public void testHighIncome() {
        assertFalse(service.isEligible(600000, 80));
    }

    @Test
    public void testLowMarks() {
        assertFalse(service.isEligible(300000, 60));
    }
}