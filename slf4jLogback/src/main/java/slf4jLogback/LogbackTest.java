package slf4jLogback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    public LogbackTest(){
        super();
        
        while(true){
        	LOGGER.debug("Se ha creadio correctamente el objeto 'LogbackTest'");
            LOGGER.debug("Se ha creado el objeto {}", this.getClass().getName());
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				LOGGER.error(e.getLocalizedMessage());
			}
        }
        
        
    }


    public static void main(final String args[]){
    	new LogbackTest();
    }

}
