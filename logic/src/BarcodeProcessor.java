import java.lang.Long;
import java.lang.String;

public class BarcodeProcessor implements IBarcodeProcessor{
	private IScreen mScreen;
	private ICatalogue mPricelist;

	public BarcodeProcessor(IScreen screen, ICatalogue catalogue){
		mScreen = screen;
		mPricelist = catalogue;
	}

	public void onBarcode(String barcode){
		if(barcode == null || barcode.length() == 0){
			mScreen.setEmptyBarcodeErrorMessage();
			return;
		}

		Long price = mPricelist.getPrice(barcode);
		if (price != null){
			mScreen.setPrice(price);
		}
		else{
			mScreen.setBarcodeNotFoundErrorMessage(barcode);
		}
	}
}
