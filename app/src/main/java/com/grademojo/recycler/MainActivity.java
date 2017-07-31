package com.grademojo.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private Adapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);





        List<Getter_Getter> input = new ArrayList<>();

        for (int i = 0; i < 15; i++) {


            Getter_Getter getter_getter = new Getter_Getter();


            getter_getter.setClick_option(
                    Getter_Getter.MALE_CLICKED
            );


            getter_getter.setRoll_no(""+i);

            getter_getter.setName("name"+i);

            getter_getter.setClass2("class"+i);

            getter_getter.setGender("gender"+i);

            getter_getter.setSection("section"+i);


            input.add(getter_getter);
        }



        mAdapter = new Adapter(input);






        recyclerView.setAdapter(mAdapter);


        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);







        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);


        recyclerView.setLayoutManager(mLayoutManager);






    }
}

