# Android Custom Library

This library allows to set a custom font on a TextView.

## Compatibility

This library is compatible from API 8 (Android 2.2), but it should work on previous versions.

## Usage

Add your font file in `/assets/fonts` directory.

Add the View to the layout:

``` xml
<org.pierrre.customfont.CustomFontTextView xmlns:customfont="http://schemas.android.com/apk/res-auto"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="My Text with custom font"
    customfont:font="MyFont.ttf" >

<!-- Your views here, it's a FrameLayout -->

</org.pierrre.fixedratio.FixedRatioView>
```

## Contact

- Email: pierredurand@gmail.com
- Twitter: [@pierredurand87](https://twitter.com/pierredurand87)
- Google+: [Pierre Durand](https://plus.google.com/115978530878583279430)
- GitHub: [pierrre](https://github.com/pierrre)
