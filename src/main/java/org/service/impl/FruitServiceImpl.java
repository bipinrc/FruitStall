package org.service.impl;

import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.dao.FruitDao;
import org.model.FruitModel;
import org.service.FruitService;
import org.springframework.stereotype.Component;


@Component("fruitService")
public class FruitServiceImpl implements FruitService
{
	private static final Logger LOG = Logger.getLogger(FruitServiceImpl.class);
	private FruitDao fruitDao;

	@Override
	public void crate(final FruitModel fruitModel)
	{
		fruitDao.create(fruitModel);
		LOG.info("Created fruit " + fruitModel.getFruitName() + " successfully !!!");
	}

	@Override
	public List<FruitModel> getAllFruits()
	{
		return fruitDao.getAllFruits();
	}

	@Override
	public FruitModel getFruitById(final int id)
	{
		return fruitDao.getFruitById(id);
	}

	@Override
	public void update(final int id, final FruitModel fruitModel)
	{
		FruitModel model = fruitDao.getFruitById(id);
		if (Objects.nonNull(model))
		{
			fruitModel.setId(id);
			fruitDao.create(fruitModel);
			LOG.info("Updated fruit " + fruitModel.getFruitName() + " successfully !!!");
		}
		else
		{
			LOG.error("No fruits for the ID : " + id);
			throw new IllegalArgumentException("No fruits for the provided ID!!!!!");
		}
	}

	public FruitDao getFruitDao()
	{
		return fruitDao;
	}

	public void setFruitDao(final FruitDao fruitDao)
	{
		this.fruitDao = fruitDao;
	}
}
