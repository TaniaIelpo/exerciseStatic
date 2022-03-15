package it.develhope.exercisestatic;;
import java.util.Random;

/**
 * This class represent a badge
 *
 * @author Tania Ielpo
 */

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;


    /**
     * Creates a new badge
     * In it totalNumberOfEmployee is incremented thanks to the call to the static
     * method keepTrackOfEmployeesNumber()
     * @param employeeThatNeedsBadge employee who needs the badge
     */

    public Badge(Employee employeeThatNeedsBadge){
       Badge.keepTrackOfEmployeesNumber();
       this.employee=employeeThatNeedsBadge;
       this.badgeIdCode=this.generateBadgeIdCode();
    }


    /**
     * static method that increments totalNumberOfEmployees
     */
    private static void keepTrackOfEmployeesNumber(){

        Badge.totalNumberOfEmployees ++;
    }

    /**
     * this method generate a string that represent the employee badge
     * thanks to the call to the Random() method is possible to generate a random string
     * of 3 characters
     * @return return a string with 3 random characters concatenated to the name and surname and another
     * 3 random characters ( random characters are the same at both the beginning and the end of the string)
     */

    private String generateBadgeIdCode(){
        byte[] array=new byte[3];
        new Random().nextBytes(array);
        String myString=new String(array);
        return myString+ employee.name+employee.surname+myString;
    }

    /**
     * prints same information about the badge:
     * total badges created,
     * details of the employee
     * and the id of the badge
     */

    public void showBadgeDetails(){
        System.out.println("Total number of employee tracked by the badges are "+Badge.totalNumberOfEmployees);
        System.out.println("The employee: "+employee.getEmployeeDetails());
        System.out.println("The badge ID Code is: "+this.badgeIdCode);
    }
}
