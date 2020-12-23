package alpha;

import org.apache.logging.log4j.*;


public class First {
	private static Logger Log =  LogManager.getLogger(First.class.getName());
	
	public static void main(String[] args) {
		
Log.debug("Debug Logs printing");

Log.error("Error message now printing");

Log.info("Information message now printing");

Log.fatal("Fatal error");

	}

}
