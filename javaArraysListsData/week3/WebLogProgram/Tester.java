
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
        // complete method
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog3-short_log");
        //la.printAll();
        //System.out.println(la.countUniqueIPsInRange(300,399));
        //la.printAllHigherThanNum(200);
        //la.uniqueIPVisitsOnDay("Sep 30");
        System.out.println(la.iPsWithMostVisitsOnDay(la.iPsForDays(),"Sep 30"));
    }
}
