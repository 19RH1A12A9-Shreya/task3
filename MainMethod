package com.motivity;
import com.motivity.configs.AppConfig;
import com.motivity.entities.Hostel;
import com.motivity.services.HostelService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
public class MainMethod {
    public static void main(String[] args) throws InterruptedException, SQLException {
        System.out.println("This is the start of the PT Spring Hibernate application");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HostelService hostelService = context.getBean(HostelService.class);
        int a,c,d,x,z;
        String b;
        Scanner sc=new Scanner(System.in);
        do {
        System.out.println("Enter the operation to be performed");
        System.out.println("1.Insertion  2.Deletion  3.Updation 4.Select 5.Exit");
        int k=sc.nextInt();
        switch(k) {
        //Insertion
        case 1:System.out.println("Enter the HouseNumber to be inserted");
        	a=sc.nextInt();
        	System.out.println("Enter the Name to be inserted");
        	sc.nextLine();
        	   b=sc.nextLine();
        	   System.out.println("Enter the no.of rooms to be inserted");
        	   c=sc.nextInt();
        	   System.out.println("Enter the fee to be inserted");
        	   d=sc.nextInt();
        	   Hostel h1= new Hostel(a,b, c, d);
        	   hostelService.add(h1);
        	   break;
       //Deletion
        case 2:System.out.println("Enter the HouseNumber to be deleted");
        	  x=sc.nextInt();
        	  Hostel h2= new Hostel();
        	  h2.setHouseNumber(x);
        	  hostelService.delete(h2);
        	  break;
        //Updation
        case 3: System.out.println("Enter the HouseNumber whose information is to be updated");
        	   z=sc.nextInt();
        	   System.out.println("Enter the Name to be updated");
        	   sc.nextLine();
        	   b=sc.nextLine();
        	   System.out.println("Enter the no.of rooms to be updated");
        	   c=sc.nextInt();
        	   System.out.println("Enter the fee to be updated");
        	   d=sc.nextInt();
        	   Hostel h5= new Hostel(z,b, c, d);
        	   hostelService.update(h5);
        	   break;
        //Selection
        case 4:System.out.println("details of hostels");
		List<Hostel> hostel=hostelService.select();
		for(Hostel i:hostel) {
			System.out.println(i.getHouseNumber()+"    "+i.getName()+"     "+i.getRooms()+"     "+i.getFee());
		}
		break;
        case 5:java.lang.System.exit(0);
        default:System.out.println("Enter a valid option");
        	    break;
        }
        }while(true);
    }
}
