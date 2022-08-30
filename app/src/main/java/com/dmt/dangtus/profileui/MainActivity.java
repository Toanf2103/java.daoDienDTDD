package com.dmt.dangtus.profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnFollow;
    TextView txtFollowers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhXa();

        btnFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //hien thong bao follow thanh cong
                Toast.makeText(MainActivity.this, "Follow successfully", Toast.LENGTH_SHORT).show();

                //tang so luong followers
                int followers = Integer.parseInt(txtFollowers.getText().toString());
                txtFollowers.setText(String.valueOf(followers + 1));
            }
        });
    }

    private void anhXa() {
        btnFollow = (Button) findViewById(R.id.followButton);
        txtFollowers = (TextView) findViewById(R.id.followersTextView);
    }
}