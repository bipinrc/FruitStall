package org.dao.impl;

import java.util.List;
import java.util.Optional;

import org.dao.FruitDao;
import org.model.FruitModel;
import org.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class FruitDaoImpl implements FruitDao
{
	@Autowired
	FruitRepository fruitRepository;

	@Transactional
	public void create(final FruitModel fruitModel)
	{
		fruitRepository.save(fruitModel);
	}

	@Transactional
	public List<FruitModel> getAllFruits()
	{
		return fruitRepository.findAll();
	}

	@Transactional
	public FruitModel getFruitById(final int id)
	{
		Optional<FruitModel> fruitModel = fruitRepository.findById(id);
		return fruitModel.orElse(null);
	}
}
