public class Receptionist extends Employee {
    private boolean isAnsweringPhones;

    public Receptionist(String name, int id) {
        super(name, id);
        pay = 45000;
    }

    @Override
    public String getStatus() {
        return String.format("Name: %12s | ID: %4d | Pay: $%d | Has been paid: %5s | Is answering phones: %s",
                name, id,  pay, isPaid, isAnsweringPhones);
    }

    public void answerPhones() {
        isAnsweringPhones = true;
    }

    public boolean isAnsweringPhones() {
        return isAnsweringPhones;
    }
}
