package it.develhope.exercisestatic;

/**
 * This method represents an Employee
 *
 * @autor Tania Ielpo
 */

public class Employee {
    public String name;
    public String surname;
    public String address;

    /**
     * Creates a new employee
     * @param newEmployeeName Employee name
     * @param newEmployeeSurname Employee surname
     * @param newEmployeeAddress Employee address
     */

    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    /**
     * This method returns a String with employee details
     * @return the String with the employee details
     */


    public String getEmployeeDetails() {
        return "Employee "+
                "Name= " + name +
                ", Surname= " + surname +
                ", Address= " + address;
    }
}
