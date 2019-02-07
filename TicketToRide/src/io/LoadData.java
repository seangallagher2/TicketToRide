package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import board.City;
import board.Connection;

public class LoadData {

	public List<City> loadCities() throws Exception {
		// each line in adjacentCities contains the following information split by the delimiter :
		// cityId, cityName, adjacentCities, connections
		List<City> cities = new ArrayList<City>();
		File file = new File("./src/data/cities_data.dat");
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String st;
		int cityId;
		String cityName;
		int[] connectedCities;
		int[] connections;
		String[] connectedCitiesString;
		String[] connectionsString;
		while((st = br.readLine()) != null) {
			String[] split = st.split(":");
			cityId = Integer.parseInt(split[0]);
			cityName = split[1];
			connectedCitiesString = split[2].split(",");
			
			connectedCities = new int[connectedCitiesString.length];
			for(int i = 0; i < connectedCities.length; i++) {
				connectedCities[i] = Integer.parseInt(connectedCitiesString[i]);
			}
			connectionsString = split[3].split(",");
			connections = new int[connectionsString.length];
			for(int i = 0; i < connections.length; i++) {
				connections[i] = Integer.parseInt(connectionsString[i]);
			}
			cities.add(new City(cityId, cityName, connectedCities, connections)); // connections is input as null as this information has not yet been processed
		}
		br.close();
		return cities;
	}
	public List<Connection> loadConnections() throws NumberFormatException, IOException {
		List<Connection> connections = new ArrayList<Connection>();
		File file = new File("./src/data/connections_data.dat");
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String st;
		int connectionId; // split[0]
		int[] connectedCities; // split[1]
		int length; // split[2]
		int colourId; // split[3]
		boolean tunnel; // split[4]
		boolean available; // split[5]
		int adjacentConnectionId; // split[6]  value will be 0 if none
		int numMultiColour; // split[7]
		String[] connectedCitiesString;
		while((st = br.readLine()) != null) {
			String[] split = st.split(":");
			
			connectionId = Integer.parseInt(split[0]);
			
			connectedCitiesString = split[1].split(",");
			connectedCities = new int[connectedCitiesString.length];
			for(int i = 0; i < connectedCities.length; i++) {
				connectedCities[i] = Integer.parseInt(connectedCitiesString[i]);
			}
			length = Integer.parseInt(split[2]);
			
			colourId = Integer.parseInt(split[3]);
			
			tunnel = false;
			if(split[4].contentEquals("1")) tunnel = true;
			else if (! split[4].contentEquals("0")) System.out.println( "Error: input from connections file for tunnel for id: " + connectionId + " = " + split[4]);
			available = false;
			if(split[5].contentEquals("1")) {
				available = true;
			}
			else if (! split[4].contentEquals("0")) System.out.println( "Error: input from connections file for available for id: " + connectionId + " = " + split[5]);
			
			adjacentConnectionId = Integer.parseInt(split[6]);
			
			numMultiColour = Integer.parseInt(split[7]);
			
			connections.add(new Connection(connectionId, connectedCities, length, colourId, tunnel, available, adjacentConnectionId, numMultiColour));
		}
		br.close();
		return connections;
	}
		

}
