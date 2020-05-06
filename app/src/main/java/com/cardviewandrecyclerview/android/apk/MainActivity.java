package com.cardviewandrecyclerview.android.apk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<book> mlistbooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlistbooks = new ArrayList<>();
        mlistbooks.add(new book("Aquaman","Aquaman is a story of a Water-man","Action",R.drawable.aquaman));
        mlistbooks.add(new book("Black Panther","Black panther is a dangerous movie","Action",R.drawable.blackpanther));
        mlistbooks.add(new book("Boss Baby","The Boss Baby is a story of small child","comedy",R.drawable.bossbaby));
        mlistbooks.add(new book("Furious","fast and furious is tranding hollywood movie in the world","Action",R.drawable.fastandfurious));
        mlistbooks.add(new book("127 Hours","127 Hours is a motivation movie","Motivate",R.drawable.motivate));
        mlistbooks.add(new book("The Martian","The Martian is a story of Astronaut of NASA","Education",R.drawable.themartian));
        mlistbooks.add(new book("Venom","Venom is best horrible movie in the world","Action",R.drawable.venom));
        mlistbooks.add(new book("Aquaman","Aquaman is a story of a Water-man","Action",R.drawable.aquaman));
        mlistbooks.add(new book("127 Hours","127 Hours is a motivation movie","Motivate",R.drawable.motivate));
        mlistbooks.add(new book("Black Panther","Black panther is a dangerous movie","Action",R.drawable.blackpanther));
        mlistbooks.add(new book("Furious","fast and furious is tranding hollywood movie in the world","Action",R.drawable.fastandfurious));
        mlistbooks.add(new book("Boss Baby","The Boss Baby is a story of small child","comedy",R.drawable.bossbaby));
        mlistbooks.add(new book("Furious","fast and furious is tranding hollywood movie in the world","Action",R.drawable.fastandfurious));

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this,mlistbooks);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));



    }


}
