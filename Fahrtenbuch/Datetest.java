/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fahrtenbuch;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Max_2
 */
public class Datetest {

    public static void main( String[] args )
  {
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat formater = new SimpleDateFormat();
    System.out.println( formater.format(cal.getTime()) ); // 14.07.05 18:28
  }
}
