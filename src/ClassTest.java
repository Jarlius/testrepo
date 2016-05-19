import java.lang.reflect.InvocationTargetException;


public class ClassTest {
	
	public ClassTest getCopy() {
		
		ClassTest bagool;
		try {
			bagool = getClass().getConstructor(getClass()).newInstance();
		} catch (Exception e) {
			return null;
		}
		
		return bagool;
	}

}
