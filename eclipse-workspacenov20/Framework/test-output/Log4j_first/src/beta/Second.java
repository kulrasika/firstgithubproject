package beta;

import org.apache.logging.log4j.*;


public class Second {
	private static Logger Log =  LogManager.getLogger(Second.class.getName());
	
	public static void main(String[] args) {
		
Log.debug("Debug LOgs printing");

Log.error("Error message now printing");

Log.info("Information message now printing");

Log.fatal("Fatal error");

	}

}
