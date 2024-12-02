// Sage Gordin
public class Frame {
	private double Size;
	private String Type;
	
	//default constructor
	public Frame()
	{
		this.Size = 18.5;
		this.Type = "Diamond";
	}
	
	//parameter constructor
	public Frame(double dS, String sT)
	{
		this.Size = dS;
		if (dS > 60 || dS < 18.5)
		{
			this.Size = 18.5;
		}
		
		this.Type = sT;
		if (sT.equals("Diamond"))
		{
			this.Type = "Diamond";
		}
		if (sT.equals("Step-Through"))
		{
			this.Type = "Step-Through";
		}
		if(sT.equals("Truss"))
		{
			this.Type = "Truss";
		}
		if(sT.equals("Penny-Farthing"))
		{
			this.Type = "Penny-Farthing";
		}
		else
		{
			this.Type = "Diamond";
		}
	}
	
	
	//accessors 
	public String getType()
	{
		return this.Type;
	}
	
	public double getSize()
	{
		return this.Size;
	}
	
	//mutators
	public void setType(String sT)
	{
		this.Type = sT;
		if (sT.equals("Diamond"))
		{
			this.Type = "Diamond";
		}
		if (sT.equals("Step-Through"))
		{
			this.Type = "Step-Through";
		}
		if(sT.equals("Truss"))
		{
			this.Type = "Truss";
		}
		if(sT.equals("Penny-Farthing"))
		{
			this.Type = "Penny-Farthing";
		}
		else
		{
			this.Type = "Diamond";
		}
	}
	
	public void setSize(double dS)
	{
		this.Size = dS;
		if (dS > 60 || dS < 18.5)
		{
			this.Size = 18.5;
		}
		
	}
	
	
	//to string
	public String toString()
	{
		return "[Frame] Size: " + getSize() + " Type: " + getType();
	}
	
	//equals
	public boolean equals(Frame f)
	{
		return f != null && this.Type.equals(f.getType()) && this.Size == f.getSize();
	}
}
