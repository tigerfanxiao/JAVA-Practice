package practice.basic.sysntax;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogger {

	private static Logger logger = Logger.getLogger(TestLogger.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is debug");
		logger.info("This is info");
		logger.warn("This is warn");
		logger.error("This is error");
		logger.fatal("This is fatal");

	}
}
