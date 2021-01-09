// Michel Lujano
// Activity 1.2
// A01636172
// leaveAMessageActivity.java

package mx.tec.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class leaveAMessageActivity extends AppCompatActivity {

    private Button btnsndMsg;
    private EditText texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_a_message);
        btnsndMsg = findViewById(R.id.btnSendMsg);
        texto = findViewById(R.id.textoMsg);
        btnsndMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(leaveAMessageActivity.this, "mensaje enviado: " + texto.getText(), Toast.LENGTH_SHORT).show();
                goToBackMenuActivity(v);
            }
        });
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