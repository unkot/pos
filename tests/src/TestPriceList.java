import java.lang.Long;
import java.lang.String;

public class TestPriceList implements IPriceList{
	public Long getPrice(String barcode) {
		if (barcode == "12345"){
				return new Long(50000);
		}

		return null;
	}

	public String getCurrency(String barcode) {
		return "EUR";
	}
}
