package demo.dependencyInjection;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import demo.dependencyInjection.model.CustomModel;

/**
 * Unit test for ObjectFactory.
 */
public class ObjectFactoryTest 
{
    public static final String CLASS_NAME = "demo.dependencyInjection.model.CustomModel";
	
    /**
     * Test Singleton scope, assert same instance is returned always
     */
    @Test
    public void testSingleton()
    {
    	//assert null for invalid input
    	assertNull(ObjectFactory.getInstance(null, ObjectFactory.SINGLETON));
    	
    	//assert null for invalid class name
    	assertNull(ObjectFactory.getInstance("com.abc", ObjectFactory.SINGLETON));
    	
    	//ensure multiple calls to getInstance returns same object
    	CustomModel custObj1 =  (CustomModel) ObjectFactory.getInstance(CLASS_NAME, ObjectFactory.SINGLETON);
    	CustomModel custObj2 =  (CustomModel) ObjectFactory.getInstance(CLASS_NAME, ObjectFactory.SINGLETON);
    	assertSame(custObj1, custObj2);
    }
    
    /**
     * Test Prototype scope, assert new instance is returned every time
     */
    @Test
    public void testPrototype()
    {
    	//assert null for invalid input
    	assertNull(ObjectFactory.getInstance(CLASS_NAME, null));
    	
    	//ensure multiple calls to getInstance returns different object
    	CustomModel custObj1 =  (CustomModel) ObjectFactory.getInstance(CLASS_NAME, ObjectFactory.PROTOTYPE);
    	CustomModel custObj2 =  (CustomModel) ObjectFactory.getInstance(CLASS_NAME, ObjectFactory.PROTOTYPE);
    	assertNotSame(custObj1, custObj2);
    }
}
