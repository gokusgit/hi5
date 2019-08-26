package ru.l2gw.gameserver.skills.conditions;

import ru.l2gw.gameserver.skills.Env;

public class ConditionPlayerRiding extends Condition
{
	public enum CheckPlayerRiding
	{
		NONE,
		STRIDER,
		WYVERN
	}

	private final CheckPlayerRiding _riding;

	public ConditionPlayerRiding(CheckPlayerRiding riding)
	{
		_riding = riding;
	}

	@Override
	public boolean testImpl(Env env)
	{
		if(_riding == CheckPlayerRiding.STRIDER && env.character.isRiding())
			return true;
		if(_riding == CheckPlayerRiding.WYVERN && env.character.isFlying())
			return true;
		if(_riding == CheckPlayerRiding.NONE && !env.character.isRiding() && !env.character.isFlying())
			return true;
		return false;
	}
}
