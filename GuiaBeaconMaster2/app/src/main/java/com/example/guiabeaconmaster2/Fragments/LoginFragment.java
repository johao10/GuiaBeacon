package com.example.guiabeaconmaster2.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.example.guiabeaconmaster2.Activitys.PanelActivity;
import com.example.guiabeaconmaster2.R;
import com.example.guiabeaconmaster2.Entitys.User;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginFragment extends Fragment implements Response.Listener<JSONObject>, Response.ErrorListener{

    RequestQueue rq;
    JsonRequest jrq;
    EditText cajaUser, cajaPwd;
    Button btnConsultar,btnRegistrar;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_login ,container,false);
        cajaUser=(EditText) vista.findViewById(R.id.txtUser);
        cajaPwd=(EditText) vista.findViewById(R.id.txtPwd);
        btnConsultar = (Button) vista.findViewById(R.id.btnSesion);
        btnRegistrar = (Button) vista.findViewById(R.id.btn_registrar);
        rq= Volley.newRequestQueue(getContext());
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarSesion();
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrar();
            }
        });
        return vista;
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        Toast.makeText(getContext(),"No ha encontrado el usuario"+
                error.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResponse(JSONObject response) {
        User usuario= new User();
        Toast.makeText(getContext(),"Acceso concedido",Toast.LENGTH_SHORT).show();


        JSONArray jsonArray = response.optJSONArray("datos");
        JSONObject jsonObject = null;
        try {
            jsonObject = jsonArray.getJSONObject(0);
            usuario.setUser(jsonObject.optString("user"));
            usuario.setPwd(jsonObject.optString("pwd"));
            usuario.setId(jsonObject.optInt("id"));
            usuario.setEstado(jsonObject.optInt("esta"));


        } catch (JSONException e) {
            e.printStackTrace();
        }

        Intent intencion = new Intent(getContext(), PanelActivity.class);
        startActivity(intencion);


    }
    void registrar() {

        RegistrarFragment fr=new RegistrarFragment();
        //fr.setArguments(bn);
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.escenario,fr)
                .addToBackStack(null)
                .commit();
    }
    private void iniciarSesion(){
        String url="http://beaconsobetay.000webhostapp.com/session.php?user="+cajaUser.getText().toString()+
                "&pwd="+cajaPwd.getText().toString();
        jrq= new JsonObjectRequest(Request.Method.GET, url,null,this,this);
        rq.add(jrq);
    }

}

