package org.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.model.FruitModel;
import org.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/fruit")
public class FruitsController
{
	private static final Logger LOG = Logger.getLogger(FruitsController.class);

	@Autowired
	private FruitService fruitService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)

	public void create(@RequestBody FruitModel fruitModel)
	{
		fruitService.crate(fruitModel);
	}

	@RequestMapping(value = "/getAllFruits", method = RequestMethod.GET)
	public List<FruitModel> getAllFruits()
	{
		return fruitService.getAllFruits();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public FruitModel getFruitById(@PathVariable final int id)
	{
		return fruitService.getFruitById(id);
	}

	@RequestMapping(value = "/{id}/update", method = RequestMethod.PUT)
	public void update(@RequestBody FruitModel fruitModel,@PathVariable final int id)
	{
		fruitService.update(id,fruitModel);
	}

}
