import wsclient.RandomNumbersImpl;
import wsclient.RandomNumbersImplService;

public class Main {

	public static void main(String[] args) {

		RandomNumbersImplService service = new RandomNumbersImplService();

		RandomNumbersImpl server = service.getRandomNumbersImplPort();

		System.out.println(server.getRandomRange(5)); 
		System.out.println(server.getRandomRange(5)); 
		System.out.println(server.getRandomRange(5)); 
		System.out.println(server.getRandomRange(5)); 
		System.out.println(server.getRandomRange(5));
	}

}
