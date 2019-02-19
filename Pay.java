
package Pay;
import java.util.Scanner;

/**
 *
 * @author Sujal Shrestha
 * 
 */

public class Pay 

{
    public static void main(String[] args)

    {
        System.out.println( "Welcome to use the General Wage Record System\n\n" );
        
        //Declaring variables and constants
        final int N = 8;
        final double RATE_LEVEL_1 = 15.00;
        final double RATE_LEVEL_2 = 17.00;
        final double RATE_LEVEL_3 = 21.00;

        int i;
    
        int workedHours;
        int skillLevel = 0;
    
        double employeeWage = 0.00;
        double minEmployeeWage = Double.MAX_VALUE;
        double maxEmployeeWage = Double.MIN_VALUE;
        double averageWage = 0.00;
        double totalHours = 0.00;
        double totalWage = 0.00;

        String employeeName = null;
        String minWageEmployee = null;
        String maxWageEmployee = null;
        
        String below10 = "";
        String between10And20 = "";
        String above20 = "";
        
        String hourtrial1 = "";
        String hourtrial2 = "";
        String hourtrial3 = "";
        
        //input methods
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
    
    
        //loop for gathering employee details2
        
        for (i = 1; i <= N; i++)
        {
            do
            {
                System.out.printf("Enter the name of employee %d : ", i);
                employeeName = inputString.nextLine();

                if (employeeName.isEmpty())
                {
                    System.out.println("Error Employee Name cannot be blank");
                }
            }
            while (employeeName.isEmpty());


            do
            {
                System.out.printf( "Enter the skill level (1,2,3) of employee : " );
                skillLevel = inputNumber.nextInt();

                if(skillLevel < 1 || skillLevel > 3)
                {
                    System.out.println("Skill Level can be 1,2 or 3 only");
                }
            }
            while (skillLevel < 1 || skillLevel > 3);



            do {
                System.out.printf("Enter the worked hours (integer) of %s : ",employeeName);
                workedHours = inputNumber.nextInt();

                if (workedHours < 1) {
                    System.out.println("Working hours should be greater than 0");
                }
            }
            while (workedHours < 1);
            
            
            //Calculating employee wage
            if (workedHours > 0 && workedHours <= 40)
            {
                if (skillLevel == 1)
                {
                    employeeWage = workedHours * RATE_LEVEL_1;
                }

                else if (skillLevel == 2)
                {
                    employeeWage = workedHours * RATE_LEVEL_2;
                }

                else
                {
                    employeeWage = workedHours * RATE_LEVEL_3;
                }
            }

            else if (workedHours > 40)
            {
                if (skillLevel == 1)
                {
                    employeeWage = workedHours * RATE_LEVEL_1 + (workedHours - 40) * RATE_LEVEL_1 * 1.5;
                }
                else if (skillLevel == 2)
                {
                    employeeWage = workedHours * RATE_LEVEL_2 + (workedHours - 40) * RATE_LEVEL_2 * 1.5;
                }
                else
                {
                    employeeWage = workedHours * RATE_LEVEL_3 + (workedHours - 40) * RATE_LEVEL_3 * 1.5;
                }
            }

            else
            {
                System.out.println("Working hours should be greater than 0");
            }


            System.out.printf("The wage of employee %s (Level %d) for %d hours is $%.2f\n\n", employeeName, skillLevel, workedHours, employeeWage);
                
                
            
            //Calculating the total wage
            totalWage = totalWage + employeeWage;
            //Calculating the total worked hour
            totalHours = totalHours + workedHours;
            //Calculating the average worked hour
            averageWage = totalWage / N; 

            // Picking the minimum worked hours and the name of the employee
            if (employeeWage < minEmployeeWage)
            {
                minEmployeeWage = employeeWage;
                minWageEmployee = employeeName;
            }
                
            // Picking the maximum worked hours and the name of the employee
            if (employeeWage > maxEmployeeWage)
            {
            maxEmployeeWage = employeeWage;
            maxWageEmployee = employeeName;
            }        

            
            //Calculating number of employee who have worked less than 10 hours
            if (workedHours < 10)
            {
                below10 = below10 + "+";
            }
            //Calculating number of employee who have worked betwwen 10 and 20 hours
            else if (workedHours >= 10 && workedHours <= 20)
            {
                between10And20 = between10And20 + "+";
            }
            //Calculating number of employee who have worked more than 20 hours
            else
            {
                above20 = above20 + "+";
            }

        }

        //Outputs
        
        System.out.printf ( "     Statistical Information & Bar Chart\n" );
        System.out.printf ( "     -----------------------------------\n" );
        System.out.printf ( "     Minimum Wage: $%.2f , %s\n",minEmployeeWage,minWageEmployee);
        System.out.printf ( "     Maximum Wage: $%.2f , %s\n",maxEmployeeWage,maxWageEmployee);
        System.out.printf ( "     Average Wage: $%.2f\n\n\n",averageWage);

        System.out.printf ( "     Bar chart of the length of worked hours:\n");
        System.out.printf ( "     Number of employee worked hours less than 10:%s\n",below10);
        System.out.printf ( "     Number of employee worked hours between 10-20:%s\n",between10And20);
        System.out.printf ( "     Number of employee worked hours above 20:%s\n",above20);

        System.out.println("\nThank you for using the General Wage Record System");

        System.out.println("\nProgram written by 12043248");

    
    
    
    }
}
