package quickfixj;

import junit.framework.TestCase;

/**
 * Create this class after QFJ-832 where instanciation of messages raise java.lang.VerifyError
 * 
 * @author Manu
 *
 */
public class SupportForMultipleFixVersionsTest extends TestCase {
	
	public void testFIX40() {
		quickfix.fixt40.MessageFactory fact = new quickfix.fixt40.MessageFactory();
		Object newMessage = fact.create("FIX.4.0", "D");
		assertNotNull(newMessage);
	}
	
	public void testFIX41() {
		quickfix.fix41.MessageFactory fact = new quickfix.fix41.MessageFactory();
		Object newMessage = fact.create("FIX.4.1", "D");
		assertNotNull(newMessage);
	}
	
	public void testFIX42() {
		quickfix.fix42.MessageFactory fact = new quickfix.fix42.MessageFactory();
		Object newMessage = fact.create("FIX.4.2", "D");
		assertNotNull(newMessage);
	}
	
	public void testFIX43() {
		quickfix.fix43.MessageFactory fact = new quickfix.fix43.MessageFactory();
		Object newMessage = fact.create("FIX.4.3", "D");
		assertNotNull(newMessage);
	}
	
	public void testFIX44() {
		quickfix.fix44.MessageFactory fact = new quickfix.fix44.MessageFactory();
		Object newMessage = fact.create("FIX.4.4", "D");
		assertNotNull(newMessage);
	}
	
	public void testFIX50() {
		quickfix.fix50.MessageFactory fact = new quickfix.fix50.MessageFactory();
		Object newMessage = fact.create("FIX.5.0", "D");
		assertNotNull(newMessage);
	}
	
	public void testFIX50SP1() {
		quickfix.fix50sp1.MessageFactory fact = new quickfix.fix50sp1.MessageFactory();
		Object newMessage = fact.create("FIX.5.0.SP1", "D");
		assertNotNull(newMessage);
	}
	
	public void testFIX50SP2() {
		quickfix.fix50sp2.MessageFactory fact = new quickfix.fix50sp2.MessageFactory();
		Object newMessage = fact.create("FIX.5.0.SP2", "D");
		assertNotNull(newMessage);
	}

}
