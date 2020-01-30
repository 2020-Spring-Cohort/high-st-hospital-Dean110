public abstract class MedicalStaff extends Employee {
    public MedicalStaff(String name, int id) {
        super(name, id);
    }

    public abstract void treat(Patient patient);

    public void drawBlood(Patient patient){
        patient.giveBlood(1);
    }
}
