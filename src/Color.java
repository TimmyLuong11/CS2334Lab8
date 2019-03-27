/**
 * Enum to represent a color (with rgb values).
 * 
 * @author Timothy
 * @version 03/24/2019
 *
 */
public enum Color
{
	RED(255,0,0),
	GREEN(0,255,0),
	BLUE(0,0,255),
	YELLOW(255,255,0),
	CYAN(0,255,255),
	MAGENTA(255,0,255);
	
	private int r, g, b;
	
	/**
	 * Color of R,G,B
	 * 
	 * @param r
	 * @param g
	 * @param b
	 */
	private Color(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	/**
	 * Gets the red color.
	 * 
	 * @return The color's red component.
	 */
	public int getR()
	{
		return r;
		
	}
	
	/**
	 * Gets the green color.
	 * 
	 * @return The color's green component.
	 */
	public int getG()
	{
		return g;
		
	}
	
	/**
	 * Gets the blue color.
	 * 
	 * @return The color's blue component.
	 */
	public int getB()
	{
		return b;
		
	}
	
}
