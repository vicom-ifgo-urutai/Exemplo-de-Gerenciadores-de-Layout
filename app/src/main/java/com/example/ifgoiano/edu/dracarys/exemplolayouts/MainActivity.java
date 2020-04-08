package com.example.ifgoiano.edu.dracarys.exemplolayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        String[] items = new String[] {
                "Exemplos de layout",
                "FrameLayout",
                "LinearLayout",
                "TableLayout",
                "GridLayout",
                "RelativeLayout",
                "ConstraintLayout",
                "Layout Aninhado - Complexo",
                "ScrollView",
                "ScroolView Inflate"

        };

        this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, items));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        try {
            switch (position) {
                case 0:
                    Toast.makeText(this, "Abra os arquivos de layout XML e veja a pré-visualização no editor.", Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    startActivity(new Intent(this, ExemploFrameLayoutActivity.class));
                    break;
                case 2:
                    startActivity(new Intent(this, ExemploLinearLayoutActivity.class));
                    break;
                case 3:
                    startActivity(new Intent(this, ExemploTableLayoutActivity.class));
                    break;
                case 4:
                    startActivity(new Intent(this, ExemploGridLayoutActivity.class));
                    break;
                case 5:
                    startActivity(new Intent(this, ExemploRelativeLayoutActivity.class));
                    break;
                case 6:
                    startActivity(new Intent(this, ExemploConstraintLayoutActivity.class));
                    break;
                case 7:
                    startActivity(new Intent(this, ExemploLinearLayoutAninhadoActivity.class));
                    break;
                case 8:
                    startActivity(new Intent(this, ExemploScrollViewActivity.class));
                    break;
                case 9:
                    startActivity(new Intent(this, ExemploScrollViewInflateActivity.class));
                    break;

                default:
                    finish();
                    break;
            }
        } catch (Exception e) {
            Toast.makeText(this, "Erro :" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
