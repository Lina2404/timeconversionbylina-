package API;

/*._....._.convert 12-hour AM/PM time format into  military (24-hour) time._....._.*/

//import packages to handle the date and time format 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {
	
    public static String convertToMilitaryTime(String time) {
    	
//input time in 12-hour format
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
            Date date = inputFormat.parse(time);
            
//time converted into 24-hour format     
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } 
        
        catch (ParseException e) {
            e.printStackTrace();
            return null; // Handle parsing errors
        }
    }

    public static void main(String[] args) {
//we can change input time from here to conver another time    	
        String inputTime = "04:28:35PM";
        String militaryTime = convertToMilitaryTime(inputTime);
        
//print the input time and converted miltry time 
        System.out.println("Input Time: " + inputTime);
        System.out.println("Military Time: " + militaryTime);
    }
}

