package org.dddml.wms;

import org.dddml.wms.domain.UserLoginIdFlattenedDto;
import org.dddml.wms.domain.meta.AttributeMetadata;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Yang on 2016/7/16.
 */
public class TestMain {
    public static void main(String[] args)
    {
        System.out.println(AttributeMetadata.ACTIVE);
        System.out.println(UserLoginIdFlattenedDto.getPropertyNames());
    }
}
