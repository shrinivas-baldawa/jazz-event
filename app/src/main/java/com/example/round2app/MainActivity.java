package com.example.round2app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.one));
        slideModels.add(new SlideModel(R.drawable.two));
        slideModels.add(new SlideModel(R.drawable.three));
        imageSlider.setImageList(slideModels,true);


        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter = new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);

    }

    private ArrayList<Model> getMyList() {

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("The NCPA National Jazz Festival- The Latination and Kevin davy Quintet");
        m.setDescription("Tata Theater: The NCPA");
        m.setPrice("Rs 269");
        m.setDate("November 10, 2020");
        m.setImg(R.drawable.ncpa);
        models.add(m);

        m = new Model();
        m.setTitle("Sanjeetha Bhattacharya Live at the Finch");
        m.setDescription("Tata Theater: The NCPA");
        m.setPrice("Rs 389");
        m.setImg(R.drawable.sanjeeta);
        m.setDate("November 17, 2020");
        models.add(m);

        m = new Model();
        m.setTitle("The NCPA international Jazz Festival- Greg Banaszak Quintet and Jam Session");
        m.setDescription("Tata Theater: The NCPA");
        m.setPrice("Rs 269");
        m.setDate("November 21, 2020");
        m.setImg(R.drawable.ncpa1);
        models.add(m);

        m = new Model();
        m.setTitle("Pre-Festival Talk with NMF Artistic Director Richard Rosenberg");
        m.setDescription("Tata Theater: The NCPA");
        m.setPrice("Rs 299");
        m.setDate("November 25, 2020");
        m.setImg(R.drawable.sefxone);
        models.add(m);

        m = new Model();
        m.setTitle("NMF Musicians’ Orientation");
        m.setDescription("Tata Theater: The NCPA");
        m.setPrice("Rs 349");
        m.setDate("November 29, 2020");
        m.setImg(R.drawable.newtwen);
        models.add(m);

        m = new Model();
        m.setTitle("The Monterey Jazz Festival");
        m.setDescription("Tata Theater: The NCPA");
        m.setPrice("Rs 249");
        m.setDate("December 5, 2020");
        m.setImg(R.drawable.newtwex);
        models.add(m);

        return models;


    }


}