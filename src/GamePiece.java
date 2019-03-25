
public enum GamePiece
{
	RED_RACER(GamePieceAppearance(Color red, Shape RACECAR), 0),
	BLUE_RACER(2),
	MAGENTA_RACER(1),
	RED_THIMBLE(10),
	BLUE_BOOT(5),
	GREEN_BOOT(8),
	YELLOW_BOOT(7);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance apperance, int priority)
	{
		this.appearance = apperance;
		this.priority = priority;
	}
	
	public Color getColor()
	{
		return this.getColor();
	}
	
	public Shape getShape()
	{
		return this.getShape();
	}
	
	
	public GamePiece moveFirst(GamePiece a, GamePiece b)
	{
		if(a.priority < b.priority)
		{
			return a;
		}
		else if (a.priority > b.priority)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: a %s %s with priority %d", appearance, this.getColor(), this.getShape(), priority);
	}
	
}
