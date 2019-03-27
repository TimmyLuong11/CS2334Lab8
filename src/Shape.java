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
	
	/**
	 * Gives the name of the value of the enum object, in lowercase.
	 * 
	 * @return The enum object's name (either thimble, boot, racecar) in lowercase. 
	 * (Look at the documentation for java enums to figure out how to get the enum value's name).
	 */
	@Override
	public String toString()
	{
		return this.name().toLowerCase();
	}
	
}
