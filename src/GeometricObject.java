
public abstract class GeometricObject implements Cloneable, Comparable {
	
	protected double area, sideLength;
	
	@Override
	public String toString ()
	{
		return this.getClass().getName()+"\n"+this.sideLength+"\n"+this.area;
	}
	
	
	
	public Object clone()
	{
		return this;
				
	}
	
	
	public int compareTo(Object obj)
	{
	
		GeometricObject geo = (GeometricObject) obj;
		
		if (this.sideLength < geo.sideLength && this.area < geo.area)
		{
			return -1;
		}
		else if (this.sideLength > geo.sideLength && this.area > geo.area)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
		
	}
	
	

}
