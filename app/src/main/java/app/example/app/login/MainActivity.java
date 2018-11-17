package app.example.app.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button btn;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.loginBtn);
        text = (TextView) findViewById(R.id.logintext);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Username can not be empty", Toast.LENGTH_SHORT).show();
                }else if(pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Password can not be empty", Toast.LENGTH_SHORT).show();
                }else if(pass.getText().toString().length() < 8){
                    Toast.makeText(getApplicationContext(), "Password length should be 8 characters!", Toast.LENGTH_SHORT).show();
                }else{
                    text.setText("Username: "+user.getText()+"\nPassword: "+pass.getText());
                    user.setText("");
                    pass.setText("");
                    ;
                    //startActivity(new Intent(MainActivity.this,Main2Activity.class));
                }
            }
        });
    }
}
