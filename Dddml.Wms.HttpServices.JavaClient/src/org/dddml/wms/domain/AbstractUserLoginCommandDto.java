package org.dddml.wms.domain;

import org.dddml.wms.domain.LoginKeyDto;
import java.util.Date;
import org.dddml.wms.domain.AbstractCommandDto;

public abstract class AbstractUserLoginCommandDto extends AbstractCommandDto
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

