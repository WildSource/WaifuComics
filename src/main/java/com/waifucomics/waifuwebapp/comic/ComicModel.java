package com.waifucomics.waifuwebapp.comic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
@Entity
/**
 * This POJO represent data about a specific comic
 * 
 * @author wildsource
 *
 */
public class ComicModel
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ComicModel.class);

	private String name;
	private String artist;

	private int nbPages;
	/**
	 * Default Constructor for spring boot
	 */
	public ComicModel(){}

	/**
	 * Actual constructor used. Will throw BeanCreationException if any String are null
	 * and/or int are 0 or negative
	 * 
	 * @param name
	 * @param artist
	 * @param nbPages
	 * @throws BeanCreationException
	 */
	public ComicModel(String name, String artist, int nbPages) throws BeanCreationException
	{
		if (name != null && artist != null && nbPages > 0)
		{
			this.name = name;
			this.artist = artist;
			this.nbPages = nbPages;
		} else
		{
			throw new BeanCreationException("name of comic null /n" + "or /n" + "name of artist null /n" + "or /n"
					+ "number of pages zero or negative");
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name != null)
		{
			this.name = name;
		} else
		{
			LOGGER.error("Tried to set invalid name: " + name);
		}
	}

	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		if (artist != null)
		{
			this.artist = artist;
		} else
		{
			LOGGER.error("Tried to set invalid artist name: " + artist);
		}

	}

	public int getNbPages()
	{
		return nbPages;
	}

	public void setNbPages(int nbPages)
	{
		if (nbPages > 0)
		{
			this.nbPages = nbPages;
		} else
		{
			LOGGER.error("Tried to set invalid artist name: " + nbPages);
		}
	}

}
