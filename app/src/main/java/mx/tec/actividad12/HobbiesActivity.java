// Michel Lujano
// Activity 1.2
// A01636172
// HobbiesActivity.java

package mx.tec.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HobbiesActivity extends AppCompatActivity {

    private EditText whatIsYourHobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);

        whatIsYourHobby = findViewById(R.id.whatIsYourHobby);
    }

    public void goBackToMenuActivity(View v){
        Intent goBackToMenuActivityNoReturn = new Intent(this, MenuActivity.class);
        goBackToMenuActivityNoReturn.putExtra("whatIsYourHobby", whatIsYourHobby.getText().toString());
        //this.startActivity(goBackToMenuActivityNoReturn);

        setResult(Activity.RESULT_OK, goBackToMenuActivityNoReturn);
        finish();
    }



}