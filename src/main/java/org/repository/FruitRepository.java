package org.repository;

import org.model.FruitModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FruitRepository extends JpaRepository<FruitModel,Integer>
{
}
