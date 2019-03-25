/**
 * Enum to represent the shape of a game piece.
 * 
 * @author Timothy
 * @version 03/24/2019
 *
 */
public enum Shape
{
	THIMBLE,
	BOOT,
	RACECAR;
	
/*	private String shape;
	
	Shape(String shape)
	{
		this.shape = shape;
	}
	
	public String getShape()
	{
		return this.shape;
	}
	*/
	/**
	 * @return The enum object's name (either thimble, boot, racecar) in lowercase. 
	 * (Look at the documentation for java enums to figure out how to get the enum value's name).
	 */
	@Override
	public String toString()
	{
		return Shape.toString().toLowerCase();
	}
	
	/*public static Shape fromString(String shape) 
	{
        for (Shape s : Shape.values())
        {
            if (s.shape.equalsIgnoreCase(shape)) 
            {
                return s;
            }
        }
        return null;
    }*/
}
