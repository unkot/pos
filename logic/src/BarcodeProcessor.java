import java.lang.Long;
import java.lang.String;

public class BarcodeProcessor implements IBarcodeProcessor{
	private IScreen mScreen;
	private IPriceList mPricelist;

	public BarcodeProcessor(IScreen screen, IPriceList priceList){
		mScreen = screen;
		mPricelist = priceList;
	}

	public void onBarcode(String code){
		if(code.length() == 0){
			mScreen.showText("Scan error: empty barcode");
			return;
		}

		Long price = mPricelist.getPrice(code);
		if (price != null){
			String currency = mPricelist.getCurrency(code);
			mScreen.showText(String.format("%s %s.%s", currency, price / 100, price % 100));
		}
		else{
			mScreen.showText(String.format("No productfound: %s", code));
		}
	}
}
