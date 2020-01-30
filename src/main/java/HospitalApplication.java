public class HospitalApplication {
    public static void main(String[] args) {
        Employee testDoctor1 = new Doctor("Herb", 101, "Throat");
        Employee testDoctor2 = new Doctor("Bill", 102, "Family");
        Employee testNurse1 = new Nurse("Jackie", 103);
        Employee testReceptionist = new Receptionist("Mom", 109);
        Hospital highStreetHospital = new Hospital();
        highStreetHospital.hireEmployee(testDoctor1);
        highStreetHospital.hireEmployee(testDoctor2);
        highStreetHospital.hireEmployee(testNurse1);
        highStreetHospital.hireEmployee(new Janitor("Ben", 104));
        highStreetHospital.hireEmployee(testReceptionist);
        System.out.println("Welcome to High Street Hospital!");
        System.out.println("This is our staff's status:");
        System.out.println(highStreetHospital.listEmployeeStatuses());
        System.out.println();
        System.out.println("Our patient is:");
        System.out.println(highStreetHospital.getPatient());
        System.out.println();
        System.out.println("Our staff is treating their patient.");
        highStreetHospital.treatPatient();
        System.out.println("They feel better!");
        System.out.println();
        System.out.println("Our patient is:");
        System.out.println(highStreetHospital.getPatient());
        System.out.println();
        System.out.println("Time to draw blood for the lab work!");
        highStreetHospital.performBloodDraws();
        System.out.println("The patient has less blood than before...");
        System.out.println();
        System.out.println("Our patient is:");
        System.out.println(highStreetHospital.getPatient());
        System.out.println("Time to pay our staff!");
        highStreetHospital.payEmployees();
        System.out.println("The staff is much happier now!");
        System.out.println();
        System.out.println("This is our staff's status:");
        System.out.println(highStreetHospital.listEmployeeStatuses());
        System.out.println();
    }
}
