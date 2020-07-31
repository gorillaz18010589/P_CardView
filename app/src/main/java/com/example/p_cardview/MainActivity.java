package com.example.p_cardview;
/*      CardView
        app:cardElevation：設定陰影的大小。
        app:cardMaxElevation：設定陰影最大高度。
        app:cardBackgroundColor：設定卡片的背景色。
        app:cardCornerRadius：設定卡片的圓角大小。
        app:contentPadding：設定內容的padding。
        app:contentPaddingTop：設定內容的上padding。
        app:contentPaddingLeft：設定內容的左padding。
        app:contentPaddingRight：設定內容的右padding。
        app:contentPaddingBottom：設定內容的底padding。
        app:cardUseCompatPadding：是否使用CompatPadding。
        app:cardPreventConrerOverlap：是否使用PreventCornerOverlap。
*/

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        cardView = findViewById(R.id.cardView);
//        cardView.setPadding(3,10,20,5);
    }
}
