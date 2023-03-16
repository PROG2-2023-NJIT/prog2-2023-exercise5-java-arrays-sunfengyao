package prog2.exercise5.flight.booking.system;


import java.time.LocalDate;
import java.util.Random;

import javax.print.attribute.standard.Destination;

import java.time.Period;


public class FlightBooking {
    private String flightCompany ="Flights-of-Fancy";
    static String flightID = " FOF0345IN";
    public static String passengerFallName[] = new String[3];
    public static String[] passengerGender = new String[3];
    public static int[] passengerAge = new int[3];
    public static TripSource tripSource;
    public static SourceAirport sourceAirport ;
    static TripDestination tripDestination;
    public static DestinationAirport destinationAirport;
    static LocalDate departureDate;
    static LocalDate returnDate;
    public static int childPassengers ;
    public static int adultPassengers ;
    public static int totalPassengers;
    public static double departingTicketPrice;
    public static double returnTicketPrice;
    private static BookingClass bookingClass;
    public static double totalTicketPrice;
    public static String[] ticketNumber = new String [3];
    public static TripType tripType;
    public static Object getBookingClass;
    public static double price;
    public static double price1;
    public static String a;
    public static String b;
    public static String random ;

    
    public double getprice(){
        return FlightBooking.price;
    }
    public void setprice(double p){
       FlightBooking.price = p;
        
    }
    public double getprice1(){
        return FlightBooking.price1;
    }
    public void setprice1(double p1){ 
       FlightBooking.price1 = p1; 
    }
    enum BookingClass{
    FIRST,Business,Economy;
    String BookingClass;
    }
    public void setBookingClass(String str){
    {
       if(str.equals("1"))
       FlightBooking.bookingClass = BookingClass.FIRST;
       if(str.equals("2"))
       FlightBooking.bookingClass = BookingClass.Business;
       if(str.equals("3"))
       FlightBooking.bookingClass = BookingClass.Economy;
    }
    }
    public BookingClass getBookingClass(){
        return bookingClass;
    }

    enum TripType {
        ONE_WAY,RETURN
    }
    public void setTripType(String str1){
       if(str1.equals("1"))
       FlightBooking.tripType = TripType.ONE_WAY;
       if(str1.equals("2")){
        FlightBooking.tripType = TripType.RETURN;
       }
    }
    public TripType getTripType(){
        return tripType;
    }

    enum TripSource{
    NANJING, BEIJING, SHANGHAI, Oulu, Helsinki, Paris
    }
    public void setTripSource(String str2){
       if(str2.equals("1"))
       FlightBooking.tripSource = TripSource.NANJING;
       if(str2.equals("2"))
       FlightBooking.tripSource = TripSource.BEIJING;
       if(str2.equals("3"))
       FlightBooking.tripSource = TripSource.Oulu;
       if(str2.equals("4"))
       FlightBooking.tripSource = TripSource.Helsinki;
    }
    public TripSource getTripSource(){
        return tripSource;
    }

    enum SourceAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport,ParisCharlesdeGaulleAirport
    } 
    public void setSourceAirport(String str2){
        if(str2.equals("1"))
        FlightBooking.sourceAirport = sourceAirport.NanjingLukouInternationalAirport;
        if(str2.equals("2"))
        FlightBooking.sourceAirport= sourceAirport.BeijingCapitalInternationalAirport;
        if(str2.equals("3"))
        FlightBooking.sourceAirport = sourceAirport.OuluAirport;
        if(str2.equals("4"))
        FlightBooking.sourceAirport = sourceAirport.HelsinkiAirport;
     }
     public SourceAirport getSourceAirport(){
         return sourceAirport;
     }
 

    enum TripDestination{
        Nanjing, BEIJING, Shanghai, Oulu, Helsinki, Paris
    }
    public void setTripDestination(String str2, String str3){
        if(str3.equals("1"))
        FlightBooking.tripDestination = TripDestination.Nanjing;
        if(str3.equals("2"))
        FlightBooking.tripDestination = TripDestination.BEIJING;
        if(str3.equals("3"))
        FlightBooking.tripDestination = TripDestination.Oulu;
        if(str3.equals("4"))
        FlightBooking.tripDestination = TripDestination.Helsinki;
     }
     public TripDestination getTripDestination(){
         return tripDestination;
     }

     enum DestinationAirport{
        NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport,ParisCharlesdeGaulleAirport
     }
     public void setDestinationAirport(String str2,String str3){
        if(str2.equals("1"))
        FlightBooking.sourceAirport = sourceAirport.NanjingLukouInternationalAirport;
        if(str2.equals("2"))
        FlightBooking.sourceAirport= sourceAirport.BeijingCapitalInternationalAirport;
        if(str2.equals("3"))
        FlightBooking.sourceAirport = sourceAirport.OuluAirport;
        if(str2.equals("4"))
        FlightBooking.sourceAirport = sourceAirport.HelsinkiAirport;
     }
     public DestinationAirport getDestinationAirport(){
         return destinationAirport;
     }
 
  

    public FlightBooking(int fb){
        int size = 3;
    }

    public void setPassengerFallName(int i, String string) {
    }

    
   

    public void setPassengerFullName(int i,String fallname){
            FlightBooking.passengerFallName[i] = fallname;
        
    }
    public String getPassengerFullName(int i){
        return  FlightBooking.passengerFallName[i];
    }


    public void setPassengerGender(int i,String gender){
        FlightBooking.passengerGender[i] = gender;
    }
    public String getPassengerGender(int i){
        return FlightBooking.passengerGender[i];
    }
    

    public void setPassengerAge(int i,int age){
        FlightBooking.passengerAge[i] = age;
    }
    public int getPassengerAge(int i){
        return FlightBooking.passengerAge[i];
    }


    public String getFlightCompany(){
        return flightCompany;
    } 
  
    public LocalDate getDepartingDate(){
        return FlightBooking.departureDate;
    }
    public void setDepartureDate(LocalDate d){
        FlightBooking.departureDate = d;
    }

    public LocalDate getReturnDate(){
        return FlightBooking.returnDate;
    }
    public void setReturnDate(LocalDate b){
        Period next = Period.between(departureDate,b);
        LocalDate p1 = b.plusDays(1);
        LocalDate p2 = b.plusDays(2);
        if(next.getDays() == 0){
            FlightBooking.returnDate = p2;
        }
        
        if(0< next.getDays() && next.getDays() <2){
            FlightBooking.returnDate = p1;
        }
        if(next.getDays() >2){
            FlightBooking.returnDate = b;
        }
    }

    public int getAdultPassengers(){
        return adultPassengers;
    }

    public int getChildrenPassengers(){
        return childPassengers;
    }

    public int getTotalPassengers(){
        return totalPassengers;
    }
    public void setTotalPassengers(int childPassengers,int adultPassengers){
       FlightBooking.totalPassengers = childPassengers+adultPassengers;
    }

    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(){
    FlightBooking.returnTicketPrice = departingTicketPrice;
    }

    public void setTotalTicketPrice( ){
        if(bookingClass.equals(BookingClass.FIRST)){
            double price1 = 250; 
            if(tripType.equals(TripType.RETURN)){
                FlightBooking.totalTicketPrice = departingTicketPrice+returnTicketPrice+price1*2;}
                if(tripType.equals(TripType.ONE_WAY)){
                    FlightBooking.totalTicketPrice = departingTicketPrice+price1;  
                    }
         }
         if(bookingClass.equals(BookingClass.Business)){
            double price1 = 150;  if(tripType.equals(TripType.RETURN)){
                FlightBooking.totalTicketPrice = departingTicketPrice+returnTicketPrice+price1*2;}
                if(tripType.equals(TripType.ONE_WAY)){
                    FlightBooking.totalTicketPrice = departingTicketPrice+price1;  
                    }
         }
         if(bookingClass.equals(BookingClass.Economy)){
            double price1 = 50;  if(tripType.equals(TripType.RETURN)){
                FlightBooking.totalTicketPrice = departingTicketPrice+returnTicketPrice+price1*2;}
                if(tripType.equals(TripType.ONE_WAY)){
                    FlightBooking.totalTicketPrice = departingTicketPrice+price1;  
                    }
         }
        
         
    }
    public double getTotalTicketPrice(){
        return totalTicketPrice;
    }

    public double getDepartingTicketPrice(){
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int childPassengers, int adultPassengers){
        if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Helsinki)){
           double price = 345; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * price;
          }
          if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Nanjing)){
           double price = 375; FlightBooking.departingTicketPrice = (childPassengers + adultPassengers) * price;
          }
      
    }


    public String getb(){
        return FlightBooking.b;
    }
   public void setb(String b1){
    FlightBooking.b = b1;
   }
    


   public void setTicketNumber(int i){
    for(int j = 0;j<3;j++){
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.FIRST)){
            a = "11F";
        }
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.Business)){
            a = "11B";
        }
        if(tripType.equals(TripType.ONE_WAY)&&bookingClass.equals(BookingClass.Economy)){
            a = "11E";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.FIRST)){
            a = "22F";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.Business)){
            a = "22B";
        }
        if(tripType.equals(TripType.RETURN)&&bookingClass.equals(BookingClass.Economy)){
            a = "22E";
        }
        if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Helsinki)){
            b = "DOM";
          }
        if(tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.NANJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Helsinki)||tripSource.equals(TripSource.BEIJING)&&tripDestination.equals(TripDestination.Oulu)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Helsinki)&&tripDestination.equals(TripDestination.Nanjing)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.BEIJING)||tripSource.equals(TripSource.Oulu)&&tripDestination.equals(TripDestination.Nanjing)){
             b = "INT";
        }
        String r =creatTnumber();
        String number1  = a + r + b; 
        FlightBooking.ticketNumber[j] = number1;
       }

    }

    public String getTicketNumber(int q ){
       
        return  FlightBooking.ticketNumber[q];
    }
        
    
    
   
    
    public void getb(String k1) {
    }
    public static String creatTnumber(){
        String codes="";
        Random r1 = new Random();
        for(int i=0;i<4;i++){
            int num = r1.nextInt(9);
			switch(num) {
			case 0:
            codes += r1.nextInt(10);
			break;
			case 1:
            char ch1 = (char)(r1.nextInt(26)+65);
				codes+=ch1;
				break;
			case 2:
            char ch2 = (char)(r1.nextInt(26)+97);
				codes += ch2;
				break;
			}
        }
        return codes;
    }
    
   
   



    
    

}

