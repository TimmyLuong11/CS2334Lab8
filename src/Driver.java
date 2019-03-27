
public class Driver
{
	public static void main(String[] args)
	{
		
        GamePieceAppearance one = new GamePieceAppearance(Color.RED, Shape.RACECAR);
        System.out.println(one.getColor().getR());		
        System.out.println(one.getShape());
       
        GamePiece a = GamePiece.RED_RACER;
        System.out.println(a.toString());
        
    	BoardGame bg = new BoardGame();
    	
    	bg.addPlayer("Billy", GamePiece.RED_THIMBLE, Location.KITCHEN);
    	bg.addPlayer("George", GamePiece.BLUE_BOOT, Location.KITCHEN);
    	bg.addPlayer("Slime", GamePiece.GREEN_BOOT, Location.KITCHEN);

        System.out.println(bg.getPlayerGamePiece("Billy"));
        System.out.println(bg.getPlayerGamePiece("Billy").getColor());			
        System.out.println(bg.getPlayerGamePiece("Billy").getShape());
        
        System.out.println(bg.getPlayerGamePiece("Billy").getColor().getB());
        System.out.println(bg.getPlayerGamePiece("Slime").getColor().getG());	
        System.out.println(bg.getPlayerGamePiece("Billy").getColor().getR());

        bg.movePlayer("Billy", Location.BALLROOM);
        System.out.println(bg.getPlayersLocation("Billy"));
        

        String[] name = new String[2];
        name[0] = "Billy";
        name[1] = "Slime";
        
        Location[] loc = new Location[2];
        loc[0] = Location.CONSERVATORY;
        loc[1] = Location.BILLIARD_ROOM;
        
        System.out.println((bg.moveTwoPlayers(name, loc)).toString());
        
        
        System.out.println(bg.getPlayersLocation("Slime"));
        System.out.println(bg.getPlayersAtLocation(Location.BALLROOM));
        System.out.println(bg.getPlayersAtLocation(Location.KITCHEN));

        System.out.println(bg.getGamePiecesAtLocation(Location.BILLIARD_ROOM));
        System.out.println(bg.getPlayers());
        System.out.println(bg.getPlayerLocations());
        System.out.println(bg.getPlayerPieces());
	}
}
