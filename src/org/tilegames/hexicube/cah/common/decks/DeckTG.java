package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckTG extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("_: _ in fiction, _ on the tabletop."),
		new Card("I proxy _ using a second-hand _."),
		new Card("Next up: Lord Lysander's paints _."),
		new Card("The citizens of Innsmouth are really _!"),
		new Card("I am Angry, Angry about _."),
		new Card("In respect to your chapter, the Blood Ravens have dedicated one of their____to _."),
		new Card("Roll for _."),
		new Card("I prepared _ this morning."),
		new Card("The bard nearly got us killed when he rolled to seduce _."),
		new Card("_ causes the Paladin to fall"),
		new Card("The door to the FLGS opens and a _ walks in!"),
		new Card("GW stores no longer stock____"),
		new Card("The price on _ Has doubled!"),
		new Card("_ falls, everyone dies."),
		new Card("My GM just made his girlfriend a _ character. How fucked are we?"),
		new Card("If you buy a camel, Crazy Hassan is adding in free _ this week only!"),
		new Card("Around elves, watch _"),
		new Card("The only good _ is a dead _"),
		new Card("...And then he killed the Tarasque with a _"),
		new Card("There is a _ on the roof."),
		new Card("What are we going to argue about today?"),
		new Card("I got a box today. What's inside? _"),
		new Card("Roll _ circumference"),
		new Card("What I made: _.<br>What the DM saw: _.<br>What I played: _"),
		new Card("_ vs. _: Critical Hit!"),
		new Card("Then the barbarian drank from the _-filled fountain"),
		new Card("_: That was a thing."),
		new Card("&gt;preferring 3D women over _"),
		new Card("Where we're going, we won't need _ to see"),
		new Card("You encounter a Gazebo. You respond with _"),
		new Card("D&amp;D: 6th edition will feature _ as a main race!"),
		new Card("Your Natural 1 summons _."),
		new Card("It would have taken _ to..... CREEEEEEEEEED!"),
		new Card("Can _ bloom on the battlefield?"),
		new Card("&gt;mfw _."),
		new Card("_? That's ULTRA heretical"),
		new Card("So I made my chapter insignia _"),
		new Card("In the grim darkness of the far future there is only _"),
		new Card("2e or _"),
		new Card("Blood for the blood god! _ for the _!"),
		new Card("_. we don't need other boards anymore!"),
		new Card("_ just fucked us"),
		new Card("The guard looks a troubled, uncomfortable glare, like a man who must explain to his _, that's its dreams of becoming _ will never happen."),
		new Card("Dwarf Fortress needs more _"),
		new Card("My _ are moving on their own"),
		new Card("Welcome to the _ Quest Thread."),
		new Card("You should never let your bard _."),
		new Card("That one guy in my group always rolls a chaotic neutral _."),
		new Card("The lich's phylactery is a  _!"),
		new Card("Macha was dismayed to find out that _."),
		new Card("Never fire _ at the bulkhead!"),
		new Card("_ is the only way I can forget about 4e."),
		new Card("I sure hope no one notices that I inserted my _ fetish into the game."),
		new Card("Behold! White Wolf's newest game: _: the _."),
		new Card("For our upcoming FATAL game, I've assigned _ as your new character."),
		new Card("The GM has invited his new _ to join the game. They'll be playing _."),
		new Card("0/10 would not _."),
		new Card("The _ guides my blade."),
		new Card("Don't touch me _!"),
		new Card("Mountain, Black lotus, sac, to cast _."),
		new Card("_ followed by gratuitous _ is how I got kicked out off my last group."),
		new Card("Everybody was surprised when the king's trusted adviser turned out to be _."),
		new Card("You and _ must stop _ with the ancient artifact _."),
		new Card("Elf _ Wat do?"),
		new Card("Magic the Gathering's next set is themed around _."),
		new Card("We knew the game was off to a good start when the GM didn't veto a player's decision to play as _."),
		new Card("My Kriegers came in a box of _!"),
		new Card("I had to kill a party member when wasted 2 hours by _."),
		new Card("We found ____in the Dragon's hoard."),
		new Card("What's on today's agenda for the mage guild meeting?"),
		new Card("_ is the only way to fix 3.5."),
		new Card("What is the BBEG's secret weapon?"),
		new Card("Ach! Hans run! It's the _!"),
		new Card("The enemy's _ is down."),
		new Card("Only fags play mono____."),
		new Card("What is better than 3D women?"),
		new Card("I kept getting weird looks at FNM when I brought my new _ card sleeves."),
		new Card("I like to dress up like _ and hit people with foam swords."),
		new Card("You've been cursed by the witch! Your _ has turned into a _!"),
		new Card("The adventure was going fine until the BBEG put _ in our path."),
		new Card("Your BBEG is actually _!"),
		new Card("The last straw was the Chaotic Neutral buying a case of _."),
		new Card("What won't the Bard fuck?."),
		new Card("_! what was that?"),
		new Card("You roll 00 for your magical mishap and turn into _."),
		new Card("You fool! you fell victim to one of the classic blunders: _."),
		new Card("...and then the bastard pulled out _ and placed it on the table."),
		new Card("I cast magic missile at _."),
		new Card("Wait! I'm a _! Let me tell you about my _!"),
		new Card("Whenever we run _, it's customary that _ pays for the group's pizza.")
	}, responseCards = new Card[]{
		new Card("HERESY!"),
		new Card("/sp/"),
		new Card("Call of Cthulhu"),
		new Card("Corruption of Champions"),
		new Card("Spess mehrines"),
		new Card("Paladin"),
		new Card("Rogue"),
		new Card("Blackguard"),
		new Card("¡MAGOOOOOOOOOOOS DEL TIEMPOOOOOOOOOOOOOO!"),
		new Card("Lich"),
		new Card("A Mastercraft Greatsword"),
		new Card("A Bag of Holding full of Portable Holes"),
		new Card("Explosive Runes"),
		new Card("Wizard"),
		new Card("Pelor"),
		new Card("Lady of Pain"),
		new Card("Spelljammer"),
		new Card("Druidic Mysteries"),
		new Card("The MacGuffin"),
		new Card("My Magical Realm"),
		new Card("A Literal White Knight"),
		new Card("A Literal Black Knight"),
		new Card("A Big, Black Knight"),
		new Card("A Bigger, Blacker Knight"),
		new Card("The Biggest, Blackest Knight"),
		new Card("Brogan"),
		new Card("stat me"),
		new Card("/co/"),
		new Card("/d/"),
		new Card("/x/"),
		new Card("The whizzard"),
		new Card("Mary Sue"),
		new Card("Crazy Hassan"),
		new Card("&gt;BLAM"),
		new Card("Gork and Mork"),
		new Card("Hour long quest adventures over Omegle"),
		new Card("Skip the bullshit and go straight to banging"),
		new Card("Anthropomorphism in 40K"),
		new Card("Surf ninjas"),
		new Card("Being a motherfucking sorcerer"),
		new Card("Fa/tg/uy"),
		new Card("A diaper of holding flamethrower"),
		new Card("Peasant railguns"),
		new Card("Sexbots"),
		new Card("Chaotic randumb"),
		new Card("That guy"),
		new Card("Laughing Eldar"),
		new Card("Your FLGS"),
		new Card("Roll-play"),
		new Card("Goddamn magpies"),
		new Card("Diplomacy"),
		new Card("Metal Boxes"),
		new Card("That DM"),
		new Card("LIIVI"),
		new Card("Lofn"),
		new Card("NONE PURER!!!"),
		new Card("Haters gonna hate"),
		new Card("THIN YOUR PAINTS"),
		new Card("An Imperial titan"),
		new Card("GMPC"),
		new Card("Elf vaginas"),
		new Card("Subtle pigmen"),
		new Card("Falling Rocks"),
		new Card("Attacking the darkness"),
		new Card("The emprah"),
		new Card("Blood for the blood god"),
		new Card("Thick and luxurious neckbeards"),
		new Card("KUUUUUUUBOOOOOOOOO!"),
		new Card("AC Guy's luck"),
		new Card("Canon fanfiction"),
		new Card("Rolling straight 1s"),
		new Card("Sexy, barely-legal Thri-kreen"),
		new Card("Overpowered katanas"),
		new Card("Getting 'Squatted'"),
		new Card("Fucking kender"),
		new Card("TIIIIIMMMME WIIIIZZZZAAAAARRRDDDDs!"),
		new Card("-4 str"),
		new Card("Lenore"),
		new Card("Dorfs"),
		new Card("THAC0"),
		new Card("Your Spiritual Liege, Matt Ward"),
		new Card("Skub"),
		new Card("Vectron, his name be praised."),
		new Card("Vectron's kindly claw."),
		new Card("Doomrider and his cocaine"),
		new Card("The GM's girlfriend"),
		new Card("A first edition copy of FATAL"),
		new Card("A vagina full of spiders"),
		new Card("A bear in a disguise"),
		new Card("DC 80 Escape Artist check"),
		new Card("DRAGON DILDOS"),
		new Card("Decanter of endless water rocket"),
		new Card("Necronomicon"),
		new Card("Joshua-the embodiment of male self loathing"),
		new Card("d4 caltrops"),
		new Card("An army made of sprues"),
		new Card("Meatbread"),
		new Card("Xeno scum"),
		new Card("Muckin' about"),
		new Card("Enuff Dakka"),
		new Card("Deep Rot"),
		new Card("Caster Edition Fanboys."),
		new Card("Monte Cooke's rancid fursuit."),
		new Card("Kickstarting a /tg/ homebrew only to have it turn out to be shit."),
		new Card("Waiting for Time Wizards!"),
		new Card("Covering yourself in mountain dew and rolling around the FLGS bathroom."),
		new Card("A magical piss forest."),
		new Card("Asking to play a pony in a Game of Thrones rpg."),
		new Card("Half-fae catboys."),
		new Card("SAN loss."),
		new Card("Dakkon Motherfucking Blackblade"),
		new Card("Mark Rosewater"),
		new Card("Chimney Imp"),
		new Card("Storm Crow"),
		new Card("Big Blue Boy"),
		new Card("Fisk Malks"),
		new Card("Madolche?"),
		new Card("Filthy Casual"),
		new Card("If only Tom Bombadil gave a fuck."),
		new Card("Gratuitous Babe Art"),
		new Card("Failing your Privilege Check and taking full damage from the Tumblrdragon's breath weapon"),
		new Card("People who don't understand THAC0."),
		new Card("People who use THAC0."),
		new Card("Declaring a TIME MOMENT when the TM is about to say something important."),
		new Card("Coasters"),
		new Card("Moot"),
		new Card("Saying goodbye to Exodia."),
		new Card("A railroad with no end."),
		new Card("Edition wars."),
		new Card("Riding the Jund train at full throttle."),
		new Card("Metagaming."),
		new Card("Playing for the story."),
		new Card("Glorified games of pretend."),
		new Card("Frost Giants"),
		new Card("A robotic ninja catgirl maid"),
		new Card("Please do not take the items."),
		new Card("Kord"),
		new Card("Queen of Blades"),
		new Card("Boxcars"),
		new Card("A Natural 20"),
		new Card("Hypercube"),
		new Card("A falling Paladin"),
		new Card("Children's Card Games"),
		new Card("Cardgames on motorcycles."),
		new Card("Mise."),
		new Card("Crawdaddy."),
		new Card("Jace:the Wallet Sculptor."),
		new Card("Grim dark darkness that's grim."),
		new Card("Virgin Spike."),
		new Card("Choo choo, motherfucker."),
		new Card("Squats."),
		new Card("Sabbat Warhero"),
		new Card("Shitting all over the DM's plans."),
		new Card("Chaos Spawn."),
		new Card("Satanic rituals and human sacrifice."),
		new Card("Suggesting GURPS. No matter what."),
		new Card("Old Man Henderson."),
		new Card("Monstergirls."),
		new Card("Grognard"),
		new Card("Scary Spooky Skeletons"),
		new Card("No sense of right and wrong"),
		new Card("Goblins"),
		new Card("Kharne"),
		new Card("Eldrad"),
		new Card("Sister of Battle lesbian hebephilia"),
		new Card("FATE"),
		new Card("Bad at Magic"),
		new Card("Time Cube chess"),
		new Card("Noh"),
		new Card("Tankred Endures"),
		new Card("FOR THE EMPRAH"),
		new Card("CREEEEEEEEEEED!"),
		new Card("Shitposting"),
		new Card("A Kobold princess"),
		new Card("Kebab"),
		new Card("Los Tiburon"),
		new Card("CLANG!"),
		new Card("Commissar Fuklaw"),
		new Card("F.A.T.A.L."),
		new Card("Female Space Marines"),
		new Card("An orc guarding a chest in a 10x10 room"),
		new Card("Captcha"),
		new Card("Ruby and Tom"),
		new Card("Pun-Pun"),
		new Card("I CAST FIST!"),
		new Card("Cultist-Chan"),
		new Card("100-ton Atlas-class Mech"),
		new Card("Ciaphas Cain"),
		new Card("Oinkbane The Wereboar Assassin"),
		new Card("orkupy waaaghstreet"),
		new Card("Bard dad"),
		new Card("Warhammer 40k"),
		new Card("Warhammer Fantasy"),
		new Card("Bloodbowl"),
		new Card("Games Workshop"),
		new Card("Dungeons and Dragons"),
		new Card("Pathfinder"),
		new Card("Magic: the Gathering"),
		new Card("Engine Heart"),
		new Card("Yu-Gi-Oh"),
		new Card("Pokémon TCG"),
		new Card("Pokemon: Tabletop Adventures"),
		new Card("Vampire: The Masquerade"),
		new Card("Vampire LARP"),
		new Card("Hungarian Larper"),
		new Card("Esh-Esh"),
		new Card("Dice Bags"),
		new Card("Bitches for Thulsa Doom"),
		new Card("Conan the Librarian"),
		new Card("Conan the Libertarian"),
		new Card("Show me Your Honor"),
		new Card("Blood and Thunder!"),
		new Card("Actually having an intelligent discussion about religion."),
		new Card("Blood for the Blood God!"),
		new Card("WAAAAAAAAAAGH!"),
		new Card("Female DM"),
		new Card("Buying GW paints and primer"),
		new Card("Your Other Honor!"),
		new Card("Kromgol"),
		new Card("Tyrone the Monk"),
		new Card("Mr. Fred Rogers, blessed be his name."),
		new Card("The ship is all. The ship moves"),
		new Card("Haggard"),
		new Card("Living Saint Inquisitor Grendel"),
		new Card("METAL BOXES"),
		new Card("100 Baneblades"),
		new Card("Gav &amp; Bob"),
		new Card("MR RAGE"),
		new Card("Abaddon the Armless"),
		new Card("Sigmar"),
		new Card("Cthulhu himself"),
		new Card("Nyarlathotep"),
		new Card("The Great Race of Yith"),
		new Card("Shub-Niggurath"),
		new Card("Deep Ones"),
		new Card("Yog-Sothoth"),
		new Card("Azathoth"),
		new Card("The King in Yellow"),
		new Card("The Queen in Yellow"),
		new Card("Saya no Uta"),
		new Card("Haiyore Nyaruko-San"),
		new Card("A boat"),
		new Card("Faptau"),
		new Card("Shlicktau"),
		new Card("A shoggoth"),
		new Card("Transformation Fetishists"),
		new Card("Scat Fetish"),
		new Card("Watersports Fetish"),
		new Card("Blood Ravens"),
		new Card("Ultramarines"),
		new Card("DJ Phylactery"),
		new Card("Muscle Wizard"),
		new Card("Sir Bearington"),
		new Card("2 cat"),
		new Card("Dr. Assmarbles"),
		new Card("/d/M"),
		new Card("Macha's stash of mon-keigh lewds."),
		new Card("A Tactical Genius."),
		new Card("Blast Templates."),
		new Card("Decking from a room in a love hotel."),
		new Card("Teacup Ride."),
		new Card("WHERE IS FELIX RAMIREZ?"),
		new Card("Teaching the newbie about THE SYSTEM."),
		new Card("Dealing Meat Damage."),
		new Card("America-san."),
		new Card("Having a Spy Moment."),
		new Card("Burning Fate Points to survive.")
	};
	
	@Override
	public String getDeckName()
	{
		return "[C] /tg/";
	}
	
	@Override
	public String getShortDeckName()
	{
		return "/tg/";
	}
	
	@Override
	public boolean officialDeck()
	{
		return true;
	}
	
	@Override
	public int numCallCards()
	{
		return callCards.length;
	}
	
	@Override
	public int numResponseCards()
	{
		return responseCards.length;
	}
	
	@Override
	public Card[] getCallCards()
	{
		return callCards;
	}
	
	@Override
	public Card[] getResponseCards()
	{
		return responseCards;
	}
}