import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame()
	{
		
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		return false;
		
	}
	
	public  GamePiece getPlayerGamePiece(String playerName)
	{
		return null;
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		return null;
		
	}
	
	public void movePlayer(String playerName, Location newLocation )
	{
		
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		return playerNames;
		
	}
	
	public Location getPlayersLocation(String player)
	{
		return null;
		
	}
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		return null;
		
	}
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		return null;
		
	}
	public Set<String> getPlayers()
	{
		return null;
		
	}
	public Set<Location> getPlayerLocations()
	{
		return null;
		
	}
	public Set<GamePiece> getPlayerPieces() 
	{
		return null;
		
	}
	
}
