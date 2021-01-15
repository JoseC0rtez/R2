package com.example.r1diseo;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class singup extends AppCompatActivity {
    Button bt_SaveUser, bt_login;
    EditText t_name, t_username,t_email,t_password;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        t_name=(EditText) findViewById(R.id.editTextName);
        t_username=(EditText) findViewById(R.id.editTextNameUser);
        t_email=(EditText) findViewById(R.id.editTextEmail);
       t_password=(EditText) findViewById(R.id.editTextPassword);
        bt_SaveUser = (Button) findViewById(R.id.guardarRegistro);
        bt_login = (Button) findViewById(R.id.Alogin);
        bt_SaveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");
                String name =t_name.getText().toString();
                String username = t_username.getText().toString();
                String email = t_email.getText().toString();
                String password = t_password.getText().toString();
                UsersHelperClass helperClass = new UsersHelperClass
                        (name, username, email,password);
                reference.child(username).setValue(helperClass);
            }
        });
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            startActivity
                    (new Intent(singup.this, login.class));
        }
    });
    }
}