import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    private MedicalStaff underTest;
    private Patient testPatient;

    @BeforeEach
    void setUp() {
        underTest = new Nurse("Jackie", 101);
        testPatient = new Patient("BOB");
    }

    @Test
    public void nurseTreatingAPatientShouldIncreaseHealth(){
        underTest.treat(testPatient);
        int result = testPatient.getHealthLevel();
        assertThat(result).isEqualTo(11);
    }
    @Test
    public void nurseDrawingBloodShouldLowerBloodLevelOfPatient(){
        underTest.drawBlood(testPatient);
        int result = testPatient.getBloodLevel();
        assertThat(result).isEqualTo(9);
    }

    @Test
    public void nurseShouldPrintStatus(){
        String result = underTest.getStatus();
        assertEquals("Name:       Jackie | ID:  101 | Pay: $50000 | Has been paid: false", result);
    }
}
