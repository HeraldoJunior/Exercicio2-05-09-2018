package uniopet.edu.br.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText idade;
    private String categoria;
    private TextView categoriaCamp;
    private int idadePreenchida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idade = findViewById(R.id.editIdade);
        categoriaCamp = findViewById(R.id.categoriaCamp);
    }

    public void definirCategoria(View view){

        idadePreenchida = Integer.parseInt(idade.getText().toString()) ;

        if(idadePreenchida<8){
            categoria = "Idade invalida! Não pode participar de nenhuma categoria!";
            categoriaCamp.setText(categoria);

        }else if(idadePreenchida>=8 & idadePreenchida<=12){
            categoria = "Sua Categoria é Jovens";
            categoriaCamp.setText(categoria);

        }else if(idadePreenchida>=13 & idadePreenchida<=17){
            categoria = "Sua Categoria é Juvenil";
            categoriaCamp.setText(categoria);

        }else if(idadePreenchida>=18){
            categoria = "Sua Categoria é Adulto";
            categoriaCamp.setText(categoria);
        }
        //Toast.makeText(this, categoria, Toast.LENGTH_LONG).show();
    }
}
