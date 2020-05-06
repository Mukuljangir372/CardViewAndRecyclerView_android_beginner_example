package com.cardviewandrecyclerview.android.apk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FullBookActivity extends AppCompatActivity {
    private String title;
    private String category;
    private String description;
    private int thumbnail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_book);
        //receiving data from RecyclerViewAdapter
        Intent intent = getIntent();
        title = intent.getStringExtra("Title");
        category = intent.getStringExtra("category");
        description = intent.getStringExtra("description");
        thumbnail = intent.getExtras().getInt("thumbnail");

        TextView text_title = (TextView)findViewById(R.id.title_id);
        text_title.setText(title);
        TextView text_category = (TextView)findViewById(R.id.category_id);
        text_category.setText(category);
        TextView text_description = (TextView)findViewById(R.id.description_id);
        text_description.setText(description);
        ImageView imageView_thumbail = (ImageView)findViewById(R.id.thumbnail_id);
        imageView_thumbail.setImageResource(thumbnail);

    }
}
