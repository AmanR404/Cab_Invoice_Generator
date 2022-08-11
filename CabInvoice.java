import java.util.HashMap;
import java.util.Scanner;
public class CabInvoice {
    Scanner sc = new Scanner(System.in);
    static int totalFare = 0;
    static int membershipType;
    static String id;
    int calculateFare(){
        System.out.print("How many days you used our service in a month : ");
        int days = sc.nextInt();
        for(int i = 1; i <= days; i++){
            System.out.print("Enter your km for day " + i +" : ");
            int km = sc.nextInt();
            System.out.print("Enter how much time cab took : ");
            int time = sc.nextInt();
            if(membershipType == 1){
                totalFare = totalFare + (10*km + time);
                System.out.println(" ");
            }
            else{
                totalFare = totalFare + (15*km + 2*time);
                System.out.println(" ");
            }  
            }
            switch(id){
                case "1001": System.out.println("Hi Aman");
                            break;
                case "1002" : System.out.println("Hi Govind");
                            break;
                case "1003" : System.out.println("Hi Ameen");
                            break;
            }
            System.out.println("Here is Your Invoice");
            System.out.println("Total no. of Rides are " + days);
            System.out.println("Total fare for " + days + " days is " + totalFare);
            int aggreagateTotal = totalFare/days;
            System.out.println("Aggregate fare for " + days + " days is " + aggreagateTotal);
            return totalFare;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CabInvoice invoiceGen = new CabInvoice();
        System.out.println("Thanku for Choosing our Cab service....Lets generate your bill.");
        System.out.print("Please tell me your ID : ");
        id = sc.nextLine();
        System.out.println(" ");
        System.out.println("What types of rides you took :\n1 for Normal Rides \n2 for Premium Rides");
        membershipType = sc.nextInt();
        HashMap<String, Integer> users = new HashMap<>();
        users.put("1001", null);
        users.put("1002", null);
        users.put("1003", null);
    
      switch(id){
        case "1001" : invoiceGen.calculateFare();
        users.replace(id, get(id), totalFare);
        break;

        case "1002" :  invoiceGen.calculateFare();
        users.replace(id, get(id), totalFare);
        break;

        case "1003" :  invoiceGen.calculateFare();
        users.replace(id, get(id), totalFare);
        break;

        default : System.out.println("\nYou are not registered....Please register yourself");
      }   
       
    }
    private static Integer get(String id) {
        return null;
    }
}
