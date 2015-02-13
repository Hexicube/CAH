package org.tilegames.hexicube.cah.common.decks;

import org.tilegames.hexicube.cah.common.Deck;
import org.tilegames.hexicube.cah.common.Card;

public class DeckTG extends Deck
{
	private static final Card[] callCards = new Card[]{
		new Card("____: ____ in fiction, ____ on the tabletop.", true),
		new Card("I proxy ____ using a second-hand ____.", true),
		new Card("Next up: Lord Lysander's paints ____.", true),
		new Card("The citizens of Innsmouth are really ____!", true),
		new Card("I am Angry, Angry about ____.", true),
		new Card("In respect to your chapter, the Blood Ravens have dedicated one of their____to ____.", true),
		new Card("Roll for ____.", true),
		new Card("I prepared ____ this morning.", true),
		new Card("The bard nearly got us killed when he rolled to seduce ____.", true),
		new Card("____ causes the Paladin to fall", true),
		new Card("The door to the FLGS opens and a ____ walks in!", true),
		new Card("GW stores no longer stock____", true),
		new Card("The price on ____ Has doubled!", true),
		new Card("____ falls, everyone dies.", true),
		new Card("My GM just made his girlfriend a ____ character. How fucked are we?", true),
		new Card("If you buy a camel, Crazy Hassan is adding in free ____ this week only!", true),
		new Card("Around elves, watch ____", true),
		new Card("The only good ____ is a dead ____", true),
		new Card("...And then he killed the Tarasque with a ____", true),
		new Card("There is a ____ on the roof.", true),
		new Card("What are we going to argue about today?", true),
		new Card("I got a box today. What's inside? ____", true),
		new Card("Roll ____ circumference", true),
		new Card("What I made: ____.<br>What the DM saw: ____.<br>What I played: ____", true),
		new Card("____ vs. ____: Critical Hit!", true),
		new Card("Then the barbarian drank from the ____-filled fountain", true),
		new Card("____: That was a thing.", true),
		new Card("&gt;preferring 3D women over ____", true),
		new Card("Where we're going, we won't need ____ to see", true),
		new Card("You encounter a Gazebo. You respond with ____", true),
		new Card("D&amp;D: 6th edition will feature ____ as a main race!", true),
		new Card("Your Natural 1 summons ____.", true),
		new Card("It would have taken ____ to..... CREEEEEEEEEED!", true),
		new Card("Can ____ bloom on the battlefield?", true),
		new Card("&gt;mfw ____.", true),
		new Card("____? That's ULTRA heretical", true),
		new Card("So I made my chapter insignia ____", true),
		new Card("In the grim darkness of the far future there is only ____", true),
		new Card("2e or ____", true),
		new Card("Blood for the blood god! ____ for the ____!", true),
		new Card("____. we don't need other boards anymore!", true),
		new Card("____ just fucked us", true),
		new Card("The guard looks a troubled, uncomfortable glare, like a man who must explain to his ____, that's its dreams of becoming ____ will never happen.", true),
		new Card("Dwarf Fortress needs more ____", true),
		new Card("My ____ are moving on their own", true),
		new Card("Welcome to the ____ Quest Thread.", true),
		new Card("You should never let your bard ____.", true),
		new Card("That one guy in my group always rolls a chaotic neutral ____.", true),
		new Card("The lich's phylactery is a  ____!", true),
		new Card("Macha was dismayed to find out that ____.", true),
		new Card("Never fire ____ at the bulkhead!", true),
		new Card("____ is the only way I can forget about 4e.", true),
		new Card("I sure hope no one notices that I inserted my ____ fetish into the game.", true),
		new Card("Behold! White Wolf's newest game: ____: the ____.", true),
		new Card("For our upcoming FATAL game, I've assigned ____ as your new character.", true),
		new Card("The GM has invited his new ____ to join the game. They'll be playing ____.", true),
		new Card("0/10 would not ____.", true),
		new Card("The ____ guides my blade.", true),
		new Card("Don't touch me ____!", true),
		new Card("Mountain, Black lotus, sac, to cast ____.", true),
		new Card("____ followed by gratuitous ____ is how I got kicked out off my last group.", true),
		new Card("Everybody was surprised when the king's trusted adviser turned out to be ____.", true),
		new Card("You and ____ must stop ____ with the ancient artifact ____.", true),
		new Card("Elf ____ Wat do?", true),
		new Card("Magic the Gathering's next set is themed around ____.", true),
		new Card("We knew the game was off to a good start when the GM didn't veto a player's decision to play as ____.", true),
		new Card("My Kriegers came in a box of ____!", true),
		new Card("I had to kill a party member when wasted 2 hours by ____.", true),
		new Card("We found ____in the Dragon's hoard.", true),
		new Card("What's on today's agenda for the mage guild meeting?", true),
		new Card("____ is the only way to fix 3.5.", true),
		new Card("What is the BBEG's secret weapon?", true),
		new Card("Ach! Hans run! It's the ____!", true),
		new Card("The enemy's ____ is down.", true),
		new Card("Only fags play mono____.", true),
		new Card("What is better than 3D women?", true),
		new Card("I kept getting weird looks at FNM when I brought my new ____ card sleeves.", true),
		new Card("I like to dress up like ____ and hit people with foam swords.", true),
		new Card("You've been cursed by the witch! Your ____ has turned into a ____!", true),
		new Card("The adventure was going fine until the BBEG put ____ in our path.", true),
		new Card("Your BBEG is actually ____!", true),
		new Card("The last straw was the Chaotic Neutral buying a case of ____.", true),
		new Card("What won't the Bard fuck?.", true),
		new Card("____! what was that?", true),
		new Card("You roll 00 for your magical mishap and turn into ____.", true),
		new Card("You fool! you fell victim to one of the classic blunders: ____.", true),
		new Card("...and then the bastard pulled out ____ and placed it on the table.", true),
		new Card("I cast magic missile at ____.", true),
		new Card("Wait! I'm a ____! Let me tell you about my ____!", true),
		new Card("Whenever we run ____, it's customary that ____ pays for the group's pizza.", true),
	}, responseCards = new Card[]{
		new Card("HERESY!", false),
		new Card("/sp/", false),
		new Card("Call of Cthulhu", false),
		new Card("Corruption of Champions", false),
		new Card("Spess mehrines", false),
		new Card("Paladin", false),
		new Card("Rogue", false),
		new Card("Blackguard", false),
		new Card("¡MAGOOOOOOOOOOOS DEL TIEMPOOOOOOOOOOOOOO!", false),
		new Card("Lich", false),
		new Card("A Mastercraft Greatsword", false),
		new Card("A Bag of Holding full of Portable Holes", false),
		new Card("Explosive Runes", false),
		new Card("Wizard", false),
		new Card("Pelor", false),
		new Card("Lady of Pain", false),
		new Card("Spelljammer", false),
		new Card("Druidic Mysteries", false),
		new Card("The MacGuffin", false),
		new Card("My Magical Realm", false),
		new Card("A Literal White Knight", false),
		new Card("A Literal Black Knight", false),
		new Card("A Big, Black Knight", false),
		new Card("A Bigger, Blacker Knight", false),
		new Card("The Biggest, Blackest Knight", false),
		new Card("Brogan", false),
		new Card("stat me", false),
		new Card("/co/", false),
		new Card("/d/", false),
		new Card("/x/", false),
		new Card("The whizzard", false),
		new Card("Mary Sue", false),
		new Card("Crazy Hassan", false),
		new Card("&gt;BLAM", false),
		new Card("Gork and Mork", false),
		new Card("Hour long quest adventures over Omegle", false),
		new Card("Skip the bullshit and go straight to banging", false),
		new Card("Anthropomorphism in 40K", false),
		new Card("Surf ninjas", false),
		new Card("Being a motherfucking sorcerer", false),
		new Card("Fa/tg/uy", false),
		new Card("A diaper of holding flamethrower", false),
		new Card("Peasant railguns", false),
		new Card("Sexbots", false),
		new Card("Chaotic randumb", false),
		new Card("That guy", false),
		new Card("Laughing Eldar", false),
		new Card("Your FLGS", false),
		new Card("Roll-play", false),
		new Card("Goddamn magpies", false),
		new Card("Diplomacy", false),
		new Card("Metal Boxes", false),
		new Card("That DM", false),
		new Card("LIIVI", false),
		new Card("Lofn", false),
		new Card("NONE PURER!!!", false),
		new Card("Haters gonna hate", false),
		new Card("THIN YOUR PAINTS", false),
		new Card("An Imperial titan", false),
		new Card("GMPC", false),
		new Card("Elf vaginas", false),
		new Card("Subtle pigmen", false),
		new Card("Falling Rocks", false),
		new Card("Attacking the darkness", false),
		new Card("The emprah", false),
		new Card("Blood for the blood god", false),
		new Card("Thick and luxurious neckbeards", false),
		new Card("KUUUUUUUBOOOOOOOOO!", false),
		new Card("AC Guy's luck", false),
		new Card("Canon fanfiction", false),
		new Card("Rolling straight 1s", false),
		new Card("Sexy, barely-legal Thri-kreen", false),
		new Card("Overpowered katanas", false),
		new Card("Getting 'Squatted'", false),
		new Card("Fucking kender", false),
		new Card("TIIIIIMMMME WIIIIZZZZAAAAARRRDDDDs!", false),
		new Card("-4 str", false),
		new Card("Lenore", false),
		new Card("Dorfs", false),
		new Card("THAC0", false),
		new Card("Your Spiritual Liege, Matt Ward", false),
		new Card("Skub", false),
		new Card("Vectron, his name be praised.", false),
		new Card("Vectron's kindly claw.", false),
		new Card("Doomrider and his cocaine", false),
		new Card("The GM's girlfriend", false),
		new Card("A first edition copy of FATAL", false),
		new Card("A vagina full of spiders", false),
		new Card("A bear in a disguise", false),
		new Card("DC 80 Escape Artist check", false),
		new Card("DRAGON DILDOS", false),
		new Card("Decanter of endless water rocket", false),
		new Card("Necronomicon", false),
		new Card("Joshua-the embodiment of male self loathing", false),
		new Card("d4 caltrops", false),
		new Card("An army made of sprues", false),
		new Card("Meatbread", false),
		new Card("Xeno scum", false),
		new Card("Muckin' about", false),
		new Card("Enuff Dakka", false),
		new Card("Deep Rot", false),
		new Card("Caster Edition Fanboys.", false),
		new Card("Monte Cooke's rancid fursuit.", false),
		new Card("Kickstarting a /tg/ homebrew only to have it turn out to be shit.", false),
		new Card("Waiting for Time Wizards!", false),
		new Card("Covering yourself in mountain dew and rolling around the FLGS bathroom.", false),
		new Card("A magical piss forest.", false),
		new Card("Asking to play a pony in a Game of Thrones rpg.", false),
		new Card("Half-fae catboys.", false),
		new Card("SAN loss.", false),
		new Card("Dakkon Motherfucking Blackblade", false),
		new Card("Mark Rosewater", false),
		new Card("Chimney Imp", false),
		new Card("Storm Crow", false),
		new Card("Big Blue Boy", false),
		new Card("Fisk Malks", false),
		new Card("Madolche?", false),
		new Card("Filthy Casual", false),
		new Card("If only Tom Bombadil gave a fuck.", false),
		new Card("Gratuitous Babe Art", false),
		new Card("Failing your Privilege Check and taking full damage from the Tumblrdragon's breath weapon", false),
		new Card("People who don't understand THAC0.", false),
		new Card("People who use THAC0.", false),
		new Card("Declaring a TIME MOMENT when the TM is about to say something important.", false),
		new Card("Coasters", false),
		new Card("Moot", false),
		new Card("Saying goodbye to Exodia.", false),
		new Card("A railroad with no end.", false),
		new Card("Edition wars.", false),
		new Card("Riding the Jund train at full throttle.", false),
		new Card("Metagaming.", false),
		new Card("Playing for the story.", false),
		new Card("Glorified games of pretend.", false),
		new Card("Frost Giants", false),
		new Card("A robotic ninja catgirl maid", false),
		new Card("Please do not take the items.", false),
		new Card("Kord", false),
		new Card("Queen of Blades", false),
		new Card("Boxcars", false),
		new Card("A Natural 20", false),
		new Card("Hypercube", false),
		new Card("A falling Paladin", false),
		new Card("Children's Card Games", false),
		new Card("Cardgames on motorcycles.", false),
		new Card("Mise.", false),
		new Card("Crawdaddy.", false),
		new Card("Jace:the Wallet Sculptor.", false),
		new Card("Grim dark darkness that's grim.", false),
		new Card("Virgin Spike.", false),
		new Card("Choo choo, motherfucker.", false),
		new Card("Squats.", false),
		new Card("Sabbat Warhero", false),
		new Card("Shitting all over the DM's plans.", false),
		new Card("Chaos Spawn.", false),
		new Card("Satanic rituals and human sacrifice.", false),
		new Card("Suggesting GURPS. No matter what.", false),
		new Card("Old Man Henderson.", false),
		new Card("Monstergirls.", false),
		new Card("Grognard", false),
		new Card("Scary Spooky Skeletons", false),
		new Card("No sense of right and wrong", false),
		new Card("Goblins", false),
		new Card("Kharne", false),
		new Card("Eldrad", false),
		new Card("Sister of Battle lesbian hebephilia", false),
		new Card("FATE", false),
		new Card("Bad at Magic", false),
		new Card("Time Cube chess", false),
		new Card("Noh", false),
		new Card("Tankred Endures", false),
		new Card("FOR THE EMPRAH", false),
		new Card("CREEEEEEEEEEED!", false),
		new Card("Shitposting", false),
		new Card("A Kobold princess", false),
		new Card("Kebab", false),
		new Card("Los Tiburon", false),
		new Card("CLANG!", false),
		new Card("Commissar Fuklaw", false),
		new Card("F.A.T.A.L.", false),
		new Card("Female Space Marines", false),
		new Card("An orc guarding a chest in a 10x10 room", false),
		new Card("Captcha", false),
		new Card("Ruby and Tom", false),
		new Card("Pun-Pun", false),
		new Card("I CAST FIST!", false),
		new Card("Cultist-Chan", false),
		new Card("100-ton Atlas-class Mech", false),
		new Card("Ciaphas Cain", false),
		new Card("Oinkbane The Wereboar Assassin", false),
		new Card("orkupy waaaghstreet", false),
		new Card("Bard dad", false),
		new Card("Warhammer 40k", false),
		new Card("Warhammer Fantasy", false),
		new Card("Bloodbowl", false),
		new Card("Games Workshop", false),
		new Card("Dungeons and Dragons", false),
		new Card("Pathfinder", false),
		new Card("Magic: the Gathering", false),
		new Card("Engine Heart", false),
		new Card("Yu-Gi-Oh", false),
		new Card("Pokémon TCG", false),
		new Card("Pokemon: Tabletop Adventures", false),
		new Card("Vampire: The Masquerade", false),
		new Card("Vampire LARP", false),
		new Card("Hungarian Larper", false),
		new Card("Esh-Esh", false),
		new Card("Dice Bags", false),
		new Card("Bitches for Thulsa Doom", false),
		new Card("Conan the Librarian", false),
		new Card("Conan the Libertarian", false),
		new Card("Show me Your Honor", false),
		new Card("Blood and Thunder!", false),
		new Card("Actually having an intelligent discussion about religion.", false),
		new Card("Blood for the Blood God!", false),
		new Card("WAAAAAAAAAAGH!", false),
		new Card("Female DM", false),
		new Card("Buying GW paints and primer", false),
		new Card("Your Other Honor!", false),
		new Card("Kromgol", false),
		new Card("Tyrone the Monk", false),
		new Card("Mr. Fred Rogers, blessed be his name.", false),
		new Card("The ship is all. The ship moves", false),
		new Card("Haggard", false),
		new Card("Living Saint Inquisitor Grendel", false),
		new Card("METAL BOXES", false),
		new Card("100 Baneblades", false),
		new Card("Gav &amp; Bob", false),
		new Card("MR RAGE", false),
		new Card("Abaddon the Armless", false),
		new Card("Sigmar", false),
		new Card("Cthulhu himself", false),
		new Card("Nyarlathotep", false),
		new Card("The Great Race of Yith", false),
		new Card("Shub-Niggurath", false),
		new Card("Deep Ones", false),
		new Card("Yog-Sothoth", false),
		new Card("Azathoth", false),
		new Card("The King in Yellow", false),
		new Card("The Queen in Yellow", false),
		new Card("Saya no Uta", false),
		new Card("Haiyore Nyaruko-San", false),
		new Card("A boat", false),
		new Card("Faptau", false),
		new Card("Shlicktau", false),
		new Card("A shoggoth", false),
		new Card("Transformation Fetishists", false),
		new Card("Scat Fetish", false),
		new Card("Watersports Fetish", false),
		new Card("Blood Ravens", false),
		new Card("Ultramarines", false),
		new Card("DJ Phylactery", false),
		new Card("Muscle Wizard", false),
		new Card("Sir Bearington", false),
		new Card("2 cat", false),
		new Card("Dr. Assmarbles", false),
		new Card("/d/M", false),
		new Card("Macha's stash of mon-keigh lewds.", false),
		new Card("A Tactical Genius.", false),
		new Card("Blast Templates.", false),
		new Card("Decking from a room in a love hotel.", false),
		new Card("Teacup Ride.", false),
		new Card("WHERE IS FELIX RAMIREZ?", false),
		new Card("Teaching the newbie about THE SYSTEM.", false),
		new Card("Dealing Meat Damage.", false),
		new Card("America-san.", false),
		new Card("Having a Spy Moment.", false),
		new Card("Burning Fate Points to survive.", false),
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