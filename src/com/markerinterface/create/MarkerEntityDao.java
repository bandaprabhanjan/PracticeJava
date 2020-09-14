package com.markerinterface.create;

public class MarkerEntityDao {
	public boolean save(Object object) throws InvalidEntityFoundException {
		boolean isSaved = false;
		if (!(object instanceof MarkerEntity)) {
			throw new InvalidEntityFoundException("Invalid Entity Found, Can't be saved");
		} else {
			isSaved = true;
			System.out.println("Entity saved to database");
		}
		return isSaved;

	}
}
