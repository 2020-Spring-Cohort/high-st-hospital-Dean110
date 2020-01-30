import java.util.Scanner;

public class HospitalApplication {
    private static Hospital highStreetHospital = new Hospital();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        hireEmployees();

        printWelcome();

        printEmployeeStatuses();

        printPatientStatus();

        printUserChoices();
        String choice = input.nextLine();
        while (!patientIsUntreatable()) {
            switch (choice) {
                case "Treat patient":
                    treatPatient();
                    printPatientStatus();
                    break;
                case "Draw Blood":
                    performBloodDraws();
                    printPatientStatus();
                    break;
                case "Pay Employees":
                    payEmployees();
                    printEmployeeStatuses();
                    break;
                default:
                    System.out.println("Enter again.");
            }
            printUserChoices();
            choice = input.nextLine();
        }
    }

    private static boolean patientIsUntreatable() {
        return highStreetHospital.getPatient().getHealthLevel() < 0 && highStreetHospital.getPatient().getHealthLevel()>50;
    }

    private static void printUserChoices() {
        System.out.println("Select: Treat patient | Draw Blood | Pay Employees");

    }

    private static void payEmployees() {
        System.out.println("Time to pay our staff!");
        highStreetHospital.payEmployees();
        System.out.println("The staff is much happier now!");
        System.out.println();
    }

    private static void treatPatient() {
        System.out.println("Our staff is treating their patient.");
        highStreetHospital.treatPatient();
        System.out.println("They feel better!");
        System.out.println();
    }

    private static void performBloodDraws() {
        System.out.println("Time to draw blood for the lab work!");
        highStreetHospital.performBloodDraws();
        System.out.println("The patient has less blood than before...");
        System.out.println();
    }

    private static void printPatientStatus() {
        System.out.println("Our patient is:");
        System.out.println(highStreetHospital.getPatient());
        System.out.println();
    }

    private static void printEmployeeStatuses() {
        System.out.println("This is our staff's status:");
        System.out.println(highStreetHospital.listEmployeeStatuses());
        System.out.println();
    }

    private static void printWelcome() {
        System.out.println("Welcome to High Street Hospital!");
        System.out.println("Home of No Vampire Janitors");
    }

    private static void hireEmployees() {
        Employee testDoctor1 = new Doctor("Herb", 101, "Throat");
        Employee testDoctor2 = new Doctor("Bill", 102, "Family");
        Employee testNurse1 = new Nurse("Jackie", 103);
        Employee testReceptionist = new Receptionist("Mom", 109);

        highStreetHospital.hireEmployee(testDoctor1);
        highStreetHospital.hireEmployee(testDoctor2);
        highStreetHospital.hireEmployee(testNurse1);
        highStreetHospital.hireEmployee(new Janitor("Ben", 104));
        highStreetHospital.hireEmployee(testReceptionist);
    }
}
