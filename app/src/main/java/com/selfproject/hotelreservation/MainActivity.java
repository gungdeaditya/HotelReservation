package com.selfproject.hotelreservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView cardHotelInna, cardHotelJaffara;
    public static final String nama_hotel1 = "";
    public static final String nama_hotel2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardHotelInna = (CardView)findViewById(R.id.cardHotel);
        cardHotelJaffara = (CardView)findViewById(R.id.cardHotel2);

        cardHotelInna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_hotel1,getString(R.string.judul_hotel_inna));
                startActivity(intent);
            }
        });

        cardHotelJaffara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra(nama_hotel2,getString(R.string.judul_hotel_jaffara));
                startActivity(intent);
            }
        });
    }
}
