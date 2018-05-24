package claude.com.yourfavoriteheroes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MarvelHeroRoster extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button spidermanWiki;
        Button spidermanVideos;
        Button hulkWiki;
        Button hulkVideos;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marvel_hero_roster);
        spidermanWiki = (Button) findViewById(R.id.spiderman_wikipedia);
            spidermanWiki.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent spidermanWiki = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://en.wikipedia.org/wiki/Spider-Man"));
                    startActivity(spidermanWiki);
                }
            });
        spidermanVideos = (Button) findViewById(R.id.spiderman_videos);
            spidermanVideos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent spidermanVideos = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.youtube.com/playlist?list=PL6FhCd_HO_ABbEjObNy-9Z1LrXOItj4F_"));
                    startActivity(spidermanVideos);
                }
            });

        hulkVideos = (Button) findViewById(R.id.hulk_videos);
            hulkVideos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent hulkVideos = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.youtube.com/playlist?list=PL6FhCd_HO_ABW_2jGsyf2awK_ysfJL0te"));
                    startActivity(hulkVideos);
                }
            });

        hulkWiki = (Button) findViewById(R.id.hulk_wiki);
        hulkWiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hulkWiki = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://en.wikipedia.org/wiki/Hulk_(comics)"));
                startActivity(hulkWiki);
            }
        });

    }


}
