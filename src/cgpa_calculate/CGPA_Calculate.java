
package cgpa_calculate;

import java.util.Scanner;


public class CGPA_Calculate {

 
    public static void main(String[] args) {
        
        int mark;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        mark = sc.nextInt();

        if (mark >= 80 && mark <= 100) {
            System.out.println("Your grade is A+");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("Your grade is A");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("Your grade is A-");
        } else if (mark >= 50 && mark <= 59) {
            System.out.println("Your grade is B");
        } else if (mark >= 40 && mark <= 49) {
            System.out.println("Your grade is C");
        } else if (mark >= 0 && mark <= 39) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Your given data is incorrect");
        }
    }
        
    }
    

