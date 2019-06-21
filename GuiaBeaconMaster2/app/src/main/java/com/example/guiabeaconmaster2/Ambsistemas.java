package com.example.guiabeaconmaster2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Ambsistemas extends AppCompatActivity {

    EditText txtid,txtcod,txtnom,txtini,txtfin;
    Button btnbuscar;

    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambsistemas);

        txtid= findViewById(R.id.edtid);
        txtcod= findViewById(R.id.edtCodbeacon);
        txtnom= findViewById(R.id.edtNombreBeacon);
        txtini= findViewById(R.id.edtFechainicio);
        txtfin= findViewById(R.id.edtFechafin);

        btnbuscar= findViewById(R.id.btnConsultar);

        btnbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buscar("http://192.168.1.129/DBeacons/buscar.php?id_horario="+txtid.getText()+"");
            }
        });

    }

    private void buscar(String url){

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                JSONObject jsonObject = null;
                for (int i = 0; i <response.length(); i++) {
                    try {
                        jsonObject = response.getJSONObject(i);
                        txtcod.setText(jsonObject.getString("cod_beacon"));
                        txtnom.setText(jsonObject.getString("nombre_beacon"));
                        txtini.setText(jsonObject.getString("fecha_inicio"));
                        txtfin.setText(jsonObject.getString("fecha_fin"));


                    } catch (JSONException e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "error de conexion", Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonArrayRequest);

    }



}
