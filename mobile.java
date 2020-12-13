package class1;

public class mobile {
	String phoneBrand= "Redmi";
	int phoneSize= 6;
	boolean isSmartPhone=true;
	int phoneNo= 1234567;
	String modelnum= "Note9promax";
	long phonePrice= 18000L;
	
	
	
	public void sendSms() {
		System.out.println("Message sent");
	}
      public void makeCall() {
	System.out.println("Call connected");
}


public static void main(String [] args) {
mobile obj=new mobile();
obj.sendSms();
obj.makeCall();
System.out.println(obj.phoneBrand);
System.out.println(obj.phoneSize);
System.out.println(obj.isSmartPhone);
System.out.println(obj.modelnum);
System.out.println(obj.phonePrice);
}

}
