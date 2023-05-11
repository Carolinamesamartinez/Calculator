package com.multimedia.pruebainterfazcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button_decimal,button_porcentaje,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_0,button_sumar,button_borrar,button_igual,button_restar,button_multiplicar,button_dividir;
    private TextView textView_vista,textView_resultado;
    private EditText editText_cuenta;
    public  String cadenanum="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * llamada a todas las variables para que las encuentre
         */
        button_porcentaje=(Button) findViewById(R.id.button_porcentaje);
        button_1=(Button) findViewById(R.id.button_1);
        button_2=(Button) findViewById(R.id.button_2);
        button_3=(Button) findViewById(R.id.button_3);
        button_4=(Button) findViewById(R.id.button_4);
        button_5=(Button) findViewById(R.id.button_5);
        button_6=(Button) findViewById(R.id.button_6);
        button_7=(Button) findViewById(R.id.button_7);
        button_8=(Button) findViewById(R.id.button_8);
        button_9=(Button) findViewById(R.id.button_9);
        button_0=(Button) findViewById(R.id.button_0);
        button_decimal=(Button) findViewById(R.id.button_decimal);

        button_igual=(Button) findViewById(R.id.button_igual);
        button_multiplicar=(Button) findViewById(R.id.button_multiplicar);
        button_borrar=(Button)findViewById(R.id.button_borrar);
        button_dividir=(Button) findViewById(R.id.button_dividir);

        button_sumar=(Button) findViewById(R.id.button_sumar);
        button_borrar=(Button) findViewById(R.id.button_borrar);
        button_restar=(Button) findViewById(R.id.button_restar);

        textView_vista=(TextView) findViewById(R.id.textView_vista);
        textView_resultado=(TextView) findViewById(R.id.textView_resultado);

        editText_cuenta=(EditText) findViewById(R.id.editText_cuenta);
        /**
         * inicializar el textview a 0 para casos negativos(de primer número)
         */
        textView_vista.setText("0");


        /**
         * listener del botón porcentaje , envía a la cadena un porcentaje
         */
        button_porcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("%");
                // cadenanumerica(1,1);
            }
        });
        /**
         * listener del botón borrar que inicializa todas las variables indicadas a su estado incial
         */
        button_borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_cuenta.setText("");
                textView_vista.setText("0");
                textView_resultado.setText("");
                cadenanum="0";

            }
        });
        /**
         * listener del botón 1 , envía a la cadena un 1
         */
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("1");
                // cadenanumerica(1,1);
            }
        });
        /**
         * listener del botón 2 , envía a la cadena un 2
         */
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("2");
                //cadenanumerica(2,2);

            }
        });

        /**
         * listener del botón decimal , envía a la cadena un .
         */
        button_decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena(".");
                // cadenanumerica(Integer.parseInt("."),Integer.parseInt("."));

            }
        });


        /**
         * listener del botón 3 , envía a la cadena un 3
         */
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("3");
                //cadenanumerica(3,3);

            }
        });
        /**
         * listener del botón 4 , envía a la cadena un 4
         */
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("4");
                // cadenanumerica(4,4);

            }
        });
        /**
         * listener del botón 5 , envía a la cadena un 5
         */
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("5");

                //cadenanumerica(5,5);
            }
        });
        /**
         * listener del botón 6 , envía a la cadena un 6
         */
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("6");

                // cadenanumerica(6,6);
            }
        });
        /**
         * listener del botón 7 , envía a la cadena un 7
         */
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("7");
                // cadenanumerica(7,7);

            }
        });
        /**
         * listener del botón 8 , envía a la cadena un 8
         */
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("8");

                // cadenanumerica(8,8);

            }
        });
        /**
         * listener del botón 9 , envía a la cadena un 9
         */
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("9");
                //cadenanumerica(9,9);
            }
        });
        /**
         * listener del botón 0 , envía a la cadena un 0
         */
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("0");
                //cadenanumerica(0,0);

            }
        });




        /**
         * listener del botón = , envía a la cadena un =
         * y llama al método realizaroperacion();
         */
        button_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("=");
                realizaroperacion();
            }
        });

        /**
         * listener del botón + , envía a la cadena un +
         */
        button_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("+");
            }
        });
        /**
         * listener del botón - , envía a la cadena un -
         */
        button_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("-");

            }
        });
        /**
         * listener del botón / , envía a la cadena un /
         */
        button_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("/");

            }
        });
        /**
         * listener del botón * , envía a la cadena un *
         */
        button_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroscadena("*");

            }
        });



    }


    /**
     * método que imprime toda la cadena y la guarda en un string
     * @param boton
     */
    public void numeroscadena(String boton){

        cadenanum=cadenanum.concat(boton);

        textView_vista.setText(cadenanum);
        editText_cuenta.setText(boton);







    }

    /**
     * método que realiza la cadena de operaciones
     * Divide la cadena en operadores y números
     * y comprueba cada caso de los operadores para realizar cada operacion con el array de números
     * controlando las combinaciones incorrectas
     */
    public  void realizaroperacion() {
        String operacion=textView_vista.getText().toString();

        String cadopernum = "\\s*[0-9.]+";
        String[] signos = operacion.split(cadopernum);//ME GUARDA LOS +,-ETC ya que me separa por la expresion anterior
        String cadopersignos = "\\s*[-+/\\*%=]+";
        String [] numeros = operacion.split(cadopersignos);
        if(numeros.length<=1 ||numeros[0].isEmpty()||operacion.contains("+-")|| operacion.contains("+%")||operacion.contains("+*")|| operacion.contains("+/")||operacion.contains("++")|| operacion.contains("--") || operacion.contains("-%")||operacion.contains("-+")||operacion.contains("-*")|| operacion.contains("-/")||operacion.contains("*-")|| operacion.contains("-%") ||operacion.contains("*+") || operacion.contains("**")||operacion.contains("*%")||operacion.contains("*/")|| operacion.contains("//")||operacion.contains("/+")|| operacion.contains("/*") || operacion.contains("/-")||operacion.contains("/%")||operacion.contains("..")||operacion.contains(".%")||operacion.contains(".+")|| operacion.contains(".-") || operacion.contains(".*")||operacion.contains("*.")||operacion.contains("-.")|| operacion.contains("/.") ||operacion.contains("./")|| operacion.contains("+.")||operacion.contains("%+")|| operacion.contains("%-") ||operacion.contains("%*")|| operacion.contains("%/")||operacion.contains("%.")||operacion.contains("%%")){
            textView_resultado.setText("se necesitan más operadores");

        }else {

            Float resultado = Float.parseFloat((numeros[0]));
            for (int i = 0; i < signos.length; i++) {
                switch (signos[i]) {
                    case "+":
                        resultado += Float.parseFloat(numeros[i]);
                        break;
                    case "-":
                        resultado -= Float.parseFloat(numeros[i]);
                        break;
                    case "/":
                        resultado /= Float.parseFloat(numeros[i]);
                        break;
                    case "*":
                        resultado *= Float.parseFloat(numeros[i]);
                        break;
                    case "%":
                        resultado %= Float.parseFloat(numeros[i]);
                        break;

                    default:
                        break;
                }

            }


            if(resultado.isInfinite()|| resultado.isNaN()){
                textView_resultado.setText("el resultado es infinito/no apto ");

            }else{
                    textView_resultado.setText(String.valueOf(resultado).concat("   reinicie cadena"));
            }

        }




    }


}