package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import board.City;
import board.Connection;

public class LoadData {

	public List<City> loadCities() throws Exception {
		// each line in adjacentCities contains the following information split by the delimiter :
		// cityId, cityName, adjacentCities, connections
		List<City> cities = new ArrayList<City>();
		File file = new File("./src/data/adjacent_cities.dat");
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String st;
		int cityId;
		String cityName;
		int[] connectedCities;
		String[] connectedCitiesString;
		while((st = br.readLine()) != null) {
			String[] split = st.split(":");
			cityId = Integer.parseInt(split[0]);
			cityName = split[1];
			connectedCitiesString = split[2].split(",");
			
			connectedCities = new int[connectedCitiesString.length];
			for(int i = 0; i < connectedCities.length; i++) {
				connectedCities[i] = Integer.parseInt(connectedCitiesString[i]);
			}
			cities.add(new City(cityId, cityName, connectedCities, null)); // connections is input as null as this information has not yet been processed
		}
		return cities;
	}
	public List<Connection> loadConnections() {
		return null;
	}

}
