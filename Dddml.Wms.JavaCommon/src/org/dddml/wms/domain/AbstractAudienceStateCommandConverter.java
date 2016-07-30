package org.dddml.wms.domain;

import java.util.*;
import java.util.Date;

public abstract class AbstractAudienceStateCommandConverter<TCreateAudience extends AudienceCommand.CreateAudience, TMergePatchAudience extends AudienceCommand.MergePatchAudience, TDeleteAudience extends AudienceCommand.DeleteAudience>
{
	public AudienceCommand toCreateOrMergePatchAudience(AudienceState state)
	{
		//where TCreateAudience : ICreateAudience, new()
		//where TMergePatchAudience : IMergePatchAudience, new()
		boolean bUnsaved = state.isStateUnsaved();
		if (bUnsaved)
		{
			return toCreateAudience(state);
		}
		else 
		{
			return toMergePatchAudience(state);
		}
	}

	public TDeleteAudience toDeleteAudience(AudienceState state) //where TDeleteAudience : IDeleteAudience, new()
	{
		TDeleteAudience cmd = newDeleteAudience();
		cmd.setClientId(state.getClientId());
		cmd.setVersion(state.getVersion());

		return cmd;
	}

	public TMergePatchAudience toMergePatchAudience(AudienceState state) //where TMergePatchAudience : IMergePatchAudience, new()
	{
		TMergePatchAudience cmd = newMergePatchAudience();

		cmd.setVersion(state.getVersion());

		cmd.setClientId(state.getClientId());
		cmd.setName(state.getName());
		cmd.setBase64Secret(state.getBase64Secret());
		cmd.setActive(state.getActive());
			
		if (state.getName() == null) { cmd.setIsPropertyNameRemoved(true); }
		if (state.getBase64Secret() == null) { cmd.setIsPropertyBase64SecretRemoved(true); }
		if (state.getActive() == null) { cmd.setIsPropertyActiveRemoved(true); }
		return cmd;
	}

	public TCreateAudience toCreateAudience(AudienceState state) //where TCreateAudience : ICreateAudience, new()
	{
		TCreateAudience cmd = newCreateAudience();

		cmd.setVersion(state.getVersion());
		cmd.setClientId(state.getClientId());
		cmd.setName(state.getName());
		cmd.setBase64Secret(state.getBase64Secret());
		cmd.setActive(state.getActive());
		return cmd;
	}

	protected abstract TCreateAudience newCreateAudience();

	protected abstract TMergePatchAudience newMergePatchAudience(); 

	protected abstract TDeleteAudience newDeleteAudience();

		
}

