package cachingInSpring;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class BookDAO implements IBookDAO {

	@Override
	@Cacheable("books")
	public Book getByIsbn(String isbn) {
		simulateSlowService();
		return new Book(isbn, "new Book");
		
	}
	private  void simulateSlowService() {
		try {
			long time = 3000L;
			//System.out.println("mona");
			Thread.sleep(time);
			//System.out.println("kumari");
		}
		catch (InterruptedException e) {
			throw new IllegalStateException(e);
			// TODO: handle exception
		}
	}

}
