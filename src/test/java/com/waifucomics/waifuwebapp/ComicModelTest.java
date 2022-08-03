package com.waifucomics.waifuwebapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.waifucomics.waifuwebapp.comic.ComicModel;

public class ComicModelTest
{
	private ComicModel model;

	@Before
	public void setUp() throws Exception
	{
		model = new ComicModel("ComicName", "ArtistName", 23);
	}

	@Test
	public void invalidConstructorTest()
	{
		try
		{
			ComicModel test = new ComicModel(null, "", 1);
			fail("Constructor validations not working");
		} catch (Exception e)
		{
		}

		try
		{
			ComicModel test = new ComicModel("ComicName", null, 1);
			fail("Constructor validations not working");
		} catch (Exception e)
		{
		}

		try
		{
			ComicModel test = new ComicModel("ComicName", null, -1);
			fail("Constructor validations not working");
		} catch (Exception e)
		{
		}
	}

	@Test
	public void getNameTest()
	{
		assertEquals("ComicName", model.getName());
	}

	@Test
	public void getArtistTest()
	{
		assertEquals("ArtistName", model.getArtist());
	}

	@Test
	public void getNbPageTest()
	{
		assertEquals(23, model.getNbPages());
	}

}
