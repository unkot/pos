import java.lang.String;

public class TestScreen implements IScreen{
	private String mText;

	public void showText(String text) {
		mText = text;
	}

	public String getText(){
		return mText;
	}
}
