import Package2.VehicleSUV;

//import Package2.VehicleSUV;

//import Package2.VehicleSUV;

public class VehicleSedan    {
	
	 
	String Colour = "Silver";
	
	void PrintColourVehicleSedan()
	{
		System.out.println("Vehicle Sedan"+Colour);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		VehicleSUV vs =  new VehicleSUV();
	//VehicleHatchback v = new VehicleHatchback();
	System.out.println(vs.ColourSUV);
	vs.PrintVehicleSUV();
	}

}
