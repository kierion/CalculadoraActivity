package calculadoraactivity.cursaoandroid.com.calculadoraactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botao1;
    private Button botao2;
    private Button botao3;
    private Button botao4;
    private Button botao5;
    private Button botao6;
    private Button botao7;
    private Button botao8;
    private Button botao9;
    private Button botao0;
    private Button botaoSoma;
    private Button botaoSubtracao;
    private Button botaoDivisao;
    private Button botaoMultiplicacao;
    private Button botaoResultado;
    private Button botaoPonto;
    private Switch trocaTela;
    String numero;
    String tipoOperacao;
    String soma;
    String subtracao;
    String divisao;
    String multiplicacao;
    TextView texto;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao0 = (Button) findViewById(R.id.button0);
        botao1 = (Button) findViewById(R.id.button1);
        botao2 = (Button) findViewById(R.id.button2);
        botao3 = (Button) findViewById(R.id.button3);
        botao4 = (Button) findViewById(R.id.button4);
        botao5 = (Button) findViewById(R.id.button5);
        botao6 = (Button) findViewById(R.id.button6);
        botao7 = (Button) findViewById(R.id.button7);
        botao8 = (Button) findViewById(R.id.button8);
        botao9 = (Button) findViewById(R.id.button9);
        botaoSoma = (Button) findViewById(R.id.buttonSoma);
        botaoSubtracao = (Button) findViewById(R.id.buttonSubtracao);
        botaoMultiplicacao = (Button) findViewById(R.id.buttonMultiplicacao);
        botaoDivisao = (Button) findViewById(R.id.buttonDivisao);
        botaoResultado = (Button) findViewById(R.id.buttonResultado);
        botaoPonto = (Button) findViewById(R.id.buttonPonto);
        trocaTela = (Switch) findViewById(R.id.switch1);
        texto = ((TextView) findViewById(R.id.textView1));


        trocaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        botao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao0.toString();
                texto.setText((texto.getText() + numero));
            }
        });
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao1.toString();
                texto.setText((texto.getText() + numero));

            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao2.toString();
                texto.setText((texto.getText() + numero));

            }
        });
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao3.toString();
                texto.setText((texto.getText() + numero));

            }
        });
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao4.toString();
                texto.setText((texto.getText() + numero));

            }
        });
        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao5.toString();
                texto.setText((texto.getText() + numero));

            }
        });
        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao6.toString();
                texto.setText((texto.getText() + numero));

            }
        });
        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao7.toString();
                texto.setText((texto.getText() + numero));

            }
        });
        botao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao8.toString();
                texto.setText((texto.getText() + numero));
            }
        });
        botao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = botao9.toString();
                texto.setText((texto.getText() + numero));

            }
        });
        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soma = texto.getText().toString();
                texto.setText("");
                tipoOperacao = "soma";
            }
        });
        botaoSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtracao = texto.getText().toString();
                texto.setText("");
                tipoOperacao = "subtração";

            }
        });
        botaoDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divisao = texto.getText().toString();
                texto.setText("");
                tipoOperacao = "divisão";

            }
        });
        botaoMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplicacao = texto.getText().toString();
                texto.setText("");
                tipoOperacao = "multiplicação";

            }
        });
        botaoPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        botaoResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  //  startActivity(new Intent(MainActivity.this, Main2Activity.class));
                TextView texto = ((TextView) findViewById(R.id.textView1));
                //if (trocaTela.isActivated()) {
                    //startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    if (tipoOperacao.equals("soma")) {
                        texto.setText((texto.getText() + soma));
                    }

                }
       // }
        });


    }
}
