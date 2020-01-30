public class Doctor extends MedicalStaff {
    private String specialty;

    public Doctor(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
        pay = 90000;
    }

    @Override
    public void treat(Patient patient) {
        patient.feelBetter(5);
    }

    @Override
    public String getStatus() {
        return String.format("Name: %12s | ID: %4d | Pay: $%d | Has been paid: %5s | Specialty: %16s", name, id, pay, isPaid, specialty);
    }
}
