package org.java.springintro.repository;

import java.util.List;


import org.java.springintro.dto.Destination;


public interface DestinationRep {
	String save(Destination destination);
	String update(Destination destination);
	String delete(int id);
	Destination getById(int id);
	List<Destination> getByName(String name);
	List<Destination> getAll();
}
