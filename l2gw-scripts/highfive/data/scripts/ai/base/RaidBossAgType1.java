package ai.base;

import ru.l2gw.gameserver.model.L2Character;
import ru.l2gw.gameserver.model.entity.category.CategoryManager;

/**
 * @author: rage
 * @date: 23.09.11 16:20
 */
public class RaidBossAgType1 extends RaidBossType1
{
	public RaidBossAgType1(L2Character actor)
	{
		super(actor);
	}

	@Override
	protected void onEvtSeeCreature(L2Character creature)
	{
		if(!creature.isPlayer() && !CategoryManager.isInCategory(12, creature.getNpcId()))
		{
			return;
		}
		if(_thisActor.getLifeTime() > SeeCreatureAttackerTime && _thisActor.inMyTerritory(_thisActor))
		{
			addAttackDesire(creature, 1, 200);
		}
	}
}
