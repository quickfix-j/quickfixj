package quickfix;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.flextrade.jfixture.JFixture;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.reset;

public class DataDictionaryProxyTest {

	@Mock
	private DataDictionary mockDataDictionary;
	private DataDictionaryProxy dataDictionaryProxy;
	private JFixture fixture;
	
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
		fixture = new JFixture();
	}

	@Test
	public void checkAllMethodsAreOverridden() 
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ConfigError {
		dataDictionaryProxy = new DataDictionaryProxy(mockDataDictionary);
		
		for(Method m : DataDictionary.class.getMethods()) {
			if (m.getDeclaringClass().equals(DataDictionary.class)) {
				Object[] args = new Object[m.getParameterCount()];
				for (int i = 0; i < m.getParameterCount(); i++) {
					if (m.getParameters()[i].getType().equals(Message.class)) {
						args[i] = new Message();
					} else if (m.getParameters()[i].getType().equals(FieldMap.class)) {
						args[i] = new Group(37, 11);
					} else if (m.getParameters()[i].getType().equals(Field.class)) {
						args[i] = new StringField(1);
					} else {
						args[i] = fixture.create(m.getParameters()[i].getType());
					}
				}
				m.invoke(dataDictionaryProxy, args);
				assertEquals("Method: "+ m.getName()+" not defined", 1, mockingDetails(mockDataDictionary).getInvocations().size());
				assertEquals("Method: "+ m.getName()+" not invoked", m, mockingDetails(mockDataDictionary).getInvocations().iterator().next().getMethod());
				reset(mockDataDictionary);
			}
		}
	}
	
}
