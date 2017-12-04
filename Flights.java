import java.lang.reflect.Array;
import java.util.*;

public class Flights extends FlightObj{

  public static void main(String[] args){
    String[] arrivalAirports = {"MIAMI","NASHVILLE","CHARLOTTE","CHARLESTON","RICHMOND","NEWORLEANS","JACKSON"};
    String depAirport = "ATLANTA";
    int seats = 250;
    int[] flightNumbs = {1017, 2017, 3017, 4017, 5017, 6017, 7017};
    String gate = "C420";
    
    double[] startDeparture = new double[7];
    startDeparture[0] = 6.0;
    double[] arrivalTimes = new double[7];
    double[] flightTime = {2.0,1.1,1.25,1.17,1.5,1.6,1.0};
    for(int i=0;i == arrivalAirports.length;i++){
      arrivalTimes[i] = (startDeparture[i] + flightTime[i]);
      startDeparture[i+1] = startDeparture[i] + 2.0;  
    }

    ArrayList<FlightObj> weeklyFlights = new ArrayList();
    for(int i=0;i == arrivalAirports.length;i++){
     FlightObj trip = new FlightObj(depAirport, arrivalAirports[i], seats, flightNumbs[i], gate, startDeparture[i], arrivalTimes[i]){
    	 super(depAirport, )
     }
    }

  }
}
