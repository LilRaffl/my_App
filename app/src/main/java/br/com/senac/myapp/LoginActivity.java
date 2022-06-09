package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //declarar as variaveis global
    EditText edtEmail, edtSenha;
    Button btnLogin;
    TextView txtRecuperaSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);
        txtRecuperaSenha = findViewById(R.id.txtRecuperaSenha);

        //Cliando o clique do botão
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegando os valores do email e senha do usuário
                String email, senha;
                email = edtEmail.getText().toString();
                senha = edtSenha.getText().toString();


                //criando a estrutura de decisão para acesso ao sistema

                if (email.equals("senac@sp.senac.br") && senha.equals("senac")) {

                    //entrar aqui

                    Intent intent = new Intent(getApplicationContext(),
                            MenuPrincipalActivity.class);

                    //passar parâmetros para outras janelas


                    startActivity(intent);

                }

            }
        });

        txtRecuperaSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    public void abrirFacebook(View view) {
        Toast.makeText(getApplicationContext(),
                "cliquei no botão do Facebfook",
                Toast.LENGTH_SHORT).show();

    }
}