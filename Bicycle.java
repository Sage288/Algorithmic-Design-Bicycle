//Sage Gordin
public class Bicycle {
	private String Make;
	private Wheel FrontWheel;
	private Wheel BackWheel;
	private Frame Frame;
	
	public Bicycle()
	{
		this.Make = "none";
		this.FrontWheel = new Wheel();
		this.BackWheel = new Wheel();
		this.Frame = new Frame();
	}
	
	public Bicycle(String make, Wheel fW, Wheel bW, Frame frame)
	{
		this.Make = make;
		if (make == null)
		{
			this.Make = "none";
		}
		this.FrontWheel = fW;
		this.BackWheel = bW;
		this.Frame = frame;
	}
	//accessors
	public Wheel getFrontWheel()
	{
		return this.FrontWheel;
	}
	public Wheel getBackWheel()
	{
		return this.BackWheel;
	}
	public Frame getFrame()
	{
		return this.Frame;
	}
	public String getMake()
	{
		return this.Make;
	}
	
	
	//mutators
	public void setFrontWheel(Wheel fW)
	{
		this.FrontWheel = fW;
	}
	
	public void setBackWheel(Wheel bW)
	{
		this.BackWheel = bW;
	}
	
	public void setFrame(Frame frame)
	{
		this.Frame = frame;
	}
	public void setMake(String make) 
	{
		this.Make = make;
	}
	
	//equals
	public boolean equals(Bicycle b)
	{
		return b != null && this.Make.equals(b.getMake()) && this.FrontWheel.equals(b.getFrontWheel()) && this.BackWheel.equals(b.getBackWheel()) && this.Frame.equals(b.getFrame());
		//this may have been the worst thing ive ever typed troubleshooting was an actual nightmare
	}
	
	//to string
	 public String toString()
	 {
	    return "Bicycle Make: " + getMake() + " Front Wheel: " + getFrontWheel() + " Back Wheel: " + getBackWheel() + " Frame: " + getFrame();
	 }
	
	}

