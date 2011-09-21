import junit.framework.Assert;

public class BarcodeProcessorTest extends junit.framework.TestCase {
	IBarcodeProcessor mProcessor;
	TestScreen mScreen;
	ImMemoryCatalogue mPricelist;

	public void setUp(){
		mScreen = new TestScreen();
		mPricelist = new ImMemoryCatalogue();
		mProcessor = new BarcodeProcessor(mScreen, mPricelist);
	}

	public void test_bar_code_12345_displays_500_euro(){
		mProcessor.onBarcode("12345");
		Assert.assertEquals("EUR 500.0", mScreen.getText());
	}

	public void test_bar_code_99999_displays_no_product_found_message(){
		mProcessor.onBarcode("99999");
		Assert.assertEquals("No productfound: 99999", mScreen.getText());
	}

	public void test_empty_bar_code_displays_error_message(){
		mProcessor.onBarcode("");
		Assert.assertEquals("Scan error: empty barcode", mScreen.getText());
	}
}
