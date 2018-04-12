package training.ws;

import javax.xml.ws.Endpoint;

public class StartServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endpoint endpoint = Endpoint.publish("http://localhost:8081/soap/random", new RandomNumbersImpl());
		
//		try {
//			Thread.currentThread().wait(30);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		endpoint.stop();
	}

}
