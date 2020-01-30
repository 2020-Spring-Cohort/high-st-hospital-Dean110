public class Patient {
    private final String name;
    private int healthLevel = 10;
    private int bloodLevel = 10;
    public Patient(String name) {
        this.name = name;
    }

    public void feelBetter(int treatmentAmount) {
        healthLevel += treatmentAmount;
    }


    public void giveBlood(int amount) {
        bloodLevel -= amount;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    @Override
    public String toString() {
        return name+ " | Health Level: " + healthLevel + " | Blood Level: "+ bloodLevel;
    }
}
