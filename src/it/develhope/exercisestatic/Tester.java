package it.develhope.exercisestatic;

/**
 * This class represent a tester
 *
 * @author Tania Ielpo
 */

public class Tester {

    public static void main(String [] args) {

        //declaration and creation of 2 employees
        Employee employee1, employee2;
        employee1=new Employee("Tania", "Ielpo", "via Dante,13");
        employee2=new Employee("Stefano","Rossi", "via Roma,23");


        
        //declaration and creation of 2 badges and relative association with employees
        Badge badge1, badge2;
        badge1= new Badge(employee1);
        //badge1.showBadgeDetails();
        badge2=new Badge(employee2);

        //printing of information
        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
