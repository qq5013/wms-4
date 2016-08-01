import org.dddml.wms.domain.*;
import org.dddml.wms.specialization.ApplicationContext;
import org.dddml.wms.specialization.spring.SpringApplicationContext;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.UUID;

/**
 * Created by Yang on 2016/7/21.
 */
public class Main {

    static org.springframework.context.ApplicationContext springFrameworkApplicationContext;

    static { springFrameworkApplicationContext = new ClassPathXmlApplicationContext(
            "config/DatabaseConfig.xml",
            "config/AggregatesHibernateConfig.xml",
            "config/DomainConfig.xml"
            );
    }

    public static void main(final String[] args) throws Exception {

        ApplicationContext.current = new SpringApplicationContext(springFrameworkApplicationContext);

        testCreateUpdateOrganization();

        testCreateUpdateAttribute();

        testCreateAndVoidInout_0();
    }

    private static void testCreateAndVoidInout_0()
    {
        InOutApplicationService inOutApplicationService = (InOutApplicationService) springFrameworkApplicationContext.getBean("inOutApplicationService");
        String documentNumber = UUID.randomUUID().toString();

        InOutCommand.CreateInOut inOut = new AbstractInOutCommand.SimpleCreateInOut();
        inOut.setDocumentNumber(documentNumber);
        inOut.setCommandId(UUID.randomUUID().toString());
        inOut.setDocumentAction(new DocumentAction(DocumentActionName.DRAFT));// 不能这样写：inOut.DocumentStatus = DocumentStatus.DRAFTED
        inOut.setChargeAmount(Money.of(CurrencyUnit.getInstance("CNY"), 10000));
        inOut.setFreightAmount(Money.of(CurrencyUnit.getInstance("CNY"), 400));
        inOutApplicationService.when(inOut);

        InOutState inOutState1 = inOutApplicationService.get(documentNumber);

        InOutCommand.MergePatchInOut patchInOut = new AbstractInOutCommand.SimpleMergePatchInOut();
        patchInOut.setDocumentNumber(documentNumber);
        patchInOut.setDocumentAction(new DocumentAction(DocumentActionName.VOID));//不能这样写：patchInOut.DocumentStatus = DocumentStatus.VOIDED
        patchInOut.setVersion(inOutState1.getVersion());
        patchInOut.setCommandId(UUID.randomUUID().toString());

        inOutApplicationService.when(patchInOut);

        InOutState inOutResult = inOutApplicationService.get(documentNumber);
        System.out.println(inOutResult.getDocumentStatus());
        //Assert.AreEqual(DocumentStatus.VOIDED, inOutResult.getDocumentStatus());
        System.out.println(inOutResult.getFreightAmount());
        //Assert.AreEqual(inOut.getFreightAmount(), inOutResult.getFreightAmount());
        System.out.println(inOutResult.getChargeAmount());
        //Assert.AreEqual(inOut.getChargeAmount(), inOutResult.getChargeAmount());
    }

    private static void testCreateUpdateAttribute() {
        AttributeApplicationService attributeApplicationService = (AttributeApplicationService) springFrameworkApplicationContext.getBean("attributeApplicationService");
        AttributeCommand.CreateAttribute createAttr = new AbstractAttributeCommand.SimpleCreateAttribute();
        String attrId = UUID.randomUUID().toString();
        createAttr.setAttributeId(attrId);
        createAttr.setName("Color");
        AttributeValueCommand.CreateAttributeValue createAttrVal_r = createAttr.newCreateAttributeValue();
        createAttrVal_r.setValue("R");
        createAttrVal_r.setName("Red");
        createAttr.getAttributeValues().add(createAttrVal_r);
        // -----
        AttributeValueCommand.CreateAttributeValue createAttrVal_g = createAttr.newCreateAttributeValue();
        createAttrVal_g.setValue("G");
        createAttrVal_g.setName("Green");
        createAttr.getAttributeValues().add(createAttrVal_g);
        // -----
        AttributeValueCommand.CreateAttributeValue createAttrVal_b = createAttr.newCreateAttributeValue();
        createAttrVal_b.setValue("B");
        createAttrVal_b.setName("Blue");
        createAttr.getAttributeValues().add(createAttrVal_b);
        attributeApplicationService.when(createAttr);
        // //////////////////////////////////
        AttributeState attrState = attributeApplicationService.get(attrId);
        System.out.println(attrState);
        System.out.println(attrState.getName());
        for (AttributeValueState v : attrState.getAttributeValues()) {
            System.out.println(v.getName() + "~~~ " + v.getDescription());
        }
        ////////////////////////////////////
        System.out.println("////////////////////////////////////");
        AttributeCommand.MergePatchAttribute patchAttr = new AbstractAttributeCommand.SimpleMergePatchAttribute();
        patchAttr.setAttributeId(attrId);
        patchAttr.setVersion(attrState.getVersion());
        AttributeValueCommand.MergePatchAttributeValue patchAttrVal = patchAttr.newMergePatchAttributeValue();
        patchAttrVal.setValue("B");
        patchAttrVal.setDescription("This is colorful day!");
        patchAttr.getAttributeValueCommands().add(patchAttrVal);
        attributeApplicationService.when(patchAttr);
        AttributeState attrState2 = attributeApplicationService.get(attrId);
        System.out.println(attrState2);
        System.out.println(attrState2.getName());
        for (AttributeValueState v : attrState2.getAttributeValues()) {
            System.out.println(v.getName() + "~~~ " + v.getDescription());
        }
        Iterable<AttributeState> attrs = attributeApplicationService.getByProperty("name", "Color", null, null, null);
        for (AttributeState a : attrs) {
            System.out.println(a.getName() + " " + a.getAttributeId());
        }
        long count = attributeApplicationService.getCount((Iterable) null);
        System.out.println(count);

        AbstractAttributeStateCommandConverter.SimpleAttributeStateCommandConverter cmdConverter = new AbstractAttributeStateCommandConverter.SimpleAttributeStateCommandConverter();
        AttributeCommand.MergePatchAttribute patchAttr5 = (AttributeCommand.MergePatchAttribute) cmdConverter.toCreateOrMergePatchAttribute(attrState2);
        patchAttr5.setDescription("RGB RGB RGB");
        attributeApplicationService.when(patchAttr5);
        AttributeState attrState5 = attributeApplicationService.get(attrId);
        System.out.println(attrState5);
        System.out.println(attrState5.getDescription());
    }


    private static void testCreateUpdateOrganization() {
        OrganizationApplicationService organizationApplicationService = (OrganizationApplicationService) springFrameworkApplicationContext.getBean("organizationApplicationService");

        // ////////////////////////
        System.out.println("// //////////// Create a organization  /////////////");
        OrganizationCommand.CreateOrganization createOrg = new AbstractOrganizationCommand.SimpleCreateOrganization();
        String orgId = UUID.randomUUID().toString();
        System.out.println(orgId);
        createOrg.setOrganizationId(orgId);
        createOrg.setCommandId(UUID.randomUUID().toString());
        ///////////createOrg.setVersion(-1L);/////////
        organizationApplicationService.when(createOrg);
        OrganizationState orgState0 = organizationApplicationService.get(orgId);
        System.out.println(orgState0);
        //if(true){return;}
        // ////////////////////////
        System.out.println("// ////////////// Update the organization info ////////////");
        OrganizationCommand.MergePatchOrganization patchOrg = new AbstractOrganizationCommand.SimpleMergePatchOrganization();
        patchOrg.setOrganizationId(orgId);
        patchOrg.setCommandId(UUID.randomUUID().toString());
        patchOrg.setDescription("Pujiangzhigu 9 hao lou, Lianhanglu");
        patchOrg.setVersion(orgState0.getVersion());//!!!
        organizationApplicationService.when(patchOrg);
        OrganizationState orgState1 = organizationApplicationService.get(orgId);
        System.out.println(orgState1);
        System.out.println(orgState1.getDescription());

        // /////////////////////////////////////////////////////////
        System.out.println("/ /////////////////////////////////////////////////////////");
        OrganizationCommand.MergePatchOrganization patchOrg2 = new AbstractOrganizationCommand.SimpleMergePatchOrganization();
        patchOrg2.setOrganizationId(orgId);
        patchOrg2.setCommandId(UUID.randomUUID().toString());
        patchOrg2.setDescription("Pujiangzhigu 9 hao lou, Lianhanglu, Shanghai");
        patchOrg2.setVersion(orgState1.getVersion());//!!!
        organizationApplicationService.when(patchOrg2);
        OrganizationState orgState2 = organizationApplicationService.get(orgId);
        System.out.println(orgState2);
        System.out.println(orgState2.getDescription());
    }

    static class HibernateTest {
        private static final SessionFactory ourSessionFactory;
        private static final ServiceRegistry serviceRegistry;

        static {
            try {
                Configuration configuration = new Configuration();
                configuration.configure();

                serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
                ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Throwable ex) {
                throw new ExceptionInInitializerError(ex);
            }
        }

        public static Session getSession() throws HibernateException {
            return ourSessionFactory.openSession();
        }

        private static void testHibernateQueryAllEntities() {
            //System.out.println(new Date());if(true)return;
            final Session session = getSession();
            try {
                System.out.println("querying all the managed entities...");
                final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
                for (Object key : metadataMap.keySet()) {
                    final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
                    final String entityName = classMetadata.getEntityName();
                    final Query query = session.createQuery("from " + entityName);
                    System.out.println("executing: " + query.getQueryString());
                    for (Object o : query.list()) {
                        System.out.println("  " + o);
                    }
                }
            } finally {
                session.close();
            }
        }
    }

}
