package ai.gk;

import ai.base.Teleporter;
import ru.l2gw.gameserver.model.L2Character;

/**
 * @author: rage
 * @date: 07.11.11 23:22
 */
public class Tamil extends Teleporter
{
	public Tamil(L2Character actor)
	{
		super(actor);
		Position = new int[][]{{1010005, -12787, 122779, -3114, 23000, 1}, {1010004, -80684, 149770, -3043, 18000, 0}, {1010574, 87126, -143520, -1288, 13000, 9}, {1010156, 9709, 15566, -4500, 13000, 0}, {1010158, 115120, -178224, -917, 17000, 0}, {1010001, -84141, 244623, -3729, 35000, 0}, {1010155, 46951, 51550, -2976, 18000, 0}, {1010648, -117251, 46771, 380, 17000, 0}, {1010046, -4190, -80040, -2696, 2000, 0}, {1010647, -10983, -117484, -2464, 960, 0}, {1010603, 9340, -112509, -2536, 1500, 0}, {1010048, 8652, -139941, -1144, 1600, 0}};
		PositionNoblessNeedItemField = new int[][]{{1010506, -87328, 142266, -3640, 1, 0}, {1010007, 83396, 147904, -3404, 1, 0}, {1010556, -25309, -131569, -680, 1, 0}, {1010053, 146440, 46723, -3400, 1, 0}};
		PositionNoblessNoItemField = new int[][]{{1010506, -87328, 142266, -3640, 1000, 0}, {1010007, 83396, 147904, -3404, 1000, 0}, {1010556, -25309, -131569, -680, 1000, 0}, {1010053, 146440, 46723, -3400, 1000, 0}};
		PositionNewbie = new int[][]{{1010156, 9709, 15566, -4500, 1, 0}, {1010158, 115120, -178224, -917, 1, 0}, {1010001, -84141, 244623, -3729, 1, 0}, {1010155, 46951, 51550, -2976, 1, 0}};
	}
}