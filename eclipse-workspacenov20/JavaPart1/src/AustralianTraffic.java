
public class AustralianTraffic implements CentralTraffic {

	public void Red()
	{
		System.out.println("Red for 1 minute");
	}

	
	public void FlashYellow() {
		
		System.out.println("Yellow for 15 seconds");
	
	}

	
	public void Green() {
		System.out.println("Green for 2 minutes");
		
	}
	


public static void main(String args[])
{
	CentralTraffic t = new AustralianTraffic();
	t.Red();
	t.FlashYellow();
	t.Green();
	
  }
}