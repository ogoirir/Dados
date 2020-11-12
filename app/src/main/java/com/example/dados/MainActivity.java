package com.example.dados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//prueba numero 1
public class MainActivity extends AppCompatActivity {
    //Creo las variables que guardan el valor del ultimo dado que se genera, el numero de dados y el bonificador
    public int ultDado, bonDados;
    public int numDados=1;
    public int x;
    //Creo la variable donde se sumaran los dados
    public int sumaDados = 0;
    private ListView listView;
    //Creo un arraylist para poder guardar un listado de los dados
    public ArrayList     arrayDados=new ArrayList();
    Iterator it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bonDados = 0;
    }

    //Creo los metodos que establecen el funcionamiento de los  dados
    //Explicare el funcionamiento en el d4 ya que funcionan todos igual
    public void d4(View vista1) {

        //Hago un for para que me genere tantos numero aleatorios como numero de dados haya
        for (int i = 0; i < numDados; i++) {
            //Genero un numero aleatorio usando la clase Math.random
            ultDado = (int) (Math.random() * 4 + 1);
            //Añado el valor del dado al arraylist
            arrayDados.add(ultDado);
            //Sumo la cantidad de numeros aleatorios que genere
            sumaDados = ultDado+ sumaDados;
        }
        //A la cantidad de numeros aleatorios le sumo el bonificador
        sumaDados = sumaDados + bonDados;
        //Añado los valores del arraylist al iterator para poder recorrerlo mas adelante
        it=arrayDados.iterator();
        visualizarDado();
        visualizarArray();
        //Restablezco el valor de la suma de los dados a 0 para que esta no se incremente en el siguiente dado
        sumaDados = 0;
    }

    //Visualizo el contenido del arraylist para tener un registro de los dados tirados
    public void visualizarArray(){
        listView = (ListView) findViewById(R.id.textArrayDados);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayDados);
        listView.setAdapter(adapter);
    }
 

    public void d6(View vista1) {
        //Hago un for para que me genere tantos numero aleatorios como numero de dados haya
        for (int i = 0; i < numDados; i++) {
            //Genero un numero aleatorio usando la clase Math.random
            ultDado = (int) (Math.random() * 6 + 1);
            arrayDados.add(ultDado);
            //Sumo la cantidad de numeros aleatorios que genere
            sumaDados = ultDado+ sumaDados;
        }
        //A la cantidad de numeros aleatorios le sumo el bonificador
        sumaDados = sumaDados + bonDados;
        it=arrayDados.iterator();
        visualizarDado();
        visualizarArray();
        sumaDados = 0;
    }

    public void d8(View vista1) {
        //Hago un for para que me genere tantos numero aleatorios como numero de dados haya
        for (int i = 0; i < numDados; i++) {
            //Genero un numero aleatorio usando la clase Math.random
            ultDado = (int) (Math.random() * 8 + 1);
            arrayDados.add(ultDado);
            //Sumo la cantidad de numeros aleatorios que genere
            sumaDados = ultDado+ sumaDados;
        }
        //A la cantidad de numeros aleatorios le sumo el bonificador
        sumaDados = sumaDados + bonDados;
        it=arrayDados.iterator();
        visualizarDado();
        visualizarArray();
        sumaDados = 0;
    }

    public void d10(View vista1) {
        //Hago un for para que me genere tantos numero aleatorios como numero de dados haya
        for (int i = 0; i < numDados; i++) {
            //Genero un numero aleatorio usando la clase Math.random
            ultDado = (int) (Math.random() * 10 + 1);
            arrayDados.add(ultDado);
            //Sumo la cantidad de numeros aleatorios que genere
            sumaDados = ultDado+ sumaDados;
        }
        //A la cantidad de numeros aleatorios le sumo el bonificador
        sumaDados = sumaDados + bonDados;
        it=arrayDados.iterator();
        visualizarDado();
        visualizarArray();
        sumaDados = 0;
    }

    public void d12(View vista1) {
        //Hago un for para que me genere tantos numero aleatorios como numero de dados haya
        for (int i = 0; i < numDados; i++) {
            //Genero un numero aleatorio usando la clase Math.random
            ultDado = (int) (Math.random() * 12 + 1);
            arrayDados.add(ultDado);
            //Sumo la cantidad de numeros aleatorios que genere
            sumaDados = ultDado+ sumaDados;
        }
        //A la cantidad de numeros aleatorios le sumo el bonificador
        sumaDados = sumaDados + bonDados;
        it=arrayDados.iterator();
        visualizarDado();
        visualizarArray();
        sumaDados = 0;
    }

    public void d20(View vista1) {
        //Hago un for para que me genere tantos numero aleatorios como numero de dados haya
        for (int i = 0; i < numDados; i++) {
            //Genero un numero aleatorio usando la clase Math.random
            ultDado = (int) (Math.random() * 20 + 1);
            arrayDados.add(ultDado);
            //Sumo la cantidad de numeros aleatorios que genere
            sumaDados = ultDado+ sumaDados;
        }
        //A la cantidad de numeros aleatorios le sumo el bonificador
        sumaDados = sumaDados + bonDados;
        it=arrayDados.iterator();
        visualizarDado();
        visualizarArray();
        sumaDados = 0;
    }

    public void d100(View vista1) {
        //Hago un for para que me genere tantos numero aleatorios como numero de dados haya
        for (int i = 0; i < numDados; i++) {
            //Genero un numero aleatorio usando la clase Math.random
            ultDado = (int) (Math.random() * 100 + 1);
            arrayDados.add(ultDado);
            //Sumo la cantidad de numeros aleatorios que genere
            sumaDados = ultDado+ sumaDados;
        }
        //A la cantidad de numeros aleatorios le sumo el bonificador
        sumaDados = sumaDados + bonDados;
        it=arrayDados.iterator();
        visualizarDado();
        visualizarArray();
        sumaDados = 0;
    }

    //Visualizo el resultado de los dados
    public void visualizarDado() {
        TextView valorContador = (TextView) findViewById(R.id.textView);
        valorContador.setText("" + sumaDados);
    }

    //Indico la cantidad de dados que quiero sacar
    //Hago que uno de los botones reste el numero de dados que genero
    public void numDadosMin(View vista1) {
        if (numDados>1) {
            numDados--;
        }
        visualizarNumDados();
    }

    //Hago que el otro boton sume el numero de dados que genero
    public void numDadosMas(View vista1) {
        numDados++;
        visualizarNumDados();
    }

    //Visualizo el numero de dados que he generado
    public void visualizarNumDados() {
        TextView valorContador = (TextView) findViewById(R.id.numDados);
        valorContador.setText(numDados + "D");
    }

    //Indico el valor del bonificador
    //Hago que uno de los botones sume el valor del bonificador
    public void bonMas(View vista1) {
        bonDados++;
        visualizarBonificador();
    }

    //Hago que el otro boton reste la cantidad del bonificador
    public void bonMen(View vista1) {
        bonDados--;
        visualizarBonificador();
    }

    //Visualizo el valor del bonificador
    public void visualizarBonificador() {
        TextView valorContador = (TextView) findViewById(R.id.bonDados);
        valorContador.setText("+" + bonDados);
    }
}
