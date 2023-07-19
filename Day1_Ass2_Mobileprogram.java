package week1;

public class Day1_Ass2_Mobileprogram 
{
	public void makecall()
	{
		float mobileweight = 12.5f;
		System.out.println("mobile weight:"+mobileweight);	
	}
	public void sendmsg()
	{
		boolean isfullcharged = true;
		int  mobilecost = 3255;	
		System.out.println("Fullycharged:"+isfullcharged+"\n"+"mobile cost:" +mobilecost);
	}
	public static void main(String[] args)
	{
		Day1_Ass2_Mobileprogram mobile = new Day1_Ass2_Mobileprogram();
		mobile.makecall();
		mobile.sendmsg();
	}
	
}

