// ***************************************************************************
// Copyright (c) 2014, Industrial Logic, Inc., All Rights Reserved.
//
// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
// used by students during Industrial Logic's workshops or by individuals
// who are being coached by Industrial Logic on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Industrial Logic, Inc.
// ****************************************************************************

package com.industriallogic.encapsulation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
	private Card tenOfHearts;
	private Card twoOfHearts;
	private Card aceOfClubs;
	private Card kingOfDiamonds;
	private Card twoOfClubs;
	private Card twoOfSpades;
	private Card twoOfDiamonds;

	@Before
	public void setUp() {
		tenOfHearts = new Card(Rank.TEN, Suit.HEART);

		twoOfHearts = new Card(Rank.TWO, Suit.HEART);

		aceOfClubs = new Card(Rank.ACE, Suit.CLUB);

		kingOfDiamonds = new Card(Rank.KING, Suit.DIAMOND);

		twoOfClubs = new Card(Rank.TWO, Suit.CLUB);

		twoOfSpades = new Card(Rank.TWO, Suit.SPADE);

		twoOfDiamonds = new Card(Rank.TWO, Suit.DIAMOND);
	}

	@Test
	public void tenOfHeartsBeatsTwoOfHearts() {
		Assert.assertTrue(tenOfHearts.compare(twoOfHearts));
	}

	@Test
	public void aceOfClubsBeatsKingOfDiamonds() {
		Assert.assertTrue(aceOfClubs.compare(kingOfDiamonds));
	}

	@Test
	public void clubsBeatsHeartsForSameRank() {
		Assert.assertTrue(twoOfClubs.compare(twoOfHearts));
	}

	@Test
	public void heartsBeatsSpadesForSameRank() {
		Assert.assertTrue(twoOfHearts.compare(twoOfSpades));
	}

	@Test
	public void spadesBeatsDiamondsForSameRank() {
		Assert.assertTrue(twoOfSpades.compare(twoOfDiamonds));
	}

	@Test
	public void aCardIsNotGreaterThanItself() {
		Assert.assertFalse(twoOfSpades.compare(twoOfSpades));
	}

}
