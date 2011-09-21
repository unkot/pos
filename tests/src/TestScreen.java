import java.lang.String;

public class TestScreen implements IScreen{
	private String mText;

	public String getText(){
		return mText;
	}

	public void setPrice(Long price) {
		mText = String.format("EUR %s.%s", price / 100, price % 100);
	}

	public void setEmptyBarcodeErrorMessage() {
		mText = "Scan error: empty barcode";
	}

	public void setBarcodeNotFoundErrorMessage(String barcode) {
		mText = String.format("No productfound: %s", barcode);
	}
}
