import org.apache.log4j.Logger;
import org.junit.Test;

public class TestBambooTest {

	private final static Logger logger = Logger.getLogger(TestBambooTest.class);
	
	@Test
	public void test1() {
		if(logger.isDebugEnabled()){
			System.out.println("sdsad");
		}
		for(int i=0; i< 100000; i++){
			logger.debug("i:" + i);
		}
	}
	
	@Test
	public void test2() {
		if(logger.isDebugEnabled()){
			System.out.println("sdsad");
		}
		for(int i=0; i< 100000; i++){
			logger.debug("i:" + i);
		}
	}
	
	@Test
	public void test3() {
		if(logger.isDebugEnabled()){
			System.out.println("sdsad");
		}
		for(int i=0; i< 100000; i++){
			logger.debug("i:" + i);
		}
	}
}
