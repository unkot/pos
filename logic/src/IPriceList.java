import java.lang.Long;
import java.lang.String;

public interface IPriceList {
	Long getPrice(String barcode);
	String getCurrency(String barcode);
}
