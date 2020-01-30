public class Janitor extends Employee {
    private boolean isSweeping;

    public Janitor(String name, int id) {
        super(name, id);
        pay = 40000;
    }

    @Override
    public String getStatus() {
        return String.format("Name: %12s | ID: %4d | Pay: $%d | Has been paid: %5s | Is sweeping: %s", name, id,  pay, isPaid, isSweeping);
    }

    public void sweep() {
        isSweeping = true;
    }

    public boolean isSweeping() {
        return isSweeping;
    }

}
