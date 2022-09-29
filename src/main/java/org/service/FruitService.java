package org.service;

import java.util.List;

import org.model.FruitModel;


public interface FruitService
{
	void crate(FruitModel fruitModel);

	List<FruitModel> getAllFruits();

	FruitModel getFruitById(int id);

	void update(int id, FruitModel fruitModel);
}
