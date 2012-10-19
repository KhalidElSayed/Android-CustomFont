package org.pierrre.customfont;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomFontHelper {
	public static void initWithAttributes(TextView textView, AttributeSet attrs) {
		TypedArray styledAttributes = textView.getContext().obtainStyledAttributes(attrs, R.styleable.CustomFont);
		
		String font = styledAttributes.getString(R.styleable.CustomFont_font);
		
		if (font != null) {
			CustomFontHelper.setFont(textView, font);
		}
	}
	
	public static void setFont(TextView textView, String font) {
		textView.setTypeface(font != null ? Typeface.createFromAsset(textView.getContext().getAssets(), "fonts/" + font) : Typeface.DEFAULT);
	}
}
