package org.dddml.wms;

import org.dddml.wms.domain.UserLoginIdFlattenedDto;
import org.dddml.wms.domain.meta.AttributeMetadata;
import org.dddml.wms.domain.meta.AttributeUseFilteringProperties;
import org.dddml.wms.specialization.DomainError;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
import java.util.function.Consumer;
/**
 * Created by Yang on 2016/7/16.
 */
public class TestMain {
    public static void main(String[] args)
    {
        System.out.println(AttributeMetadata.PROPERTY_NAME_ACTIVE);
        System.out.println(UserLoginIdFlattenedDto.propertyNames.length);
        System.out.println(AttributeUseFilteringProperties.propertyNames.length);

        for (String s : new TestE()) {
            System.out.println(s);
        }
        String.class.toString();
        //throw DomainError.named("test", "", null, null, null, null);

        (new TestE()).foo(f -> {
            System.out.println(f);
        });
        System.out.printf(String.format("Unable to open file '%1$s': %2$s",
                "fileName", "exception.getMessage()"));
        Map<String, String> map = new HashMap<>();
        map.put("", "");
        map.put("a", "a");
        for (Map.Entry<String, String> kv : map.entrySet()
             ) {

        }
    }

    public interface TestI
    {
        void foo(Consumer bar);

        interface TestII
        {
            void bar();
        }
    }

    public static class TestE implements Iterable<String>, TestI
    {
        ArrayList<String> innerList = new ArrayList<>();
        public  TestE()
        {
            innerList.add("a");
            innerList.add("b");
            innerList.add("c");
        }

        @Override
        public Iterator<String> iterator() {
            return innerList.iterator();
        }

        @Override
        public void foo(Consumer bar) {
            bar.accept("hello");
        }
    }

}
