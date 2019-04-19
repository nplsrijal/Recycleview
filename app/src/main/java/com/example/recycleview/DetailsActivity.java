package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView imgview;
    TextView txtname,txtnum,txtemail,txtaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgview=findViewById(R.id.imgProfile);
        txtname=findViewById(R.id.tvName);
        txtemail=findViewById(R.id.tvEmail);
        txtnum=findViewById(R.id.tvPhone);
        txtaddress=findViewById(R.id.tvAddress);

        Bundle bundle =getIntent().getExtras();
        if(bundle !=null){
            imgview.setImageResource(bundle.getInt("image"));
            txtname.setText(bundle.getString("name"));
            txtnum.setText(bundle.getString("phone"));
            txtemail.setText(bundle.getString("email"));
            txtaddress.setText(bundle.getString("address"));

        }
    }
}
