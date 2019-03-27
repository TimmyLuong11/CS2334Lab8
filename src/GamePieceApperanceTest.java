import org.junit.Assert;
import org.junit.Test;

public class GamePieceApperanceTest 
{
	@Test
	public void GamePieceApperanceTest()
	{
		GamePieceAppearance one = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		
		Assert.assertEquals(Color.RED, one.getColor());
		Assert.assertEquals(Shape.RACECAR, one.getShape());
	}
}
