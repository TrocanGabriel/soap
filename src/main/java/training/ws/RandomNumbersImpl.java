package training.ws;

import java.util.Random;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.RPC)
public class RandomNumbersImpl implements RandomNumbers {

	public int getRandomRange(int range ) {
		return new Random().nextInt(range);
	}
}
