package board;

import java.util.Arrays;
import java.util.List;

public class City {
	int cityId;
	String name;
	int[] adjacentCities; // id's of cities adjacent to this one
	int[] connectionIds; // connection objects for each adjacent cities
	Path[] shortestPaths; // This should be stored as data as it requires significant calculations and is the same every game
	public City(int indexArg, String nameArg, int[] adjacentCitiesArg, int[] connectionIdsArg) {
		cityId = indexArg;
		name = nameArg;
		adjacentCities = adjacentCitiesArg;
		connectionIds = connectionIdsArg;
	}
	public void printCityData() {
		System.out.println("City ID: " + cityId + "  City name: " + name + "  Adjacent Cities: " + Arrays.toString(adjacentCities) + "  Connections: " + Arrays.toString(connectionIds));
		
	}
	
}
