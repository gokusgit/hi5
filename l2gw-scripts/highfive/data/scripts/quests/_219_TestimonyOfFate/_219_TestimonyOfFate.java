package quests._219_TestimonyOfFate;

import ru.l2gw.gameserver.model.L2ObjectsStorage;
import ru.l2gw.gameserver.model.instances.L2NpcInstance;
import ru.l2gw.gameserver.model.quest.Quest;
import ru.l2gw.gameserver.model.quest.QuestState;
import ru.l2gw.gameserver.model.quest.QuestTimer;

/**
 * Квест на вторую профессию Testimony Of Fate
 *
 * @author Sergey Ibryaev aka Artful
 */
public class _219_TestimonyOfFate extends Quest
{
	//NPC
	private static final int Kaira = 30476;
	private static final int Metheus = 30614;
	private static final int Ixia = 30463;
	private static final int AldersSpirit = 30613;
	private static final int Roa = 30114;
	private static final int Norman = 30210;
	private static final int Thifiell = 30358;
	private static final int Arkenia = 30419;
	private static final int BloodyPixy = 31845;
	private static final int BlightTreant = 31850;
	//QuestItem
	private static final int KairasLetter = 3173;
	private static final int MetheussFuneralJar = 3174;
	private static final int KasandrasRemains = 3175;
	private static final int HerbalismTextbook = 3176;
	private static final int IxiasList = 3177;
	private static final int MedusasIchor = 3178;
	private static final int MarshSpiderFluids = 3179;
	private static final int DeadSeekerDung = 3180;
	private static final int TyrantsBlood = 3181;
	private static final int NightshadeRoot = 3182;
	private static final int Belladonna = 3183;
	private static final int AldersSkull1 = 3184;
	private static final int AldersSkull2 = 3185;
	private static final int AldersReceipt = 3186;
	private static final int RevelationsManuscript = 3187;
	private static final int KairasRecommendation = 3189;
	private static final int KairasInstructions = 3188;
	private static final int PalusCharm = 3190;
	private static final int ThifiellsLetter = 3191;
	private static final int ArkeniasNote = 3192;
	private static final int PixyGarnet = 3193;
	private static final int BlightTreantSeed = 3199;
	private static final int GrandissSkull = 3194;
	private static final int KarulBugbearSkull = 3195;
	private static final int BrekaOverlordSkull = 3196;
	private static final int LetoOverlordSkull = 3197;
	private static final int BlackWillowLeaf = 3200;
	private static final int RedFairyDust = 3198;
	private static final int BlightTreantSap = 3201;
	private static final int ArkeniasLetter = 1246;
	//Items
	private static final int MarkofFate = 3172;
	//MOB
	private static final int HangmanTree = 20144;
	private static final int Medusa = 20158;
	private static final int MarshSpider = 20233;
	private static final int DeadSeeker = 20202;
	private static final int Tyrant = 20192;
	private static final int TyrantKingpin = 20193;
	private static final int MarshStakatoWorker = 20230;
	private static final int MarshStakato = 20157;
	private static final int MarshStakatoSoldier = 20232;
	private static final int MarshStakatoDrone = 20234;
	private static final int Grandis = 20554;
	private static final int KarulBugbear = 20600;
	private static final int BrekaOrcOverlord = 20270;
	private static final int LetoLizardmanOverlord = 20582;
	private static final int BlackWillowLurker = 27079;
	//Drop Cond
	//# [COND, NEWCOND, ID, REQUIRED, ITEM, NEED_COUNT, CHANCE, DROP]	
	private static final int[][] DROPLIST_COND = {
			{6, 0, Medusa, IxiasList, MedusasIchor, 10, 20, 1},
			{6, 0, MarshSpider, IxiasList, MarshSpiderFluids, 10, 20, 1},
			{6, 0, DeadSeeker, IxiasList, DeadSeekerDung, 10, 20, 1},
			{6, 0, Tyrant, IxiasList, TyrantsBlood, 10, 20, 1},
			{6, 0, TyrantKingpin, IxiasList, TyrantsBlood, 10, 60, 1},
			{6, 0, MarshStakatoWorker, IxiasList, NightshadeRoot, 10, 30, 1},
			{6, 0, MarshStakato, IxiasList, NightshadeRoot, 10, 40, 1},
			{6, 0, MarshStakatoSoldier, IxiasList, NightshadeRoot, 10, 50, 1},
			{6, 0, MarshStakatoDrone, IxiasList, NightshadeRoot, 10, 60, 1},
			{17, 0, Grandis, PixyGarnet, GrandissSkull, 10, 100, 1},
			{17, 0, KarulBugbear, PixyGarnet, KarulBugbearSkull, 10, 100, 1},
			{17, 0, BrekaOrcOverlord, PixyGarnet, BrekaOverlordSkull, 10, 100, 1},
			{17, 0, LetoLizardmanOverlord, PixyGarnet, LetoOverlordSkull, 10, 100, 1},
			{17, 0, BlackWillowLurker, BlightTreantSeed, BlackWillowLeaf, 10, 100, 1}};

	private static boolean QuestProf = true;

	public _219_TestimonyOfFate()
	{
		super(219, "_219_TestimonyOfFate", "Testimony Of Fate");

		addStartNpc(Kaira);

		addTalkId(Metheus);
		addTalkId(Ixia);
		addTalkId(AldersSpirit);
		addTalkId(Roa);
		addTalkId(Norman);
		addTalkId(Thifiell);
		addTalkId(Arkenia);
		addTalkId(BloodyPixy);
		addTalkId(BlightTreant);

		for(int[] cond : DROPLIST_COND)
			addKillId(cond[2]);

		addKillId(HangmanTree);

		addQuestItem(KairasLetter,
				MetheussFuneralJar,
				KasandrasRemains,
				IxiasList,
				Belladonna,
				AldersSkull1,
				AldersSkull2,
				AldersReceipt,
				RevelationsManuscript,
				KairasRecommendation,
				KairasInstructions,
				ThifiellsLetter,
				PalusCharm,
				ArkeniasNote,
				PixyGarnet,
				BlightTreantSeed,
				RedFairyDust,
				BlightTreantSap,
				ArkeniasLetter,
				MedusasIchor,
				MarshSpiderFluids,
				DeadSeekerDung,
				TyrantsBlood,
				NightshadeRoot,
				GrandissSkull,
				KarulBugbearSkull,
				BrekaOverlordSkull,
				LetoOverlordSkull,
				BlackWillowLeaf);
	}

	@Override
	public String onEvent(String event, QuestState st)
	{
		String htmltext = event;
		if(event.equalsIgnoreCase("30476-05.htm"))
		{
			st.set("cond", "1");
			st.setState(STARTED);
			st.playSound(SOUND_ACCEPT);
			st.giveItems(KairasLetter, 1);
			if(!st.getPlayer().getVarB("dd2"))
			{
				st.giveItems(7562, 64);
				st.getPlayer().setVar("dd2", "1");
			}
		}
		else if(event.equalsIgnoreCase("30114-04.htm"))
		{
			st.takeItems(AldersSkull2, 1);
			st.giveItems(AldersReceipt, 1);
			st.set("cond", "12");
			st.setState(STARTED);
		}
		else if(event.equalsIgnoreCase("30476-12.htm"))
		{
			if(st.getPlayer().getLevel() >= 38)
			{
				st.takeItems(RevelationsManuscript, -1);
				st.giveItems(KairasRecommendation, 1);
				st.set("cond", "15");
				st.setState(STARTED);
			}
			else
			{
				htmltext = "30476-13.htm";
				st.takeItems(RevelationsManuscript, -1);
				st.giveItems(KairasInstructions, 1);
				st.set("cond", "14");
				st.setState(STARTED);
			}
		}
		else if(event.equalsIgnoreCase("30419-02.htm"))
		{
			st.takeItems(ThifiellsLetter, -1);
			st.giveItems(ArkeniasNote, 1);
			st.set("cond", "17");
			st.setState(STARTED);
		}
		else if(event.equalsIgnoreCase("31845-02.htm"))
			st.giveItems(PixyGarnet, 1);
		else if(event.equalsIgnoreCase("31850-02.htm"))
			st.giveItems(BlightTreantSeed, 1);
		else if(event.equalsIgnoreCase("30419-05.htm"))
		{
			st.takeItems(ArkeniasNote, -1);
			st.takeItems(RedFairyDust, -1);
			st.takeItems(BlightTreantSap, -1);
			st.giveItems(ArkeniasLetter, 1);
			st.set("cond", "18");
			st.setState(STARTED);
		}
		if(event.equalsIgnoreCase("AldersSpirit_Fail"))
		{
			L2NpcInstance isQuest = L2ObjectsStorage.getByNpcId(AldersSpirit);
			if(isQuest != null)
				isQuest.deleteMe();
			st.set("cond", "9");
		}

		return htmltext;
	}

	@Override
	public String onTalk(L2NpcInstance npc, QuestState st)
	{
		int npcId = npc.getNpcId();
		String htmltext = "noquest";
		int cond = st.getInt("cond");
		if(npcId == Kaira)
		{
			if(st.getQuestItemsCount(MarkofFate) != 0)
			{
				htmltext = "completed";
				st.exitCurrentQuest(true);
			}
			else if(st.isCreated())
			{
				if(st.getPlayer().getRace().ordinal() == 2 && st.getPlayer().getLevel() >= 37)
					htmltext = "30476-03.htm";
				else if(st.getPlayer().getRace().ordinal() == 2)
				{
					htmltext = "30476-02.htm";
					st.exitCurrentQuest(true);
				}
				else
				{
					htmltext = "30476-01.htm";
					st.exitCurrentQuest(true);
				}
			}
			else if(cond == 2)
				htmltext = "30476-06.htm";
			else if(cond == 9 || cond == 10)
			{
				L2NpcInstance AldersSpiritObject = L2ObjectsStorage.getByNpcId(AldersSpirit);
				if(AldersSpiritObject == null)
				{
					st.takeItems(AldersSkull1, -1);
					if(st.getQuestItemsCount(AldersSkull2) == 0)
						st.giveItems(AldersSkull2, 1);
					htmltext = "30476-09.htm";
					st.set("cond", "10");
					st.setState(STARTED);
					st.getPcSpawn().addSpawn(AldersSpirit);
					st.startQuestTimer("AldersSpirit_Fail", 300000);
				}
				else
					htmltext = "<html><head><body>I am borrowed, approach in some minutes</body></html>";
			}
			else if(cond == 13)
				htmltext = "30476-11.htm";
			else if(cond == 14)
			{
				if(st.getQuestItemsCount(KairasInstructions) != 0 && st.getPlayer().getLevel() < 38)
					htmltext = "30476-14.htm";
				else if(st.getQuestItemsCount(KairasInstructions) != 0 && st.getPlayer().getLevel() >= 38)
				{
					st.giveItems(KairasRecommendation, 1);
					st.takeItems(KairasInstructions, 1);
					htmltext = "30476-15.htm";
					st.set("cond", "15");
					st.setState(STARTED);
				}
			}
			else if(cond == 15)
				htmltext = "30476-16.htm";
			else if(cond == 16 || cond == 17)
				htmltext = "30476-17.htm";
			else if(st.getQuestItemsCount(MetheussFuneralJar) > 0 || st.getQuestItemsCount(KasandrasRemains) > 0)
				htmltext = "30476-07.htm";
			else if(st.getQuestItemsCount(HerbalismTextbook) > 0 || st.getQuestItemsCount(IxiasList) > 0)
				htmltext = "30476-08.htm";
			else if(st.getQuestItemsCount(AldersSkull2) > 0 || st.getQuestItemsCount(AldersReceipt) > 0)
				htmltext = "30476-10.htm";
		}
		else if(npcId == Metheus)
		{
			if(cond == 1)
			{
				htmltext = "30614-01.htm";
				st.takeItems(KairasLetter, -1);
				st.giveItems(MetheussFuneralJar, 1);
				st.set("cond", "2");
				st.setState(STARTED);
			}
			else if(cond == 2)
				htmltext = "30614-02.htm";
			else if(cond == 3)
			{
				st.takeItems(KasandrasRemains, -1);
				st.giveItems(HerbalismTextbook, 1);
				htmltext = "30614-03.htm";
				st.set("cond", "5");
				st.setState(STARTED);
			}
			else if(cond == 8)
			{
				st.takeItems(Belladonna, -1);
				st.giveItems(AldersSkull1, 1);
				htmltext = "30614-05.htm";
				st.set("cond", "9");
				st.setState(STARTED);
			}
			else if(st.getQuestItemsCount(HerbalismTextbook) > 0 || st.getQuestItemsCount(IxiasList) > 0)
				htmltext = "30614-04.htm";
			else if(st.getQuestItemsCount(AldersSkull1) > 0 || st.getQuestItemsCount(AldersSkull2) > 0 || st.getQuestItemsCount(AldersReceipt) > 0 || st.getQuestItemsCount(RevelationsManuscript) > 0 || st.getQuestItemsCount(KairasInstructions) > 0 || st.getQuestItemsCount(KairasRecommendation) > 0)
				htmltext = "30614-06.htm";
		}
		else if(npcId == Ixia)
		{
			if(cond == 5)
			{
				st.takeItems(HerbalismTextbook, -1);
				st.giveItems(IxiasList, 1);
				htmltext = "30463-01.htm";
				st.set("cond", "6");
				st.setState(STARTED);
			}
			else if(cond == 6)
				htmltext = "30463-02.htm";
			else if(cond == 7 && st.getQuestItemsCount(MedusasIchor) >= 10 && st.getQuestItemsCount(MarshSpiderFluids) >= 10 && st.getQuestItemsCount(DeadSeekerDung) >= 10 && st.getQuestItemsCount(TyrantsBlood) >= 10 && st.getQuestItemsCount(NightshadeRoot) >= 10)
			{
				st.takeItems(MedusasIchor, -1);
				st.takeItems(MarshSpiderFluids, -1);
				st.takeItems(DeadSeekerDung, -1);
				st.takeItems(TyrantsBlood, -1);
				st.takeItems(NightshadeRoot, -1);
				st.takeItems(IxiasList, -1);
				st.giveItems(Belladonna, 1);
				htmltext = "30463-03.htm";
				st.set("cond", "8");
				st.setState(STARTED);
			}
			else if(cond == 7) //На случай если игрок удалит квест айтемы.
			{
				htmltext = "30463-02.htm";
				st.set("cond", "6");
			}
			else if(cond == 8)
				htmltext = "30463-04.htm";
			else if(st.getQuestItemsCount(AldersSkull1) > 0 || st.getQuestItemsCount(AldersSkull2) > 0 || st.getQuestItemsCount(AldersReceipt) > 0 || st.getQuestItemsCount(RevelationsManuscript) > 0 || st.getQuestItemsCount(KairasInstructions) > 0 || st.getQuestItemsCount(KairasRecommendation) > 0)
				htmltext = "30463-05.htm";
		}
		else if(npcId == AldersSpirit)
		{
			htmltext = "30613-02.htm";
			st.set("cond", "11");
			st.setState(STARTED);
			QuestTimer timer = st.getQuestTimer("AldersSpirit_Fail");
			if(timer != null)
				timer.cancel();
			L2NpcInstance isQuest = L2ObjectsStorage.getByNpcId(AldersSpirit);
			if(isQuest != null)
				isQuest.deleteMe();
		}
		else if(npcId == Roa)
		{
			if(cond == 11)
				htmltext = "30114-01.htm";
			else if(cond == 12)
				htmltext = "30114-05.htm";
			else if(st.getQuestItemsCount(RevelationsManuscript) > 0 || st.getQuestItemsCount(KairasInstructions) > 0 || st.getQuestItemsCount(KairasRecommendation) > 0)
				htmltext = "30114-06.htm";
		}
		else if(npcId == Norman)
		{
			if(cond == 12)
			{
				st.takeItems(AldersReceipt, -1);
				st.giveItems(RevelationsManuscript, 1);
				htmltext = "30210-01.htm";
				st.set("cond", "13");
				st.setState(STARTED);
			}
			else if(cond == 13)
				htmltext = "30210-02.htm";
		}
		else if(npcId == Thifiell)
		{
			if(cond == 15)
			{
				st.takeItems(KairasRecommendation, -1);
				st.giveItems(ThifiellsLetter, 1);
				st.giveItems(PalusCharm, 1);
				htmltext = "30358-01.htm";
				st.set("cond", "16");
				st.setState(STARTED);
			}
			else if(cond == 16)
				htmltext = "30358-02.htm";
			else if(cond == 17)
				htmltext = "30358-03.htm";
			else if(cond == 18)
			{
				if(!st.getPlayer().getVarB("q219"))
				{
					st.addExpAndSp(682735, 45562);
					st.rollAndGive(57, 123854, 100);
					st.getPlayer().setVar("q219", "1");
				}
				st.takeItems(ArkeniasLetter, -1);
				st.takeItems(PalusCharm, -1);
				st.giveItems(MarkofFate, 1);
				htmltext = "30358-04.htm";
				st.playSound(SOUND_FINISH);
				st.exitCurrentQuest(true);
			}
		}
		else if(npcId == Arkenia)
		{
			if(cond == 16)
				htmltext = "30419-01.htm";
			else if(cond == 17)
			{
				if(st.getQuestItemsCount(RedFairyDust) < 1 || st.getQuestItemsCount(BlightTreantSap) < 1)
					htmltext = "30419-03.htm";
				else if(st.getQuestItemsCount(RedFairyDust) >= 1 && st.getQuestItemsCount(BlightTreantSap) >= 1)
					htmltext = "30419-04.htm";
			}
			else if(cond == 18)
				htmltext = "30419-06.htm";
		}
		else if(npcId == BloodyPixy && cond == 17)
		{
			if(st.getQuestItemsCount(RedFairyDust) == 0 && st.getQuestItemsCount(PixyGarnet) == 0)
				htmltext = "31845-01.htm";
			else if(st.getQuestItemsCount(RedFairyDust) == 0 && st.getQuestItemsCount(PixyGarnet) > 0 && (st.getQuestItemsCount(GrandissSkull) < 10 || st.getQuestItemsCount(KarulBugbearSkull) < 10 || st.getQuestItemsCount(BrekaOverlordSkull) < 10 || st.getQuestItemsCount(LetoOverlordSkull) < 10))
				htmltext = "31845-03.htm";
			else if(st.getQuestItemsCount(RedFairyDust) == 0 && st.getQuestItemsCount(PixyGarnet) > 0 && st.getQuestItemsCount(GrandissSkull) >= 10 && st.getQuestItemsCount(KarulBugbearSkull) >= 10 && st.getQuestItemsCount(BrekaOverlordSkull) >= 10 && st.getQuestItemsCount(LetoOverlordSkull) >= 10)
			{
				st.takeItems(GrandissSkull, -1);
				st.takeItems(KarulBugbearSkull, -1);
				st.takeItems(BrekaOverlordSkull, -1);
				st.takeItems(LetoOverlordSkull, -1);
				st.takeItems(PixyGarnet, -1);
				st.giveItems(RedFairyDust, 1);
				htmltext = "31845-04.htm";
			}
			else if(st.getQuestItemsCount(RedFairyDust) != 0)
				htmltext = "31845-05.htm";
		}
		else if(npcId == BlightTreant && cond == 17)
			if(st.getQuestItemsCount(BlightTreantSap) == 0 && st.getQuestItemsCount(BlightTreantSeed) == 0)
				htmltext = "31850-01.htm";
			else if(st.getQuestItemsCount(BlightTreantSap) == 0 && st.getQuestItemsCount(BlightTreantSeed) > 0 && st.getQuestItemsCount(BlackWillowLeaf) == 0)
				htmltext = "31850-03.htm";
			else if(st.getQuestItemsCount(BlightTreantSap) == 0 && st.getQuestItemsCount(BlightTreantSeed) > 0 && st.getQuestItemsCount(BlackWillowLeaf) > 0)
			{
				st.takeItems(BlackWillowLeaf, -1);
				st.takeItems(BlightTreantSeed, -1);
				st.giveItems(BlightTreantSap, 1);
				htmltext = "31850-04.htm";
			}
			else if(st.getQuestItemsCount(BlightTreantSap) > 0)
				htmltext = "31850-05.htm";
		return htmltext;
	}

	@Override
	public void onKill(L2NpcInstance npc, QuestState st)
	{
		int npcId = npc.getNpcId();
		int cond = st.getInt("cond");
		for(int[] aDROPLIST_COND : DROPLIST_COND)
			if(cond == aDROPLIST_COND[0] && npcId == aDROPLIST_COND[2])
				if(aDROPLIST_COND[3] == 0 || st.getQuestItemsCount(aDROPLIST_COND[3]) > 0)
				{
					if(aDROPLIST_COND[5] == 0)
						st.rollAndGive(aDROPLIST_COND[4], aDROPLIST_COND[7], aDROPLIST_COND[6]);
					else if(st.rollAndGiveLimited(aDROPLIST_COND[4], aDROPLIST_COND[7], aDROPLIST_COND[6], aDROPLIST_COND[5]))
					{
						if(st.getQuestItemsCount(aDROPLIST_COND[4]) == aDROPLIST_COND[5] && aDROPLIST_COND[1] != cond && aDROPLIST_COND[1] != 0)
						{
							st.playSound(SOUND_MIDDLE);
							st.setCond(aDROPLIST_COND[1]);
							st.setState(STARTED);
						}
						else
							st.playSound(SOUND_ITEMGET);
					}
				}
		if(cond == 2 && npcId == HangmanTree)
		{
			st.takeItems(MetheussFuneralJar, -1);
			st.giveItems(KasandrasRemains, 1);
			st.playSound(SOUND_MIDDLE);
			st.set("cond", "3");
			st.setState(STARTED);
		}
		else if(cond == 6 && st.getQuestItemsCount(MedusasIchor) >= 10 && st.getQuestItemsCount(MarshSpiderFluids) >= 10 && st.getQuestItemsCount(DeadSeekerDung) >= 10 && st.getQuestItemsCount(TyrantsBlood) >= 10 && st.getQuestItemsCount(NightshadeRoot) >= 10)
		{
			st.playSound(SOUND_MIDDLE);
			st.set("cond", "7");
			st.setState(STARTED);
		}
	}
}