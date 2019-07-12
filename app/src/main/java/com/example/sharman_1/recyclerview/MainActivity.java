package com.example.sharman_1.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Apple MacBook Air Core i5 5th Gen - (8 GB/128 GB SSD/Mac OS Sierra)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        60000,
                        R.drawable.macbook));

        productList.add(
                new Product(
                        1,
                        "Dell Inspiron 7000 Core i5 7th Gen - (8 GB/1 TB HDD/Windows 10 Home)",
                        "14 inch, Gray, 1.659 kg",
                        4.3,
                        45500,
                        R.drawable.dellinspiron));

        productList.add(
                new Product(
                        1,
                        "Microsoft Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.3,
                        47000,
                        R.drawable.surface));



        productList.add(
                new Product(
                        1,
                        "Acer SF314-55G-51SC. Windows 10 Home - 1.60 GHz - NVIDIA® - GeForce® MX150 - 14\" - 1920 x 1080 - 8 GB - 512 GB",
                        "14 inch, Silver, 1.35 kg",
                        4.3,
                        48000,
                        R.drawable.accer));
        productList.add(
                new Product(
                        1,
                        "HP Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "13.3 inch, Silver, 1.35 kg",
                        4.2,
                        30000,
                        R.drawable.hp));
        productList.add(
                new Product(
                        1,
                        "iBall M500 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "14 inch, blue, 1.35 kg",
                        4.0,
                        12000,
                        R.drawable.iball));

        productList.add(
                new Product(
                        1,
                        "Lenovo Surface Pro 4 Core m3 6th Gen - (4 GB/128 GB SSD/Windows 10)",
                        "14.3 inch, black, 1.28 kg",
                        3.9,
                        37000,
                        R.drawable.lenovo));
        productList.add(
                new Product(
                        1,
                        "Asus APU Dual Core A6 - (4 GB/1 TB SSD/Windows 10)",
                        "15.6 inch, black, 2 kg",
                        4.3,
                        19000,
                        R.drawable.asus));


        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
