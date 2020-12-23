package Package2;

public class VehicleSUV
{
	
	private String ColourSUV= "Black";
	
	protected void PrintVehicleSUV()
	{
		System.out.println("VehicleSUV"+Colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleSUV v = new VehicleSUV();
		v.PrintVehicleSUV();
		
		//VehicleHatchback v = new VehicleHatchback();
		//System.out.println(v.Colour);
	}
	
}

