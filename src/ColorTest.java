import org.junit.Assert;
import org.junit.Test;


public class ColorTest
{
	@Test
	public void ColorTest()
	{
		Color color = Color.RED;
		Assert.assertEquals(255, color.getR());
		Assert.assertEquals(0, color.getG());
		Assert.assertEquals(0, color.getB());
		
		Color color1 = Color.GREEN;
		Assert.assertEquals(0, color1.getR());
		Assert.assertEquals(255, color1.getG());
		Assert.assertEquals(0, color1.getB());
		
		Color color2 = Color.BLUE;
		Assert.assertEquals(0, color2.getR());
		Assert.assertEquals(0, color2.getG());
		Assert.assertEquals(255, color2.getB());
		
		Color color3 = Color.YELLOW;
		Assert.assertEquals(255, color3.getR());
		Assert.assertEquals(255, color3.getG());
		Assert.assertEquals(0, color3.getB());
		
		Color color4 = Color.CYAN;
		Assert.assertEquals(0, color4.getR());
		Assert.assertEquals(255, color4.getG());
		Assert.assertEquals(255, color4.getB());
		
		Color color5 = Color.MAGENTA;
		Assert.assertEquals(255, color5.getR());
		Assert.assertEquals(0, color5.getG());
		Assert.assertEquals(255, color5.getB());
	}
}
