public class Nurse extends MedicalStaff {
    public Nurse(String name, int id) {
        super(name, id);
        this.pay = 50000;
    }

    @Override
    public String getStatus() {
        return String.format("Name: %12s | ID: %4d | Pay: $%d | Has been paid: %5s", name, id,  pay, isPaid);

    }

    @Override
    public void treat(Patient patient) {
        patient.feelBetter(1);
    }


}
