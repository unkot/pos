import java.lang.String;

public interface IScreen {
	void setPrice(Long price);
	void setEmptyBarcodeErrorMessage();
	void setBarcodeNotFoundErrorMessage(String barcode);
}