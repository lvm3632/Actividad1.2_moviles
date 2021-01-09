// Michel Lujano
// Activity 1.2
// A01636172
// MainActivity.java

package mx.tec.actividad12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.editTextSaludo);
        
    }


    public void greetingNoReturn(View w){
        Intent exchange = new Intent(this, MenuActivity.class);
        exchange.putExtra("saludo", input.getText().toString());
        this.startActivity(exchange);
        finish();
    }


}