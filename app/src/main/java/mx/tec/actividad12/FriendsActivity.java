// Michel Lujano
// Activity 1.2
// A01636172
// FriendsActivity.java

package mx.tec.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FriendsActivity extends AppCompatActivity {

    //private String tmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);
        //this.tmp = MenuActivity.temp;
    }


    public void goToBackMenuActivity(View v){
        Intent goBackToMenuActivityNoReturn = new Intent(this, MenuActivity.class);
        //goBackToMenuActivityNoReturn.putExtra("whatIsYourHobby", this.tmp);
        goBackToMenuActivityNoReturn.putExtra("whatIsYourHobby", MenuActivity.getTemp());

        //this.startActivity(goBackToMenuActivityNoReturn);

        setResult(Activity.RESULT_OK, goBackToMenuActivityNoReturn);
        finish();
    }



}