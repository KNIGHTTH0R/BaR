import java.util.*;

public class FlightObj {
	String airDepart; //airport that passengers are departing from
	String airArrival; //airport that passengers are flying to
	double departTime; //Arrival time
	double arrivalTime; //Departure time
	int numSeats; //number of seats available on airplane
 	String gate; //flight gate
	int flightNumber; //Flight Number

	//Constructors
	FlightObj(){
	}
	FlightObj(String _airDepart, String _airArrival, int _numSeats, String _gate, double _departTime, double _arrivalTime, int _flightNumber) {
		airDepart =  _airDepart; //airport that passengers are departing from
		airArrival =  _airArrival;
		numSeats =  _numSeats;
		flightNumber = _flightNumber;
		gate =  _gate; 
		arrivalTime = _arrivalTime;
		departTime = _departTime;
	}
  
	//getters
	public String getAirDepart(){
		return airDepart;
	}
	public String getAirArrival(){
		return airArrival;
	}
	public int getNumseats(){
		return numSeats;
	}
	public int getFlightNumber(){
		return flightNumber;
	}
	public String getGate(){
		return gate;
	}
	public double getDepartTime(){ 
		return departTime; 
	}
	public double getArrivalTime(){ 
		return arrivalTime;
	}
	
	//Setters
	public void setAirDepart(String airDepart){  
		this.airDepart = airDepart;
	}
	public void setAirArrival(String airArrival){ 
		this.airArrival = airArrival;
	}
	public void setNumseats(int numSeats){ 
		this.numSeats = numSeats;
 	}
	public void setFlightNumber(int flightNumber){
		this.flightNumber = flightNumber;
	}
	public void setGate(String gate){ 
		this.gate = gate;
	}
	public void setDepartTime(double departTime){ 
		this.departTime =  departTime; 
	}
	public void setArrivalTime(double arrivalTime){ 
		this.arrivalTime =  arrivalTime; 
	}
	
	//MAIN METHOD
	public static void main(String[] args){
	String[] arrivalAirports = {"MIAMI","NASHVILLE","CHARLOTTE","CHARLESTON","RICHMOND","NEWORLEANS","JACKSON"};
	String depAirport = "ATLANTA";
	int seats = 250;
	int[] flightNumbs = {1017, 2017, 3017, 4017, 5017, 6017, 7017};
	String gate = "C420";
	//--------------------------------------------
    //Departure and arrival time calculation
	//--------------------------------------------
    double[] startDeparture = new double[7];
    startDeparture[0] = 6.0;
    double[] arrivalTimes = new double[7];
    double[] flightTime = {2.0,1.1,1.25,1.17,1.5,1.6,1.0};
    for(int i=0;i == arrivalAirports.length;i++){
      arrivalTimes[i] = (startDeparture[i] + flightTime[i]);
      startDeparture[i+1] = startDeparture[i] + 2.0;  
    }
    
    //--------------------------------------------
    //Flight Generation and adding to ArrayList
    //--------------------------------------------
    FlightObj[] trip = new FlightObj[7];
    ArrayList<FlightObj> weeklyFlights = new ArrayList<FlightObj>();
    for(int i=0;i == arrivalAirports.length;i++){
    		trip[i].airDepart = depAirport;
    		trip[i].airArrival = arrivalAirports[i];
    		trip[i].departTime = startDeparture[i];
    		trip[i].arrivalTime = arrivalTimes[i];
    		trip[i].numSeats = seats;
    		trip[i].gate = gate;
    		trip[i].flightNumber = flightNumbs[i];
    		weeklyFlights.add(trip[i]);
    }
  }
}
