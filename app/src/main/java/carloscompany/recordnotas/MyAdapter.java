package carloscompany.recordnotas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Vector;

/**
 * Created by Carlos on 20/11/2015.
 */
public class MyAdapter extends BaseAdapter {

    private final Activity mainAct;
    private final Vector lista;

    public MyAdapter(Activity actividad, Vector lista){
        this.mainAct=actividad;
        this.lista=lista;

    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.elementAt(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=mainAct.getLayoutInflater();
        View view=inflater.inflate(R.layout.list_objetos, null, true);
        TextView textView=(TextView)view.findViewById(R.id.titulo);
        textView.setText((Integer) lista.elementAt(position));
        ImageView imageView=(ImageView)view.findViewById(R.id.icono);

        switch (Math.round((float)Math.random()*3)){
            case 0: imageView.setImageResource(R.drawable.circle_yellow);
                break;
            case 1: imageView.setImageResource(R.drawable.circle_yellow);
                break;
            case 2: imageView.setImageResource(R.drawable.circle_yellow);
                break;

            default: imageView.setImageResource(R.mipmap.ic_launcher);
                break;
        }

        return view;
    }
}
