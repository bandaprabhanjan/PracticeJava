package com.markerinterface.create;

public class MarkerEntityService  {
	
public boolean save(Object object) throws InvalidEntityFoundException{
	return new MarkerEntityDao().save(object);
}
}
