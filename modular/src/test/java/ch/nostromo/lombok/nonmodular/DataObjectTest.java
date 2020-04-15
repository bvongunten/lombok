package ch.nostromo.lombok.nonmodular;

import junit.framework.TestCase;

public class DataObjectTest extends TestCase {

    public void testGetMessage() {
        assertEquals("Hello World", new DataObject().getMessage());

    }
}