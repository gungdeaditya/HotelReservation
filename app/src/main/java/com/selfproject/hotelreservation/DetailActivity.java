package com.selfproject.hotelreservation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView txCost, txTitle, txLocation, txRating;
    private ImageView image;
    private Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txCost = (TextView)findViewById(R.id.cost);
        txTitle = (TextView)findViewById(R.id.title);
        txLocation = (TextView)findViewById(R.id.location);
        txRating = (TextView)findViewById(R.id.rating);
        image = (ImageView) findViewById(R.id.image);
        btnShare = (Button)findViewById(R.id.btn_share);

        if(getString(R.string.judul_hotel_inna).equals(getIntent().getStringExtra(MainActivity.nama_hotel1))){
            image.setImageResource(R.drawable.ic_hotel1);
            txTitle.setText(getString(R.string.judul_hotel_inna));
            txCost.setText(getString(R.string.harga_hotel_inna));
            txLocation.setText(getString(R.string.alamat_hotel_inna));
            txRating.setText(getString(R.string.rating_hotel_inna));
        }
        else if(getString(R.string.judul_hotel_jaffara).equals(getIntent().getStringExtra(MainActivity.nama_hotel2))){
            image.setImageResource(R.drawable.ic_hotel2);
            txTitle.setText(getString(R.string.judul_hotel_jaffara));
            txCost.setText(getString(R.string.harga_hotel_jaffara));
            txLocation.setText(getString(R.string.alamat_hotel_jaffara));
            txRating.setText(getString(R.string.rating_hotel_jaffara));
        }

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, txTitle.getText().toString()
                        + "\n"
                        + "Lokasi : " + txLocation.getText().toString()
                        + "\n"
                        + "Rating : " + txRating.getText().toString()
                        + "\n"
                        + "Harga : " + txCost.getText().toString()
                );
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
