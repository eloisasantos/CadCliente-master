package cadcliente.arquidesis.usjt.br.cadcliente;

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

       /**Cliente cliente = new Cliente();
        cliente.setNome(editTextNome.getText().toString());
        cliente.setIdade(Integer.parseInt(editTextIdade.getText().toString()));
        cliente.setCpf(editTextCpf.getText().toString());
        cliente.setTelefone(editTextNome.getText().toString());

        cliente.save();

        Toast.makeText(this, "Registro salvo com sucesso ! Reg: " + cliente.getId(), Toast.LENGTH_LONG).show();

        finish();

*/
    }

}
