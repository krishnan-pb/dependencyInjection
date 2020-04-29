package demo.dependencyInjection;

import java.util.HashMap;
import java.util.Map;

/**
 * ObjectFactory (As name suggests it a Factory which is used for creating objects)
 * This factory provides the baseline for DI for our objects which uses reflection.
 * 
 */

public class ObjectFactory 
{
	public static final String SINGLETON = "Singleton";
	public static final String PROTOTYPE = "Prototype";
	private static Map<String, Object> instanceMap = new HashMap<String, Object>();
	
	/**
	 * Returns an instance of className for a given scope
	 * If scope is Singleton - Returns cached object else a new instance every time
	 *
	 * @param  className name class for which instance need to be returned
	 * @param  scope the scope of the object
	 * @return instance of className for a given scope
	 */
	
    public static Object getInstance(String className, String scope) {
    	Object instance = null;
    	if (className == null || scope == null)
    		return instance;
    	try {
    		switch (scope) {
    		case PROTOTYPE:
    			instance = createObject(className);
    			break;

    		default:
    			instance = instanceMap.get(className);
    			if(instance == null) {
    				instance = createObject(className);
    				instanceMap.put(className, instance);
    			}
    			break;
    		}
    	}catch (Exception e) {
			// TODO: handle exception
		}
    	
    	return instance;
    	
    }
    
    private static Object createObject(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    	return Class.forName(className).newInstance();
    }
}
