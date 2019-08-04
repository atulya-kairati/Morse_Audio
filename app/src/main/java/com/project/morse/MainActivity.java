package com.project.morse;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText source;
    String string, morse = "";
    static List<Integer> sound = new ArrayList<>();
    static int serial = 0;
    static Button copy;
    static MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.output);
        source = findViewById(R.id.input);
        copy = findViewById(R.id.copy);

    }

    public void convert(View v){

        //result.;
        morse = "";
        sound.clear();

        string = source.getText().toString().toLowerCase();

        for (int i =0; i<string.length(); i++){

            char c = string.charAt(i);
            morse += Data.toMorse(c) + " ";
            sound.add(Data.getAudio(c));

        }

        result.setText(morse);

    }

    public void copy(View v){

        // copy to the clipboard
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Copied", morse);
        clipboard.setPrimaryClip(clip);


    }



    public void startAudio(View v){

        Log.w(">>>>>>", String.valueOf(sound));

        serial = 0;
        copy.setEnabled(false);

        makeAudio();

    }


    private void makeAudio(){

        mediaPlayer = MediaPlayer.create(this, sound.get(serial));
        Log.w(">>>>>>", ""+serial );

        mediaPlayer.start();

        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            // Override onCompletion method to apply desired operations.
            @Override
            public void onCompletion(MediaPlayer mediaPlayer){
                // Whatever you want to do when the audio playback is done...
                //Toast.makeText(MainActivity.this,"I'm done!", Toast.LENGTH_LONG).show();
                Log.w(">>>>>>", ""+serial );
                serial++;
                if (serial < sound.size()) {
                    mediaPlayer.release();
                    makeAudio();
                }
                else {
                    sound.size();
                    mediaPlayer.reset();
                    copy.setEnabled(true);
                    //mediaPlayer = null;
                }
            }
        } );

    }
}
