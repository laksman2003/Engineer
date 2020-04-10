package com.test.automation;

import com.test.engineer.Engineer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This Class Automation Engineer Object
 * Extends from engineer Object
 */
public class AutomationEngineer extends Engineer {

    TestFramework framework;

     public AutomationEngineer(TestFramework framework)
     {
        super();
        this.framework = framework;
     }

     public AutomationEngineer (String firstName, String lastName, TestFramework framework)
     {
         super(firstName, lastName);
         this.framework = framework;
     }

     @Override
     public String sayHello()
     {
       String greetingMessage =  super.sayHello();
       greetingMessage = greetingMessage + "\n" +
               "My favorite test framework is "+this.framework.toString();

        return greetingMessage;
     }


    /**
     * This method compated two strings and ignores
     * Whitespace and case differences
     * @param str1
     * @param str2
     * @return
     */
     public boolean compareStrings(String str1, String str2)
     {
         str1 = str1.toLowerCase().replace(" ", "");
         str2 = str2.toLowerCase().replace(" ", "");

         return  str1.equals(str2);
     }

    /**
     * This method get the ordinal number of the daya of the week
     * @param dayName
     * @return
     */
     public int getDayOrdinalNumber(String dayName)
     {
         int ordinalNumber = -1;

         try
         {
             ordinalNumber = Days.valueOf(dayName.toUpperCase()).getValue();
             return  ordinalNumber;
         }
         catch(Exception e)
         {
             return ordinalNumber;
         }

     }

    /**
     * This method compares Two dates
     * @param d1
     * @param d2
     * @return
     */
     public String compareDates(LocalDate d1, LocalDate d2)
     {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd");
         String date1 = formatter.format(d1);
         String date2 = formatter.format(d2);

         if(d1.getYear()>d2.getYear())
         {
             return date1+" is greater than "+date2;
         }
         else if (d1.getYear()<d2.getYear())
         {
            return date2+" is greater than "+date1;
         }
         else
         {
            if(d1.getMonthValue()>d2.getMonthValue())
            {
                return date1+" is greater than "+date2;
            }
            else if(d1.getMonthValue()<d2.getMonthValue())
            {
                return date2+" is greater than "+date1;
            }
            else
            {
                if(d1.getDayOfMonth()>d2.getDayOfMonth())
                {
                    return date1+" is greater than "+date2;
                }
                else if(d1.getDayOfMonth()<d2.getDayOfMonth())
                {
                    return date2+" is greater than "+date1;
                }
                else
                {
                    return date1+" is equal to "+date2;
                }
            }
         }


     }
}
