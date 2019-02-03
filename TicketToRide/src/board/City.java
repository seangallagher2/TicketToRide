package board;

import java.util.List;

public class City {
	int index;
	String name;
	int[] adjacentCities; // id's of cities adjacent to this one
	List<Connection> connections; // connection objects for each adjacent cities
	Path[] shortestPaths; // This should be stored as data as it requires significant calculations and is the same every game
	public City(int indexArg, String nameArg, int[] adjacentCitiesArg, List<Connection> connectionsArg) {
		index = indexArg;
		name = nameArg;
		adjacentCities = adjacentCitiesArg;
		connections = connectionsArg;
	}
}