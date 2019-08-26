package services.petevolve;

import ru.l2gw.extensions.scripts.Functions;
import ru.l2gw.extensions.scripts.ScriptFile;
import ru.l2gw.gameserver.cache.Msg;
import ru.l2gw.gameserver.model.L2Player;
import ru.l2gw.gameserver.model.L2Summon;
import ru.l2gw.util.Files;

/**
 * User: viRUS
 * Date: 20.08.2008
 * Time: 13:19:36
 */
public class wStrider extends Functions implements ScriptFile
{
	private static final int WIND = 12526;
	private static final int count = 1;
	private static final int WIND_BUGLE = 4422;
	private static final int RED_WIND_BUGLE = 10308;

	//private int dist = 50;

	public void evolve()
	{
		L2Player player = (L2Player) self;
		L2Summon pl_pet = player.getPet();

		if(player.getInventory().getItemByItemId(WIND_BUGLE) == null)
			show(Files.read("data/scripts/services/petevolve/no_item.htm", player), player);
		else if(!player.isPetSummoned())
			show(Files.read("data/scripts/services/petevolve/evolve_no.htm", player), player);
		else if(pl_pet.getNpcId() != WIND)
			show(Files.read("data/scripts/services/petevolve/no_wStrider.htm", player), player);
		else if(pl_pet.getLevel() < 70)
			show(Files.read("data/scripts/services/petevolve/no_level_strider.htm", player), player);
		else if(pl_pet.getInventory().getItems().length != 0)
			player.sendPacket(Msg.THERE_ARE_ITEMS_IN_YOUR_PET_INVENTORY_RENDERING_YOU_UNABLE_TO_SELL_TRADE_DROP_PET_SUMMONING_ITEM_PLEASE_EMPTY_YOUR_PET_INVENTORY);
		else
		{
			player.getPet().unSummon();
			removeItem(player, WIND_BUGLE, count);
			addItem(player, RED_WIND_BUGLE, count);
			show(Files.read("data/scripts/services/petevolve/yes_Strider.htm", player), player);
		}
	}

	public void onLoad()
	{
		_log.info("Loaded Service: Evolve Wind Strider");
	}

	public void onReload()
	{}

	public void onShutdown()
	{}
}