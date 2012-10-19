package org.pierrre.customfont;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class CustomFontButton extends Button {
	public CustomFontButton(Context context) {
		super(context);
	}
	
	public CustomFontButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		CustomFontHelper.initWithAttributes(this, attrs);
	}
	
	public CustomFontButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		
		CustomFontHelper.initWithAttributes(this, attrs);
	}
}
