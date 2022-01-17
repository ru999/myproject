
	//----------------To run program Sucessfully First create Folder name 'Projectfile' in D drive-----------------------------------

package myproject;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project {
	
	 public static void main(String[] args) {
	 
		 String add,delete,search;
		 char a ;
		 Scanner x =new Scanner(System.in);
		 
		 System.out.println("-------------------------------------------Welcome to Lockers.Pvt.Ltd-------------------------------------------------------");
	//----------------To run program Sucessfully First create Folder name 'Projectfile' in D drive-----------------------------------
		File obj = new File("D:\\Projectfile\\");
		 if(obj.isDirectory())
		 {
			 File[] files = obj.listFiles();
		
			 for(File file:files)
			 {
				 System.out.println("File List : "+file.getName());
			 }
				
		
		 do {
			 
			 System.out.println("     Operations to perform    ");
	         System.out.println("1. Create File ");
	         System.out.println("2. Delete File ");
	         System.out.println("3. Search File ");
	         System.out.println("4. Close ");
	         int select = x.nextInt();
	         
		 switch(select)
		 {		 
		 case 1 : 
			 //create file
			 try
             {	
				 System.out.println("File Name : ");
				  add = x.next();
				  File obj2 = new File("D://Projectfile//"+add+".txt");
				  
				 if (obj2.createNewFile()) 
		            {  
		                System.out.println(obj2.getName()+" File is Created Successfully !! ");  
		                break;
		            }
		            else { 
		                if(obj2.exists())
		                {	 
		                    System.out.println("File already exists."); 	                           
		                }
		                else
		                {
		                	System.out.println("File doesnot exists.");
		                }
		            }	 
             }
           
			 catch (IOException e) {  
		            e.printStackTrace(); 
             } 
		  
		 case 2 : //delete the file
			 try {
				
			 System.out.println("which file do you want to Delete : ");
			  delete = x.next();

			  File obj3 = new File("D://Projectfile//"+delete+".txt");
			 
			  if(obj3.exists())
			  {
				  boolean s = Boolean.parseBoolean(delete);
				  s = obj3.delete();
				  System.out.println(obj3.getName()+" File is Deleted Successfully !!"); 
			  }
			  else
			  {
				  System.out.println("File not deleted");
			  } 
		 }
			 catch (Exception e) {  
				 System.out.println(e);
             } 
			 break;
			  
		 case 3 ://search the file
			 try {
			 System.out.println("which file do you want to Search : ");
			  search = x .next();

			  File obj3 = new File("D://Projectfile//"+search+".txt");
			 if(obj3.exists())
			  {
				 System.out.println("File Found : "+obj3.getName());
				 }
			 else {
				 System.out.println("File Not Found");
			 }
		 }
		 
		 catch (Exception e) {  
			 System.out.println(e); 
         } 
			 break;
		
		 } 
		
		 System.out.println("\n Do you want to continue (Type y or n) \n");
         a = x.next().charAt(0);
		 }while (a == 'Y'|| a == 'y'); 
		 }
       
	 System.out.println("-------------------------------------------Thanks for visiting ---------------------------------------------------------------");
	 }
	 }
