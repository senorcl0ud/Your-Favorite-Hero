package claude.com.yourfavoriteheroes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView dc_comics;
    ImageView marvel_comics;
    ImageView other_comics;
    Button learnMoreMarvel;
    Button learnMoreDc;
    Button learnMoreOther;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        dc_comics = (ImageView) findViewById(R.id.dc_comics_background);
        marvel_comics = (ImageView) findViewById(R.id.marvel_comic_background);
        other_comics = (ImageView) findViewById(R.id.spawn_background);

        learnMoreMarvel = (Button) findViewById(R.id.learn_marvel_heroes_button);

        learnMoreDc = (Button) findViewById(R.id.learn_dc_heroes_button);

        learnMoreOther = (Button) findViewById(R.id.learn_other_heroes_button);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void learnMoreMarvel(View v){
        Intent i = new Intent(MainActivity.this, MarvelHeroRoster.class);
        startActivity(i);
    }
    public void learnMoreDc(View v){
        startActivity(new Intent(MainActivity.this, DcHeroRoster.class));
    }
    public void learnMoreOther(View v){
        Intent i = new Intent(MainActivity.this,OtherHeroesRoster.class);
        startActivity(i);
    }

}
