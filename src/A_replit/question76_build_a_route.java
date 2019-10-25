package A_replit;

import java.util.Scanner;

public class question76_build_a_route {
public static void main(String[] args) {
	
	Scanner input  = new Scanner (System.in);
	System.out.println();
	
	String start = input.next().toUpperCase();
    String end = input.next().toUpperCase();
    
    if ( start.charAt(0)==end.charAt(0) ) {
        System.out.println(start+ " found");
      }
      
      if (!start.equalsIgnoreCase(end)){
        String route = "A right >B down >C left >D up >A right >B down >C left";
         
        if ( start.charAt(0) < end.charAt(0) ) {
          
          route = route.substring (route.indexOf (start)  , route.indexOf(end) );
          // if A- D: routea A-D= "A right >B down >C left > "
          
          if (route.contains("A")) {route= route.replace("A","");}
          if (route.contains("B")) {route= route.replace("B","");}
          if (route.contains("C")) {route= route.replace("C","");}
          if (route.contains("D")) {route= route.replace("D","");} 
          
          // routea A-D= " right >down >left > "
          route= route.trim().concat(": ");
          // routea A-D= "right > down > left >:"
          route= route.replace( " >:" , ":"  );
          System.out.println(route+end+" found");
          
        }
        
        if ( start.charAt(0) > end.charAt(0) ) {
          
          route = route.substring (route.indexOf (start)  , route.lastIndexOf(end) );
          // if D-A: routea D-A = "D up >A right >B down >C left"
          if (route.contains("A")) {route= route.replace("A","");}
          if (route.contains("B")) {route= route.replace("B","");}
          if (route.contains("C")) {route= route.replace("C","");}
          if (route.contains("D")) {route= route.replace("D","");}
                 
        
          
          route= route.trim().concat(": ");
          route= route.replace( " >:" , ":"  );
      
          System.out.println(route+end+" found");}
          
}
      
      /*
       String route = "";
    
    
      
    
      for (int i=0; i<4; i++) {
        
        if (start.equals(end)){
          if (i!=0){
            route = route.substring(0,route.length()-3);
            System.out.println(route + ": " + start + " found");
          } else {
            System.out.println(route + start + " found");
          }
          break;
        } 
        
        if (start.equals("A")){
          route = route + "right";
          start = "B";
        } else if (start.equals("B")){
          route = route + "down";
          start = "C";
        } else if (start.equals("C")){
          route = route + "left";
          start = "D";
        } else {
          route = route + "up";
          start = "A";
        }
        route = route + " > ";
        
      }
    
       */
    
     
    
  
	
	
	
	
    
	
}
}
