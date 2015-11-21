package carloscompany.recordnotas;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Actividad extends AppCompatActivity {

    Fragment nota, recordatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad);

        nota=new Notas_Fragment();
        recordatorio=new Recordatorio_Fragment();
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.contenedor,nota,"nota").addToBackStack(null).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actividad, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.save){

            Toast.makeText(Actividad.this, "Save", Toast.LENGTH_SHORT).show();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onNotes(View v){
       getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,nota,"nota").addToBackStack(null).commit();
    }

    public void onRecord(View v){
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,recordatorio,"recordatorio").addToBackStack(null).commit();
    }

}
