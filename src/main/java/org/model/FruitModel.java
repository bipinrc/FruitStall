package org.model;

import javax.persistence.*;


@Entity
@Table(name="Fruit")
public class FruitModel
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;

	@Column(name="fruitName")
	String fruitName;

	@Column(name="count")
	long count;

	public FruitModel() {
		super();
	}
	public FruitModel(int i, String fruitName,long count) {
		super();
		this.id = i;
		this.fruitName = fruitName;
		this.count=count;
	}

	public int getId()
	{
		return id;
	}

	public void setId(final int id)
	{
		this.id = id;
	}

	public String getFruitName()
	{
		return fruitName;
	}

	public void setFruitName(final String fruitName)
	{
		this.fruitName = fruitName;
	}

	public long getCount()
	{
		return count;
	}

	public void setCount(final long count)
	{
		this.count = count;
	}
}
