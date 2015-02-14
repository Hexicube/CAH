package org.tilegames.hexicube.cah.common;

import java.util.ArrayList;
import java.util.Random;

public class PlayingDeck
{
	private Random rand = new Random();
	
	private ArrayList<CardWithID> callCards;
	private ArrayList<CardWithID> responseCards;
	
	private ArrayList<CardWithID> callCardDiscards;
	private ArrayList<CardWithID> responseCardDiscards;
	
	public PlayingDeck(ArrayList<Deck> decks)
	{
		callCards = new ArrayList<CardWithID>();
		responseCards = new ArrayList<CardWithID>();
		callCardDiscards = new ArrayList<CardWithID>();
		responseCardDiscards = new ArrayList<CardWithID>();
		int cardID = 1;
		for(Deck d : decks)
		{
			if(d.isEnabled())
			{
				for(Card c : d.getCallCards()) callCards.add(new CardWithID(c.getCardText(), d.getShortDeckName(), -1));
				for(Card c : d.getResponseCards()) responseCards.add(new CardWithID(c.getCardText(), d.getShortDeckName(), cardID++));
			}
		}
	}
	
	public CardWithID getCallCard()
	{
		if(callCards.size() == 0)
		{
			while(callCardDiscards.size() > 0) callCards.add(callCardDiscards.remove(0));
		}
		CardWithID c = callCards.remove(rand.nextInt(callCards.size()));
		callCardDiscards.add(c);
		return c;
	}
	
	public CardWithID getResponseCard()
	{
		if(responseCards.size() == 0)
		{
			while(responseCardDiscards.size() > 0) responseCards.add(responseCardDiscards.remove(0));
		}
		CardWithID c = responseCards.remove(rand.nextInt(responseCards.size()));
		responseCardDiscards.add(c);
		return c;
	}
}