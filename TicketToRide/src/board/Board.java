package board;

import java.util.List;

import io.LoadData;

public class Board {
	List<City> cities;
	List<Connection> connections;
	LoadData loadData;
	
	
	
	
	public void loadBoardFromData() {
		cities = loadCities();
		connections = loadConnections();
	}
	
	private List<Connection> loadConnections() { // load Connections from data
		return loadData.loadConnections();
	}
	private List<City> loadCities() { // load cities from data
		return loadData.loadCities();
	}
	
	
		
}

/*List<City> cities;
LoadData loadData;
cities = loadData.loadCities();
public cities loadCities() {
	
}*/