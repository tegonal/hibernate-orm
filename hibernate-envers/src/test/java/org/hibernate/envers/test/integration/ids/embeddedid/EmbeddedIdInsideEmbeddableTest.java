package org.hibernate.envers.test.integration.ids.embeddedid;

import org.hibernate.envers.test.BaseEnversJPAFunctionalTestCase;
import org.hibernate.testing.TestForIssue;
import org.junit.Test;

/**
 * @author Thomas Rawyler
 */
@TestForIssue(jiraKey = "HHH-")
public class EmbeddedIdInsideEmbeddableTest extends BaseEnversJPAFunctionalTestCase {

    @Override
    protected Class<?>[] getAnnotatedClasses() {
        return new Class<?>[]{PurchaseOrder.class, Item.class, ItemId.class, Producer.class, NestedEmbeddedItem.class};
    }

    @Test
    public void testRevisionsCounts() throws Exception {
        // try to initialize
    }

}
