package org.repository;

import org.model.FruitModel;
import org.springframework.data.repository.CrudRepository;


public interface FruitRepository extends CrudRepository<FruitModel,Integer>
{
}
