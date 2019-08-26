package ru.l2gw.gameserver.serverpackets;

import java.util.List;

public class ExCursedWeaponList extends L2GameServerPacket
{
	private int[] cursedWeapon_ids;

	public ExCursedWeaponList(List<Integer> cursedWeaponIds)
	{
		cursedWeapon_ids = new int[cursedWeaponIds.size()];
		for(int i = 0; i < cursedWeaponIds.size(); i++)
			cursedWeapon_ids[i] = cursedWeaponIds.get(i);
	}

	@Override
	protected final void writeImpl()
	{
		writeC(EXTENDED_PACKET);
		writeH(0x46);

		writeD(cursedWeapon_ids.length);
		for(int element : cursedWeapon_ids)
			writeD(element);
		cursedWeapon_ids = null;
	}
}