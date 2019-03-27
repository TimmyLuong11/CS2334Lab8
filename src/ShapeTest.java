import org.junit.Assert;
import org.junit.Test;

public class ShapeTest 
{
	@Test
	public void ShapeTest()
	{
		Shape shape = Shape.BOOT;
		Assert.assertEquals("boot", shape.toString());
		
		Shape shape1 = Shape.RACECAR;
		Assert.assertEquals("racecar", shape1.toString());
		
		Shape shape2 = Shape.THIMBLE;
		Assert.assertEquals("thimble", shape2.toString());
	}
}
