package JSON.COM.trail;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

public class Enroute {
	private int phone;
	@SuppressWarnings("unused")
	private String message;
	
	@SuppressWarnings("unused")
	private String address;
	public int rating;
	@SuppressWarnings("unused")
	private String custom_name;
	
	
	public int getphone() {
		return phone;
	}
	public void setphone(int phone) {
		this.phone = phone;
	}
	public String getmessage() {
		return message;
	}
	public void setmessage(String message) {
		this.message = message;
	}
	
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address ;
	}
	public String getcustom_name() {
		return custom_name;
	}
	public void setcustom_name(String custom_name) {
		this.custom_name = custom_name;
	}

}
