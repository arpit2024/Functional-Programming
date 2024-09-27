package javapractice;
import java.util.Scanner;
public  class Solution{
    public static void main(String[] args){

       Scanner sc=new Scanner(System.in);
       
       TravelAgencies travel[]=new TravelAgencies[3];
       for(int i=0;i<3;i++) {
    	   int regNo=sc.nextInt();
    	   sc.nextLine();
    	   String agencyName=sc.nextLine();
    	   String packageType=sc.nextLine();
    	   int price=sc.nextInt();
    	   sc.nextLine();
    	   boolean flightFacility=sc.nextBoolean();
    	   
    	   travel[i]=new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);
    	   
    	   int res=findAgencyWithHighestPackagePrice(travel);
    	   System.out.println(res);
       }
       
       
       
       
       sc.close();
    }
    
    public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travel) {
    
    	int x=travel[0].getPrice();
    	for(TravelAgencies i:travel) {
    		if(i.getPrice()>x) {
    			x=i.getPrice();
    		}
    		
    	}
    	if(x>0)
        {
            return x;
        }
        else
        {
            return 0;
        }
    }

}

class TravelAgencies{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    TravelAgencies(int regNo , String agencyName, String packageType, int price , boolean flightFacility){
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo(){
        return  this.regNo;
    }

    public String getAgencyName(){
        return this.agencyName;
    }

    public String getPackageType(){
        return this.packageType;
    }

    public int getPrice(){
        return this.price;
    }
    public boolean getFlightFacilty(){
        return this.flightFacility;
    }

    public void setRegNo(int regNo){
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName){
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType){
       this.packageType = packageType;
    }

    public void setPrice(int price){
       this.price = price;
    }

    public void setFlightFacility(boolean flightFacility){
        this.flightFacility = flightFacility;

    }

}