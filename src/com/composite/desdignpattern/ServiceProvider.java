package com.composite.desdignpattern;

import java.util.ArrayList;
import java.util.List;

import com.composite.desdignpattern.Service;

public class ServiceProvider implements Service {
	List<Service> serviceList = new ArrayList<Service>();

	@Override
	public void service(String serviceType) {
		for (Service service : serviceList) {
			service.service(serviceType);
		}
	}
	public void addService(Service service) {
		serviceList.add(service);
	}
	public void removeService(Service service) {
		serviceList.remove(service);
	}
	public void clearService(Service service) {
		serviceList.remove(service);
	}

}
