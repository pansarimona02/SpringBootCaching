package cachingInSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
	private final IBookDAO bookDAO;
	public AppRunner(IBookDAO bookDAO) {
		this.bookDAO = bookDAO;
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(".... Fetching books");
        logger.info("isbn-1234 -->" + bookDAO.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookDAO.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookDAO.getByIsbn("isbn-1234"));
        logger.info("isbn-4567 -->" + bookDAO.getByIsbn("isbn-4567"));
        logger.info("isbn-1234 -->" + bookDAO.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + bookDAO.getByIsbn("isbn-1234"));
	}

}
