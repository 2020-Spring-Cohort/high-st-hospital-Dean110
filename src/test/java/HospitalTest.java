import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HospitalTest {

    @Test
    public void shouldPrintEmployeeStatuses() {
        Employee testDoctor1 = new Doctor("Herb", 101, "Throat");
        Employee testDoctor2 = new Doctor("Bill", 102, "Family");
        Employee testNurse1 = new Nurse("Jackie", 103);
        Patient testPatient = new Patient("BOB");
        Hospital underTest = new Hospital();
        underTest.hireEmployee(testDoctor1);
        underTest.hireEmployee(testDoctor2);
        underTest.hireEmployee(testNurse1);
        underTest.hireEmployee(new Janitor("Ben", 104));

        String result = underTest.listEmployeeStatuses();
        System.out.println(result);
        assertEquals("Name:         Herb | ID:  101 | Pay: $90000 | Has been paid: false | Specialty:           Throat\n" +
                "Name:         Bill | ID:  102 | Pay: $90000 | Has been paid: false | Specialty:           Family\n" +
                "Name:       Jackie | ID:  103 | Pay: $50000 | Has been paid: false\n"+
                "Name:          Ben | ID:  104 | Pay: $40000 | Has been paid: false | Is sweeping: false", result);
    }

}