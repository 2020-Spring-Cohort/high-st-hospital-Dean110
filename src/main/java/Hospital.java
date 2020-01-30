import java.util.ArrayList;

public class Hospital {
    public ArrayList<Employee> employeeList = new ArrayList<>();
    public Patient patient = new Patient("BOB");


    public void hireEmployee(Employee demoEmployee) {
        employeeList.add(demoEmployee);
    }

    public String listEmployeeStatuses() {
        String statuses = "";
        for (Employee employee : employeeList) {
            statuses += employee.getStatus() + "\n";
        }
        return statuses.trim();
    }
    public void treatPatient(){
        for (Employee employee: employeeList) {
            if(employee instanceof MedicalStaff){
                ((MedicalStaff) employee).treat(patient);
            }
        }
    }

    public Patient getPatient() {
        return patient;
    }

    public void payEmployees() {
        for (Employee payee: employeeList){
            payee.receivePay();
        }
    }
}
