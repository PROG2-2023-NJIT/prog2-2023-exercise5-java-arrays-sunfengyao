package prog2.exercise5.flight.booking.system;

/**
 * Hello world!
 *
 */

 import java.util.Scanner;

import prog2.exercise5.flight.booking.system.FlightBooking.TripSource;

import java.time.LocalDate;


public class Main 
{
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your fallname :");
        String passengerFullName =input.nextLine();
      

        

        FlightBooking fb = new FlightBooking(0);
        fb.setTotalPassengers( 0, 3);
        
       

        String flightCompany = fb.getFlightCompany();
        LocalDate departureDate = fb.getDepartingDate();
        LocalDate returnDate1 = fb.getReturnDate();
        int totalPassengers = fb.getTotalPassengers();
        double totalTicketPrice = fb.getTotalTicketPrice();
    
    
    
    System.out.println("请输入三位乘客的姓名：");
    System.out.println("请输入三位乘客的性别：");
    System.out.println("请输入三位乘客的年龄：");
    Scanner n1 =new Scanner(System.in);
    String[] fallname = new String[3];
    Scanner g1 =new Scanner(System.in);
    String[] gender = new String[3];
    Scanner a1 =new Scanner(System.in);
    int[] age = new int[3];
    for(int i = 0;i<3;i++){
      fallname[i] = n1.nextLine();
      gender[i] = g1.nextLine();
      age[i] = a1.nextInt();
      fb.setPassengerFallName(i,fallname[i]);
      fb.setPassengerGender(i, gender[i]);
      fb.setPassengerAge(i, age[i]);
    }
        


    Scanner bc = new Scanner(System.in);
    System.out.println("Please select the booking class: 1. Fitst\n2. Bussiness\n3. Economy\n:");
    int bookingClass =bc.nextInt();
    String BookingClass = new String();
        
               
    switch(bookingClass){
        case 1 :BookingClass = "1" ; fb.setBookingClass(BookingClass);break;     
        case 2 :BookingClass = "2" ; fb.setBookingClass(BookingClass);break;     
        case 3 :BookingClass = "3" ; fb.setBookingClass(BookingClass);break;     
    }
   
        
    Scanner b = new Scanner(System.in);
    System.out.println("Please select : 1. One Way\n2. Return");
    int c =b.nextInt();
    String y = new String();

    switch(c){
        case 1 :y = "1" ; fb.setTripType(y);break;     
        case 2 :y = "2" ; fb.setTripType(y);break;     
    }
    

    Scanner tr = new Scanner(System.in);
    System.out.println("请选择目的地: 1. Nanjing;\n2. Beijing\n3. Oulu\n4. Helsinki");
    int tri =b.nextInt();
    String trip = new String();
    String s1= new String();

    switch(tri){
        case 1 :trip = "1" ; fb.setTripSource(trip);fb.setSourceAirport(s1);break;     
        case 2 :trip = "2" ; fb.setTripSource(trip);fb.setSourceAirport(s1);break;     
        case 3 :trip = "3" ; fb.setTripSource(trip);fb.setSourceAirport(s1);break;    
        case 4 :trip = "4" ; fb.setTripSource(trip);fb.setSourceAirport(s1);break;     
    }
    

    Scanner d = new Scanner(System.in);
    System.out.println("请选择目的地: 1. Nanjing;\n2. Beijing\n3. Oulu\n4. Helsinki");
    int de=b.nextInt();
    String des = new String();
    String s2= new String();

    switch(de){
        case 1 :des = "1" ; fb.setTripDestination(trip,des);fb.setDestinationAirport(trip, s2);break;     
        case 2 :des = "2" ; fb.setTripDestination(trip,des);fb.setDestinationAirport(trip, s2);break;     
        case 3 :des = "3" ; fb.setTripDestination(trip,des);fb.setDestinationAirport(trip, s2);break;    
        case 4 :des = "4" ; fb.setTripDestination(trip,des);fb.setDestinationAirport(trip, s2);break;     
    }
    

    String sdepart = "2023-03-08";
        LocalDate depart = LocalDate.parse(sdepart);
        String sreturn = "2023-03-15";
        LocalDate returnDate = LocalDate.parse(sreturn);

    Scanner q =new Scanner(System.in);
    System.out.println("出发时间: ");
    String qw=q.next();
    LocalDate qwe = LocalDate.parse(qw);
    fb.setDepartureDate(qwe);
    

    LocalDate detePara = LocalDate.parse("2023-3-13");
    String dateParam = null;
    System.out.println("String => LocalDate :" + dateParam);

    Scanner j =new Scanner(System.in);
    System.out.println("返程时间: ");
    String jk=j.next();
    LocalDate jkl = LocalDate.parse(jk);
    fb.setReturnDate(jkl);
    fb.getReturnDate();

    input.close();
    bc.close();
    b.close();
    tr.close();
    d.close();
    System.out.println(
            "Dear" + " " + passengerFullName + ". Thank you for booking your flight with " + flightCompany +".Following are the details of your booking and the trip:" + "\n" +
                "TicketNumber:" + FlightBooking.ticketNumber + "\n" +
                "From" + FlightBooking.tripSource + "to" + FlightBooking.tripDestination + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate1 + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice );
    

    }
        
    }

