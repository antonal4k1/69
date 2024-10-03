
package bsit.pkg2d.al4k;

import java.util.Scanner;

public class BSIT2DAL4K {

    
    public static void main(String[] args) {
        String response;
        do{ 
        Scanner sc=new Scanner(System.in);
        System.out.println("ADD");
        System.out.println("VIEW");
        System.out.println("UPDATE");
        System.out.println("DELETE");
        System.out.println("EXIT");
        
        System.out.print("Enter section: ");
        int action = sc.nextInt();
       BSIT2DAL4K customer=new BSIT2DAL4K();
        BSIT2DAL4K customerview=new BSIT2DAL4K();
        switch(action){
            
            case 1:
            
                
                customer.addCustimer();
                
            break;
            
            case 2:
                customerview.viewCostumers();
                
            break;    
                
        }
           System.out.print("do you want to continue? (yes or no)");
           response = sc.next();
  
       }while (response.equalsIgnoreCase("yes"));
        System.out.println("Thank you,see you!");
       }
    
    public void addCustimer(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("Customer First Name: ");
        String fname = sc.next();
        System.out.print("Customer Last Name: ");
        String lname = sc.next();
        System.out.print("Customer Email: ");
        String email = sc.next();
        System.out.print("Customer Status: ");
        String status = sc.next();

        String sql = "INSERT INTO Anton (c_fname, c_lname, c_email, c_status) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, fname, lname, email, status);


    }
   private void viewCostumers() {
        config conf = new config();
        String votersQuery = "SELECT * FROM Anton";
        String[] votersHeaders = {"Customer ID", "Customer First Name", "Customer Last Name", "Customer Email", "Customer Status"};
        String[] votersColumns = {"c_id", "c_fname", "c_lname", "c_email", "c_status"};

        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
    
}
    
    

