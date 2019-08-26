package ru.l2gw.gameserver.serverpackets;

import ru.l2gw.gameserver.model.L2Player;

/**
 * Format: (ch) dc
 * d: character object id
 * c: 1 if won 0 if failed
 */
public class ExFishingEnd extends L2GameServerPacket
{
	private int char_obj_id;
	private boolean _win;

	public ExFishingEnd(boolean win, L2Player player)
	{
		_win = win;
		char_obj_id = player.getObjectId();
	}

	@Override
	protected final void writeImpl()
	{
		writeC(EXTENDED_PACKET);
		writeH(0x1f);
		writeD(char_obj_id);
		writeC(_win ? 1 : 0);
	}
}