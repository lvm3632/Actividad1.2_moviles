// Michel Lujano
// Activity 1.2
// A01636172
// MenuActivity.java

package mx.tec.actividad12;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private TextView textoSaludo, emptyTextView;

    public static String temp = "";
    private static final int HobbiesActivity_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textoSaludo = findViewById(R.id.saludo);
        emptyTextView = findViewById(R.id.emptyTextView);

        String txtActual = textoSaludo.getText().toString();
        Intent ClassMainActivity = getIntent();
        String nameFromMainActivity = ClassMainActivity.getStringExtra("saludo");
        textoSaludo.setText(txtActual + " " + nameFromMainActivity);
    }



    public void goToHobbiesActivity(View v){
        Intent exchange = new Intent(this, HobbiesActivity.class);
        this.startActivityForResult(exchange, HobbiesActivity_CODE);
    }

    public void goToFriendsActivity(View v){
        Intent exchange = new Intent(this, FriendsActivity.class);
        this.startActivity(exchange);
    }

    public void goToLeaveAMessageActivity(View v){
        Intent exchange = new Intent(this, leaveAMessageActivity.class);
        this.startActivity(exchange);
    }


    public static String getTemp() {
        return temp;
    }

    public static void setTemp(String temp) {
        MenuActivity.temp = temp;
    }

    // Recibir datos de otras clases
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == Activity.RESULT_OK
                && !data.equals(null)
                && requestCode == HobbiesActivity_CODE)
        {
            String whatIsYourHobby = data.getStringExtra("whatIsYourHobby");
            emptyTextView.setText(whatIsYourHobby);
            Log.d("onActivityResult", "Entro?"); // de debug

            if(whatIsYourHobby == null)
            {
                emptyTextView.setText(MenuActivity.getTemp());
            }else {
                emptyTextView.setText(whatIsYourHobby);
                //temp = whatIsYourHobby;
                MenuActivity.setTemp(whatIsYourHobby);
            }

        }

    }


}