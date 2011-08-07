package ru.iteco.server;

import java.util.ArrayList;
import java.util.List;

import ru.iteco.client.MockRegistriesTable;
import ru.iteco.client.RegistryService;
import ru.iteco.client.model.Registry;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class RegistryServiceImpl extends RemoteServiceServlet implements
		RegistryService {

	private static final long serialVersionUID = -8090610974024089083L;
	
	public List<Registry> findRegistries(int pageSize, int pageNumber) {
		List<Registry> mockList = MockRegistriesTable.getMockData();
		List<Registry> regList = new ArrayList<Registry>();
		for (int i = (pageNumber - 1)*pageSize; i < pageNumber*pageSize - 1; i++) {
			regList.add(mockList.get(i));
		}
		
		return regList;
	}

}
