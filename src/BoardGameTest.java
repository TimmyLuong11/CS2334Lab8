import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest 
{
	@Test
	public void addPlayerTest()
	{
	    BoardGame bg = new BoardGame();
	   	Assert.assertEquals(true, bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.CONSERVATORY));
	   	Assert.assertEquals(false, bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.CONSERVATORY));
	   	Assert.assertEquals(false, bg.addPlayer("Jimmy", GamePiece.RED_RACER, Location.CONSERVATORY));
	   	Assert.assertEquals(true, bg.addPlayer("Timmy", GamePiece.MAGENTA_RACER, Location.BILLIARD_ROOM));
	   	Assert.assertEquals(true, bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.HALL));
	}
	
	@Test
	public void getPlayerGamePieceTest()
	{
		BoardGame bg = new BoardGame();
	   	Assert.assertEquals(true, bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.CONSERVATORY));
	   	Assert.assertEquals(true, bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.HALL));
	   	Assert.assertEquals(GamePiece.RED_RACER, bg.getPlayerGamePiece("Timmy"));
	   	Assert.assertEquals(GamePiece.YELLOW_BOOT, bg.getPlayerGamePiece("Jayson"));
	}
	
	@Test
	public void getPlayerWithGamePieceTest() 
	{
		BoardGame bg = new BoardGame();
	   	Assert.assertEquals(true, bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.CONSERVATORY));
	   	Assert.assertEquals(true, bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.HALL));
	   	Assert.assertEquals("Timmy", bg.getPlayerWithGamePiece(GamePiece.RED_RACER));
	   	Assert.assertEquals("Jayson", bg.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
		Assert.assertEquals(null, bg.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
	}
	
	@Test
	public void movePlayerTest() 
	{
		BoardGame bg = new BoardGame();
		Assert.assertEquals(true, bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.CONSERVATORY));
		Assert.assertEquals(true, bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.HALL));
    	bg.movePlayer("Timmy", Location.LIBRARY);
    	bg.movePlayer("Jayson", Location.DINING_ROOM);
    	Assert.assertEquals(Location.LIBRARY, bg.getPlayersLocation("Timmy"));
    	Assert.assertEquals(Location.DINING_ROOM, bg.getPlayersLocation("Jayson"));
	}
	
	@Test
	public void moveTwoPlayersTest() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.LIBRARY);
    	bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
    	
		String[] name = new String[2];
	    name[0] = "Timmy";
	    name[1] = "Jayson";
	        
	    Location[] loc = new Location[2];
	    loc[0] = Location.KITCHEN;
	    loc[1] = Location.STUDY;
	   
	    bg.moveTwoPlayers(name, loc);
	    Assert.assertEquals(Location.KITCHEN, bg.getPlayersLocation("Timmy"));
	    Assert.assertEquals(Location.STUDY, bg.getPlayersLocation("Jayson"));
	    
	    String[] name1 = new String[2];
	    name1[0] = "Timmy";
	    name1[1] = "Jayson";
	        
	    Location[] loc1 = new Location[2];
	    loc1[0] = Location.KITCHEN;
	    loc1[1] = Location.KITCHEN;
	   
	    bg.moveTwoPlayers(name1, loc1);
	    Assert.assertEquals(Location.KITCHEN, bg.getPlayersLocation("Timmy"));
	    Assert.assertEquals(Location.KITCHEN, bg.getPlayersLocation("Jayson"));
	}
	
	@Test
	public void getPlayersAtLocationTest() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.LIBRARY);
    	bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.LIBRARY);
    	
    	ArrayList<String> players = new ArrayList<String>();
    	players.add("Timmy");
    	players.add("Jayson");
    	
    	Assert.assertEquals(players, bg.getPlayersAtLocation(Location.LIBRARY));	

    	players.clear();
    	Assert.assertEquals(players, bg.getPlayersAtLocation(Location.BILLIARD_ROOM));
	}
	
	@Test
	public void getGamePiecesAtLocationTest()
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.LIBRARY);
    	bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.LIBRARY);
    	
    	ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
    	pieces.add(GamePiece.RED_RACER);
    	pieces.add(GamePiece.YELLOW_BOOT);
    	Assert.assertEquals(pieces, bg.getGamePiecesAtLocation(Location.LIBRARY));
	}
	
	@Test
	public void getPlayersTest()
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.LIBRARY);
    	bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
    	
    	Set<String> players = new HashSet<String>();
    	players.add("Timmy");
    	players.add("Jayson");
    	
    	Assert.assertEquals(players, bg.getPlayers());
	}
	
	@Test
	public void getPlayerLocationsTest() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.LIBRARY);
    	bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
    	
    	Set<Location> places = new HashSet<Location>();
    	places.add(Location.LIBRARY);
    	places.add(Location.DINING_ROOM);
    	
    	Assert.assertEquals(places, bg.getPlayerLocations());
    	
	}
	
	@Test
	public void getPlayerPiecesTest() 
	{
		BoardGame bg = new BoardGame();
		bg.addPlayer("Timmy", GamePiece.RED_RACER, Location.LIBRARY);
    	bg.addPlayer("Jayson", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
    	
    	Set<GamePiece> pieces = new HashSet<GamePiece>();
    	pieces.add(GamePiece.RED_RACER);
    	pieces.add(GamePiece.YELLOW_BOOT);
    	
    	Assert.assertEquals(pieces, bg.getPlayerPieces());	
	}
}
