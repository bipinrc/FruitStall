package org.dao;

import java.util.List;

import org.model.FruitModel;


public interface FruitDao
{
	void create(FruitModel fruitModel);

	List<FruitModel> getAllFruits();

	FruitModel getFruitById(int id);

}
