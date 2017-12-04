public class FlightObj {
	String airDepart; //airport that passengers are departing from
	String airArrival; //airport that passengers are flying to
	double departTime; //Arrival time
	double arrivalTime; //Departure time
	int numSeats; //number of seats available on airplane
 	String gate; //flight gate
	int flightNumber; //Flight Number

	//Constructors
	FlightObj (String _airDepart, String _airArrival, int _numSeats, String _gate, double _departTime, double _arrivalTime, int _flightNumber) {
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
	public void setDepartTime(int departTime){ 
		this.departTime =  departTime; 
	}
	public void setArrivalTime(int arrivalTime){ 
		this.arrivalTime =  arrivalTime; 
	}
}
