import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee underTest;

    @BeforeEach
    void setUp() {
        underTest = new Employee("Bill", 101, "Heart");
    }

    @Test
    public void shouldInstantiateDr() {
        assertNotNull(underTest);
    }
    @Test
    public void doctorsSHouldMake90000(){
        int result = underTest.getPay();
        assertThat(result).isEqualTo(90000);
    }
    @Test
    public void doctorsShouldTreatPatientsInAPositiveWay(){
        Patient testPatient = new Patient("Bob");
        underTest.treat(testPatient);
        int healthLevel = testPatient.getHealthLevel();
        assertThat(healthLevel).isEqualTo(15);
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
        assertEquals("Name:         Bill | ID:  101 | Specialty:            Heart | Pay: $90000 | Has been paid: false", result);
    }
}
