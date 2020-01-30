import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {

    private Doctor underTest;
    private Patient testPatient;

    @BeforeEach
    void setUp() {
        underTest = new Doctor("Bill", 101, "Heart");
        testPatient = new Patient("Bob");
    }

    @Test
    public void shouldInstantiateDr() {
        assertNotNull(underTest);
    }
    @Test
    public void doctorsShouldMake90000(){
        int result = underTest.getPay();
        assertThat(result).isEqualTo(90000);
    }
    @Test
    public void doctorsShouldTreatPatientsInAPositiveWay(){
        underTest.treat(testPatient);
        int healthLevel = testPatient.getHealthLevel();
        assertThat(healthLevel).isEqualTo(15);
    }
    @Test
    public void doctorsShouldBeAbleToDrawBlood(){
        underTest.drawBlood(testPatient);
        int bloodLevel = testPatient.getBloodLevel();
        assertThat(bloodLevel).isEqualTo(9);
    }
    @Test
    public void doctorShouldbePaid() {
        underTest.receivePay();
        assertTrue(underTest.isPaid());
    }
    @Test
    public void doctorShouldNotHaveReceivedPayOnCreation(){
        assertFalse(underTest.isPaid());
    }
    @Test
    public void doctorShouldPrintStatus(){
        String result = underTest.getStatus();
        assertEquals("Name:         Bill | ID:  101 | Pay: $90000 | Has been paid: false | Specialty:            Heart", result);
    }
}
