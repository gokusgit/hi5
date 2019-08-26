package ai;

import ai.base.WarriorAgCorpseZombiePhysicalspecial;
import ru.l2gw.gameserver.ai.CtrlEvent;
import ru.l2gw.gameserver.model.L2Character;

/**
 * @author: rage
 * @date: 29.09.11 20:16
 */
public class Ssq2TestMonster4 extends WarriorAgCorpseZombiePhysicalspecial
{
	public Ssq2TestMonster4(L2Character actor)
	{
		super(actor);
	}

	@Override
	protected void onEvtDead(L2Character killer)
	{
		if( _thisActor.getInstanceZoneId() == 158 )
		{
			L2Character c0 = _thisActor.getLeader();
			if( c0 != null )
			{
				_thisActor.notifyAiEvent(c0, CtrlEvent.EVT_SCRIPT_EVENT, 90000, 0, null);
			}
		}
		super.onEvtDead(killer);
	}
}