package board;

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
		//connections = loadConnections();
	}
	
	private List<Connection> loadConnections() { // load Connections from data
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