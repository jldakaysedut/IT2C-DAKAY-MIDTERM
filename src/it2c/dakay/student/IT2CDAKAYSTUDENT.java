
package it2c.dakay.student;



import java.util.Scanner;


public class IT2CDAKAYSTUDENT {


    
      public void addStudent(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        String age = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
         System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Phone number: ");
        String number = sc.nextLine();
      

        
        String sql = "INSERT INTO tbl_Students (s_name, s_age, s_email, s_address, s_phone_number) VALUES (?, ?, ?, ?, ?)";


        conf.addRecord(sql, name, age, email, address, number);


    }
         
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String response;
       
        do{
            System.out.println("\n1. Add student");
            System.out.println("2. View student");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. Back to Main Menu");
            System.out.print("\nChoose an option: ");
           
            System.out.print("\n Enter Action: ");
            int action = sc.nextInt();
            IT2CDAKAYSTUDENT demo = new IT2CDAKAYSTUDENT();
         
          switch(action){
                
                case 1:    
                demo.addStudent();            
                break;
                
                case 2:
                demo.viewStudent();
                    break;
                case 3:
                demo.viewStudent();
                demo.updateStudent();
                break;
                case 4:
                demo.viewStudent();
                demo.deleteStudent(); 
                demo.viewStudent();
                break;
           
        
            }
            System.out.print("continue (YES/NO): ");
    response = sc.next();
    
        }while(response.equals("yes"));
        System.out.println("thank you . see you again ");
        
    }
    
 
    
    

private void viewStudent() {
        String aqry = "SELECT * FROM tbl_Students";
        String[] hrds = {"ID", "Name", "AGE", "EMAIL", "ADDRESS", "PHONE NUMBER"};
        String[] clmns = {"s_id", "s_name", "s_age", "s_email", "s_address", "s_phone_number"};
        config conf = new config();
        conf.viewRecords(aqry, hrds, clmns);
    }



   private void updateStudent(){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter Applicant ID: ");
   int id = sc.nextInt();
            sc.nextLine(); 
            
            
            
       
        System.out.print("Enter Name: ");
        String uname = sc.nextLine();
        System.out.print("Age: ");
        String uage = sc.nextLine();
        System.out.print("Email: ");
        String uemail = sc.nextLine();
         System.out.print("Address: ");
        String uaddress = sc.nextLine();
        System.out.print("Phone number: ");
        String unumber = sc.nextLine();
            
            
         
      
      String qry = "UPDATE tbl_Students SET s_name = ?, s_age = ?, s_email = ?, s_address = ?, s_phone_number = ? WHERE s_id = ? ";
    
   config conf = new config();
   conf.updateRecord(qry, uname, uage, uemail, uaddress, unumber, id);
   
   
   
   }
   
   
   
   
  private void deleteStudent(){

       Scanner sc = new Scanner(System.in);
   System.out.print("Enter student ID to delete: ");
   int id = sc.nextInt(); 
   
   String sqlDelete = "DELETE FROM tbl_Students WHERE s_id = ?";
   config conf = new config();
   conf.deleteRecord(sqlDelete, id);
    }
  
  
  
  
  
  
  
} 
   
   
   
   
   
 

    
