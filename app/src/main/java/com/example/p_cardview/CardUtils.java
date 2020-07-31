package com.example.p_cardview;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

public class CardUtils extends CardView {
    public CardUtils(@NonNull Context context) {
        super(context);
    }

    public CardUtils(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CardUtils(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
