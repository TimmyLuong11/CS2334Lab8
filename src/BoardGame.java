import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame
{
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	/**
	 * BoardGame constructor. Intializes the data structures tracking the players and the locations of their associated game pieces.
	 */
	public BoardGame()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
		
	}
	
	/**
	 * Adds a player to the board game object. 
	 * Players are uniquely associated with a game piece. 
	 * These game pieces represent the player in the board game. 
	 * Each player has only one game piece, and each game piece can be associated with only one player. 
	 * As such, when adding a player, a check must be done to ensure that a player is not already associated with the game piece. 
	 * Players are represented by their names. Players/GamePieces are given a location in the board game (a location inside a mansion). 
	 * Multiple Players/GamePieces may be in the same location. 
	 * Remember that a player is uniquely associated with a single game piece, 
	 * so a "player at a location" is essentially the same as a "game piece at a location".
	 * 
	 * @param playerName
	 * @param gamePiece
	 * @param initialLocation
	 * @return False if there already is a player associated with the game piece.
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		if(playerPieces.containsKey(playerName) && playerPieces.containsValue(gamePiece))
		{
			return false;
		} 
		else if (playerPieces.containsValue(gamePiece))
		{
			return false;
		}
		else
		{
			playerLocations.put(playerName, initialLocation);
			playerPieces.put(playerName, gamePiece);
			return true;
		}
	}
	
	/**
	 * Given a player's name, find the game piece associated with that player. 
	 * Remember that game pieces are unique, and are assigned to a unique player (i.e. it is a one-to-one relationship).
	 * 
	 * @param playerName
	 * @return The game piece associated with the player.
	 */
	public  GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	/**
	 * Given a game piece, find the player associated with that game piece. 
	 * Remember that game pieces are unique, and are assigned to a unique player (i.e. it is a one-to-one relationship).
	 * 
	 * @param gamePiece
	 * @return If a player is correlated with the game piece, return that player name.
	 *  Else, return null.
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		Set<String> player = playerPieces.keySet();
		for (String name : player)
		{
			if(playerPieces.get(name) == gamePiece) 
			{
				return name;
			}
		}
		return null;
	}
	
	/**
	 * Moves a player to a new location in the board game. 
	 * Remember that a player is uniquely associated with a single game piece, so "moving the player" 
	 * is essentially equivalent to "moving the player's game piece".
	 * 
	 * @param playerName
	 * @param newLocation
	 */
	public void movePlayer(String playerName, Location newLocation )
	{
		playerLocations.put(playerName, newLocation);
	}
	
	/**
	 * Method to use when two players each want to move at the same time. 
	 * Movements must be taken individually, so the system must determine which player moves first. 
	 * Each player is associated with a game piece, and game pieces determine who moves first by the movesFirst() method. 
	 * That is, the player that move first is the player with the game piece that has the first priority. 
	 * You may assume that the arrays are always the appropriate length. 
	 * Index i in the player array is associated with index i in the locations array. 
	 * That is, the player at players[i] wishes to move to the location at newLocations[i]. 
	 * You should leverage the code in the movePlayer() method.
	 * 
	 * @param playerNames
	 * @param newLocations
	 * @return The players, sorted in the order in which the two players move (the first player to move is at index 0 of the returned array).
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		GamePiece one = GamePiece.movesFirst(playerPieces.get(playerNames[0]),playerPieces.get(playerNames[1]));
		String[] newPlayer = new String[playerNames.length];
		if(one.equals(playerPieces.get(playerNames[0])))
		{
			newPlayer[0] = playerNames[0];
			newPlayer[1] = playerNames[1];
			movePlayer(newPlayer[0], newLocations[0]);
			movePlayer(newPlayer[1], newLocations[1]);
		}
		
		return playerNames;
	}
	
	/**
	 * Gets the location of a player. 
	 * Be careful that you don't confuse this with getPlayerLocations!
	 * 
	 * @param player
	 * @return The location of the player.
	 */
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	/**
	 * Given a location, find all players at that location.
	 * 
	 * @param loc
	 * @return The players at the given location.
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		Set<String> playerLocation = playerLocations.keySet();
		ArrayList<String> player = new ArrayList<String>();
		for (String name: playerLocation) 
		{
			if(playerLocations.get(name) == loc)
			{
				player.add(name);
			}
		}
		return player;
	}
	
	/**
	 * Given a location, find the game pieces associated with all the players at that location.
	 * 
	 * @param loc
	 * @return The game pieces for which an associated player is at the given location.
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> pieceLocation = new ArrayList<GamePiece>();
		for(String name: getPlayersAtLocation(loc))
		{
			pieceLocation.add(getPlayerGamePiece(name));
		}
		return pieceLocation;
	}
	
	/**
	 * Gets all players recorded in the game.
	 * 
	 * @return The list of players in the board game.
	 */
	public Set<String> getPlayers()
	{
		Set<String> player = playerPieces.keySet();
		return player;
	}
	
	/**
	 * Gets all locations that the players are at (not all possible locations). 
	 * Be careful that you don't confuse this with getPlayersLocation!
	 * 
	 * @return The set of locations (i.e. no duplicate elements) at which at least one player is present. 
	 * Hint: look at the javadocs for the HashSet.
	 */
	public Set<Location> getPlayerLocations()
	{
		Set<Location> places = new HashSet<Location>();
		for(Location place: playerLocations.values())
		{
			places.add(place);
		}
		return places;
	}
	
	/**
	 *Gets all game pieces associated with the players (not all possible game pieces). 
	 * 
	 * @return The set of game pieces (i.e. no duplicate elements) that have been associated with a player. 
	 * Hint: look at the javadocs for the HashSet.
	 */
	public Set<GamePiece> getPlayerPieces() 
	{
		Set<GamePiece> pieces = new HashSet<GamePiece>();
		for(GamePiece piece: playerPieces.values())
		{
			pieces.add(piece);
		}
		return pieces;
	}
}
