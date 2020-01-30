public class HospitalApplication {
    public static void main(String[] args) {
        Employee testDoctor1 = new Doctor("Herb", 101, "Throat");
        Employee testDoctor2 = new Doctor("Bill", 102, "Family");
        Employee testNurse1 = new Nurse("Jackie", 103);
        Hospital underTest = new Hospital();
        underTest.hireEmployee(testDoctor1);
        underTest.hireEmployee(testDoctor2);
        underTest.hireEmployee(testNurse1);
        underTest.hireEmployee(new Janitor("Ben", 104));
        testNurse1.receivePay();
        System.out.println("Welcome to High Street Hospital!");
        System.out.println("This is our staff's status:");
        System.out.println(underTest.listEmployeeStatuses());
    }
}
