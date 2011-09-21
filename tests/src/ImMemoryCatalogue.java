import java.lang.Long;
import java.lang.String;
import java.util.HashMap;

public class ImMemoryCatalogue implements ICatalogue {
	HashMap<String, Long> mValues;

	public ImMemoryCatalogue(){
		mValues = new HashMap<String, Long>();
		mValues.put("12345", new Long(50000));
	}

	public Long getPrice(String barcode) {
		if (mValues.containsKey(barcode)){
			return mValues.get(barcode);
		}

		return null;
	}
}
