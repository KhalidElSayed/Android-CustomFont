package org.pierrre.customfont;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomFontTextView extends TextView {
	public CustomFontTextView(Context context) {
		super(context);
	}
	
	public CustomFontTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		CustomFontHelper.initWithAttributes(this, attrs);
	}
	
	public CustomFontTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		
		CustomFontHelper.initWithAttributes(this, attrs);
	}
}
