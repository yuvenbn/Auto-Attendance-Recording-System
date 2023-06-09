package com.example.TickMe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.TickMe.model.Person_Model_Class;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView textView; Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getcourse();
            }
        });
    }
    public void getcourse()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.43.107/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        Call<Person_Model_Class> call = retrofitAPI.getPerson();
        call.enqueue(new Callback<Person_Model_Class>() {

            @Override
            public void onResponse(@NonNull Call<Person_Model_Class> call, @NonNull Response<Person_Model_Class> response) {
                textView.setText(response.toString());
                if(response.isSuccessful())
                {
                   // textView.setText(response.body().toString());
                    System.out.println(response.body() + "*************************************************");
                }
                else
                {
                    textView.setText(response.toString());
                }
            }

            @Override
            public void onFailure(@NonNull Call<Person_Model_Class> call, @NonNull Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_LONG).show();
                System.out.println(t.toString() + "**************************************************************");
                textView.setText(t.toString());
            }


        });
    }
}