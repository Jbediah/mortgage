/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mortgage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author prime
 */
public class date 
{
    
    
    public static void main(String [] args)
    {
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/uuuu");
 /*       
        Date d= new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");



*/
        String date1 = "21/10/2019";
        
        String date2="20/10/2020";
        LocalDate date_1 =LocalDate.parse(date1,formatter);
        LocalDate date_2 =LocalDate.parse(date2,formatter);
        
        long daysBetween=ChronoUnit.DAYS.between(date_1, date_2);
        
        
       
        
        System.out.println(daysBetween);
       
    
}
}