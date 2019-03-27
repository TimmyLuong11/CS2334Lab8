import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest 
{
	@Test
	public void GamePieceTest()
	{
		GamePiece one  = GamePiece.RED_RACER;
		GamePiece two = GamePiece.BLUE_RACER;
		
		Assert.assertEquals(Color.RED, one.getColor());
		Assert.assertEquals(Color.BLUE, two.getColor());
		
		Assert.assertEquals(Shape.RACECAR, one.getShape());
		Assert.assertEquals(Shape.RACECAR, two.getShape());
		
		Assert.assertEquals(one, GamePiece.movesFirst(one, two));
		Assert.assertEquals(one, GamePiece.movesFirst(two, one));
		
		Assert.assertEquals("RED_RACER: a RED RACECAR with priority 0", one.toString());
		Assert.assertEquals("BLUE_RACER: a BLUE RACECAR with priority 2", two.toString());
	}
}
