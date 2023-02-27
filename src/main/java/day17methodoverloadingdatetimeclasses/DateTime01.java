package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);

        System.out.println(currentDate.getTime()); //1675108074290
                                                   // milliseconds from "January 1st 1970" to the "current time"


        //Type code to get current time in your local area

        LocalTime myTime= LocalTime.now();
        System.out.println(myTime); //01:05:21.072664800  ==> Current time ==> Hours:Minutes:Seconds:NanoSeconds

        //Type code to get current date in your local area

        LocalDate myDate=LocalDate.now();
        System.out.println(myDate); //2023-01-31

        //Type code to get current date and current time in your local area

        LocalDateTime myDateTime=LocalDateTime.now();
        System.out.println(myDateTime); //2023-01-31T01:09:03.561839800

        //How to get a specific component from  date and time
        System.out.println(myDate.getMonthValue()); //1
        System.out.println(myDate.getMonth());//JANUARY
        System.out.println(myDateTime.getDayOfWeek());//

        //How to get time in another zone
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-31T05:14:59.093231900
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Ashgabat"))); //2023-01-31T01:17:31.883596300

        // How to go future or past in date and time
        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12)); //2026-06-12
        System.out.println(myTime.minusHours(3).minusMinutes(20));

        //How to compare 2 dates
        LocalDate firstKidDoB=LocalDate.of(2005, 8, 23);
        LocalDate secondKidDoB=LocalDate.of(2011, 3, 11);
        boolean isAfter=firstKidDoB.isAfter(secondKidDoB); //False
        boolean isBefore=firstKidDoB.isBefore(secondKidDoB);//True

        System.out.println(isAfter);

        //How to format Date
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd:MM:yyyy");
        //M==> 1,2,3,4,5...10,11
        //MM==> 01,02,03...
        //MMM ==> Jan, Feb ,Mar...
        //MMMM ==> January, February, December...

        String formattedMyDate=dtf.format(myDate);
        System.out.println(formattedMyDate); //31:01:2023

        //How to format Time
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm a");//01:39
        //HH--> 24 hours system
        //hh--> 12 hours system
        //After time pattern leave a space put "a" to see AM or PM

        String formattedTime=dtf2.format(myTime);
        System.out.println(formattedTime);










    }
}
