//Sage Gordin
public class Wheel {
	private double Diameter;
	private double Width;
	
	//default constructor
	public Wheel()
	{
		this.Diameter = 16.0;
		this.Width = 1.0;
	}
	
	//parameterized constructor
	public Wheel (double iDM, double dW)
	{
		this.Diameter = iDM;
		
		if (iDM > 55 || iDM < 16)
		{
			this.Diameter = 16.0;
		}
		
		
		this.Width = dW;
		
		if (dW > 2.5 || dW < 1)
		{
			this.Width = 1.0;
		}
	}
	
	//accessors 
	public double getDiameter()
	{
		return this.Diameter;
	}
	
	public double getWidth()
	{
		return this.Width;
	}
	
	//mutators
	public void setDiameter(double iDM)
	{
		this.Diameter = iDM;
		if (iDM > 55 || iDM < 16)
		{
			this.Diameter = 16.0;
		}
		
	}
	
	public void setWidth(double dW)
	{
		this.Width = dW;
		if (dW > 2.5 || dW < 1)
		{
			this.Width = 1.0;
		}
				
	}
	
	//to string
	public String toString()
	{
		return "[Wheel] Diameter " + getDiameter() + " Width: " + getWidth();
	}
	
	//equals
	public boolean equals(Wheel a)
	{
		return a != null && this.Diameter == (a.getDiameter()) && this.Width == a.getWidth();
	}
	
}
