package JSON.COM.trail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Repos 
{
	Connection con= null;
    List<Enroute> bkk;
	public Repos() {
		
		 String url="jdbc:mysql://localhost:3306/Famto";
	  	 String name="root";
	  	 String password="14569";
	  	  try {
	  		  
	  		  
	  		  Class.forName("com.mysql.jdbc.Driver");
	  	      con=DriverManager.getConnection(url,name,password);
	  	  
	        }
	  	  catch(Exception e) {
	  		  System.out.println(e);
	  	}
  
  Enroute b1=new Enroute();
    	
    	b1.setaddress("Chennai");
    	
    	Custom_name e=new Custom_name();
    	e.setFirstName("selena");
    	e.setLastName("kyle");
        Phone a=new Phone();
        a.setFirstName(125152);
        
        b1.setPhone(a);
    	b1.setcustom_name(e);
    	bkk.add(b1);
    	System.out.println(b1);
    }

	@SuppressWarnings("unchecked")
	public List<Enroute> getBookDetails() {
		String sql="select * from books";
		Enroute bk=new Enroute();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				
				  bk.setphone(rs.getInt(1));
	  			  Custom_name e=new Custom_name();
	  			  e.setFirstName(rs.getString(4));
	  			  e.setLastName(rs.getString(5));
	  			  bk.setCustom_name(e);
	  			  Address a=new Address();
	  			  a.setAddress(rs.getString(2));
	  			  bk.setAddress(a);   
	  		  }
			    
			bkk.add(bk);
			}
			
		
		catch(Exception e) {
			System.out.println(e);
		}
	    return bkk;
	}

	@SuppressWarnings("unchecked")
	public Enroute getEnroutedetail(int id) {
		
		Enroute bk=new Enroute();
	  	  String sql = "select * from enroute; ";
	  	  try {
	  		  Statement st= con.createStatement();
	  		  ResultSet rs=st.executeQuery(sql);
	  		  if(rs.next()) {
	  			  bk.set(rs.getInt(1));
	  			 
	  			  Phone e=new Phone();
	  			  e.setphone(rs.getInt(4));
	  			  bk.setphone(e);
	  			  Custom_name a=new Custom_name();
	  			  a.setFirstName(rs.getString(2));
	  			  a.setLastName(rs.getString(3));
	  			  bk.setcustom_name(a);   
	  		  }
	  		  System.out.println("Message: data retrived with id="+id);
	  		  System.out.print("Details:");
	  		  return bk; 
	  	  }
	  	  catch(Exception e) {
	  		  System.out.println(e);
	  	  }
	  	  
	  	 
	  	  
	  	 return new Enroute();
	}
public Delivery getDeliverydetail(int id) {
		
		Deliver_name bk=new Delivery();
	  	  String sql = "select * from delivery_started; ";
	  	  try {
	  		  Statement st= con.createStatement();
	  		  ResultSet rs=st.executeQuery(sql);
	  		  if(rs.next()) {
	  			  bk.set(rs.getInt(1));
	  			 
	  			  Phone e=new Phone();
	  			  e.setphone(rs.getInt(4));
	  			  bk.setphone(e);
	  			  Deliver_name a=new Deliver_name();
	  			  a.setFirstName(rs.getString(2));
	  			  a.setLastName(rs.getString(3));
	  			  bk.setdeliver_name(a);  
	  			  
	  			 Address a=new Address();
	  			  a.setpickup_address(rs.getString(2));
	  			  a.setdrop_address(rs.getString(3));
	  			  bk.setAddress(a);
	  		  }
	  		  System.out.println("Message: data retrived with id="+id);
	  		  System.out.print("Details:");
	  		  return bk; 
	  	  }
	  	  catch(Exception e) {
	  		  System.out.println(e);
	  	  }
	  	  
	  	 
	  	  
	  	 return new Enroute();
	}

	

}
