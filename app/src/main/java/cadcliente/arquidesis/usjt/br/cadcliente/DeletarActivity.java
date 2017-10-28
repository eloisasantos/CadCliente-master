package cadcliente.arquidesis.usjt.br.cadcliente;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Eloisa on 26/10/2017.
 */

public class DeletarActivity extends AppCompatActivity {

    public EditText editTextNome;
    public EditText editTextIdade;
    public EditText editTextCpf;
    public EditText editTextTelefone;
    public EditText editTextId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletar);

        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        editTextCpf = (EditText) findViewById(R.id.editTextCpf);
        editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);


    }


    public void DeletarRegistro(View view) {


        Cliente cliente = Cliente.findById(Cliente.class, 1);
        Cliente.deleteAll();

        }
    }


