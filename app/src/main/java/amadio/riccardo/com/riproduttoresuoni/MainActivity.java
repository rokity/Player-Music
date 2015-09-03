package amadio.riccardo.com.riproduttoresuoni;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    MediaPlayer myMediaPlayer = new MediaPlayer();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button myButtonOne = (Button) findViewById(R.id.btn_audio);
        myButtonOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(myMediaPlayer!=null)
                if(myMediaPlayer.isPlaying())
                    myMediaPlayer.pause();
                myMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sound);
                myMediaPlayer.setLooping(true);
                myMediaPlayer.start();

            }
        });



        Button myButtonTwo = (Button) findViewById(R.id.btn_audio2);
        myButtonTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(myMediaPlayer!=null)
                    if(myMediaPlayer.isPlaying())
                        myMediaPlayer.pause();
                myMediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sound2);
                myMediaPlayer.setLooping(true);
                myMediaPlayer.start();

            }
        });






        Button myButtonTree = (Button) findViewById(R.id.btn_stop);
        myButtonTree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                myMediaPlayer.pause();

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
