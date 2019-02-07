package board;

import java.util.Arrays;

public class Connection {
	int connectionId;
	int[] connectedCities;
	int length;
	int colourId;
	boolean tunnel;
	boolean available;
	int adjacentConnectionId; // adjacentConnectionId will be -1 if no adjacent available and will be updated i adjacent one has been taken
	int numMultiColour;
	/*public Connection(int connectionIdArg, int[] connectedCitiesArg, int lengthArg, int colourIdArg, boolean tunnelArg, boolean availableArg, int adjacentConnectionIdArg, int numMultiColour) {  
		connectionId = connectionIdArg;
		length = lengthArg;
		colourId = colourIdArg;
		tunnel = tunnelArg;
		adjacentConnectionId = adjacentConnectionIdArg;
	}*/
	public Connection(int connectionIdArg, int[] connectedCitiesArg, int lengthArg, int colourIdArg, boolean tunnelArg,
			boolean availableArg, int adjacentConnectionIdArg, int numMultiColourArg) {
		connectionId = connectionIdArg;
		connectedCities = connectedCitiesArg;
		length = lengthArg;
		colourId = colourIdArg;
		tunnel = tunnelArg;
		available = availableArg;
		adjacentConnectionId = adjacentConnectionIdArg;
		numMultiColour = numMultiColourArg;
	}
	public void unpdateAvailability(boolean availableArg) {
		available = availableArg;
	}
	public void updateAdjacentConnectionId(int adjacentConnectionIdArg) {
		adjacentConnectionId = adjacentConnectionIdArg;
	}
	public void printConnectionsData() {
		System.out.println("connectionID: " + connectionId + "  ConnectedCities: " + Arrays.toString(connectedCities) + " length: " + length + "  ColourID: " + colourId
				+ "  Tunnel: " + tunnel + " available: " + available + "  NumMultiColour: " + numMultiColour);
	}
	
}