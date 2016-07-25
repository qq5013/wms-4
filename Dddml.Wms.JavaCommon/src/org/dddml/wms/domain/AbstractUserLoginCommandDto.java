package org.dddml.wms.domain;

import java.util.Date;
import org.dddml.wms.domain.AbstractCommand;

public abstract class AbstractUserLoginCommandDto extends AbstractCommand
{
    private LoginKeyDto loginKey;

    public LoginKeyDto getLoginKey()
    {
        return this.loginKey;
    }

    public void setLoginKey(LoginKeyDto loginKey)
    {
        this.loginKey = loginKey;
    }


}

