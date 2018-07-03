package ajaymehta.picassowithhttps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagehttpss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagehttpss = (ImageView) findViewById(R.id.imagehttps);

// it takes time to load image not using progress par ...so wait for image to load... la la al
        PicasoTrustAll.getInstance(MainActivity.this)
                .load("https://img-ozdilek.mncdn.com/images/catalog/200x310/8697353381607.jpg")
                .into(imagehttpss);
    }
}
