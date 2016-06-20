
package methods;

import java.util.Scanner;

public class Methods {
   
    public static void passorfail(float grade, String Name)
    {
        if (grade >= 70)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }


    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         System.out.println("please input the Grade:  ");
         
        passorfail(80,"Joe");
                      
        // TODO code application logic here
    }
}
