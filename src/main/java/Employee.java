public abstract class Employee {
    protected String name;
    protected int id;
    protected int pay;
    protected boolean isPaid;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;

    }
    public int getPay() {
        return pay;
    }

    public void receivePay() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public abstract String getStatus();
}
