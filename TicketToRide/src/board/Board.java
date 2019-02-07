package board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.LoadData;

public class Board {
	List<City> cities;
	List<Connection> connections;
	LoadData loadData = new LoadData();
	
	
	
	
	public void loadBoardFromData() throws Exception {
		cities = loadCities();
		for(City city : cities) city.printCityData();
		connections = loadConnections();
		for(Connection connection: connections) connection.printConnectionsData();
	}
	
	private List<Connection> loadConnections() throws NumberFormatException, IOException { // load Connections from data
		return loadData.loadConnections();
	}
	private List<City> loadCities() throws Exception { // load cities from data
		return loadData.loadCities();
	}
	
	
		
}

/*List<City> cities;
LoadData loadData;
cities = loadData.loadCities();
public cities loadCities() {
	
}*/