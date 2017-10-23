import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Principal {

	private static final Logger logger = (Logger) LogManager.getLogger();
	public static void main(String[] args) {
		logger.error("Hola");
	}

}
