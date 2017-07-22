package com.youcafiqbal.calculator;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private  String currentOperation="";
    private float first=0;
    private float result =0;
    private float trig=0;private float last =0;
    private boolean again = false;
    private String basicoperation = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void button0(View V){
        if(again==false){
        TextView display = new TextView(this);
        display = (TextView) findViewById(R.id.textView);
        String current  = (String) display.getText();
        if(current.equals("0")){
            current="";
        }
        display.setText(current.concat("0"));
        }
        else if (again==true){
            // do not concate after result computed
        }
    }
    public  void button1(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("1"));
        }
        else if (again==true){
            // do not concate after result computed
        }
    }

    public  void button2(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("2"));
        }
        else if (again==true){
            // do not concate after result computed
        }
    }
    public  void button3(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("3"));
        }
        else if (again==true){
            // do not concate after result computed
        }
    }
    public  void button4(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("4"));
        }
        else if (again==true){
            // do not concate after result computed
        }

    }
    public  void button5(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("5"));
        }
        else if (again==true){
            // do not concate after result computed
        }

    }
    public  void button6(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("6"));
        }
        else if (again==true){
            // do not concate after result computed
        }
    }
    public  void button7(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("7"));
        }
        else if (again==true){
            // do not concate after result computed
        }
    }
    public  void button8(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("8"));
        }
        else if (again==true){
            // do not concate after result computed
        }
    }
    public  void button9(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();
            if(current.equals("0")){
                current="";
            }
            display.setText(current.concat("9"));
        }
        else if (again==true){
            // do not concate after result computed
        }
    }
    public  void buttonsin(View V){
        //Button btnsin = (Button)findViewById(R.id.buttonsin);
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();

            display.setText("Sin(");
        }
        else if (again==true){
            // do not concate after result computed
        }
        currentOperation="sin";
        //again=false;
    }
    public  void buttoncos(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();

            display.setText("Cos(");
        }
        else if (again==true){
            // do not concate after result computed
        }
        currentOperation="cos";
        //again=false;
    }
    public  void buttontan(View V){
        if(again==false){
            TextView display = new TextView(this);
            display = (TextView) findViewById(R.id.textView);
            String current  = (String) display.getText();

            display.setText("Tan(");
        }
        else if (again==true){
            // do not concate after result computed
        }
        currentOperation="tan";
        //again=false;
    }

    public  void buttonadd(View V){
        TextView display = new TextView(this);
        display = (TextView) findViewById(R.id.textView);
        first= Float.parseFloat(display.getText().toString());
        display.setText("");
        currentOperation="addition";
        basicoperation="add";
        again=false;
    }
    public  void buttonsub(View V){
        TextView display = new TextView(this);
        display = (TextView) findViewById(R.id.textView);
        first= Float.parseFloat(display.getText().toString());
        display.setText("");
        currentOperation="subtraction";
        basicoperation="sub";
        again=false;
    }
    public  void buttonmul(View V){
        TextView display = new TextView(this);
        display = (TextView) findViewById(R.id.textView);
        first= Float.parseFloat(display.getText().toString());
        display.setText("");
        currentOperation="multiplication";
        basicoperation="mul";
        again=false;
    }

    public  void buttondiv(View V){
        TextView display = new TextView(this);
        display = (TextView) findViewById(R.id.textView);
        first= Float.parseFloat(display.getText().toString());
        display.setText("");
        currentOperation="division";
        basicoperation="div";
        again=false;
    }
    public  void buttondot(View V){
        Button btndot = (Button)findViewById(R.id.buttondot);
    }
    public  void buttoneq(View V){

        TextView display = new TextView(this);
        display = (TextView) findViewById(R.id.textView);
        if(currentOperation=="addition") {
            last= Float.parseFloat(display.getText().toString());
            result = first + last;
            display.setText("" + result);
           // basicoperation=true;
            //currentOperation="";
        }
        if(currentOperation=="subtraction"){
            last= Float.parseFloat(display.getText().toString());
            result = first - last;
            display.setText("" + result);
            //basicoperation=true;
            //currentOperation="";
        }
        if(currentOperation=="multiplication"){
            last= Float.parseFloat(display.getText().toString());
            result = first * last;
            display.setText("" + result);
           // basicoperation=true;
           // currentOperation="";
        }
        if(currentOperation=="division"){
            last= Float.parseFloat(display.getText().toString());
            result = first / last;
            display.setText("" + result);
           // basicoperation=true;
           // currentOperation="";
        }

        if(currentOperation=="sin"){
            if(basicoperation=="add"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.sin(Math.toRadians(trig));
                result = first + res;
                display.setText("" + result);


            }
            else if(basicoperation=="sub"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.sin(Math.toRadians(trig));
                result = first - res;
                display.setText("" + result);

            }
            else if(basicoperation=="mul"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.sin(Math.toRadians(trig));
                result = first * res;
                display.setText("" + result);

            }
            else if(basicoperation=="div"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.sin(Math.toRadians(trig));
                result = first / res;
                display.setText("" + result);

            }
            else if (basicoperation==""){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.sin(Math.toRadians(trig));
                display.setText(""+res);
                // currentOperation="";
            }
            basicoperation="";
        }

        if(currentOperation=="cos"){
            if(basicoperation=="add"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.cos(Math.toRadians(trig));
                result = first + res;
                display.setText("" + result);

            }
            else if(basicoperation=="sub"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.cos(Math.toRadians(trig));
                result = first - res;
                display.setText("" + result);

            }
            else if(basicoperation=="mul"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.cos(Math.toRadians(trig));
                result = first * res;
                display.setText("" + result);

            }
            else if(basicoperation=="div"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.cos(Math.toRadians(trig));
                result = first / res;
                display.setText("" + result);

            }
            else if (basicoperation==""){
            String value = display.getText().toString();
            String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
            trig = Float.parseFloat(numericValue);
            float res= (float) Math.cos(Math.toRadians(trig));
            display.setText(""+res);
           // currentOperation="";
            }
            basicoperation="";
        }

        if(currentOperation=="tan"){
            if(basicoperation=="add"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.tan(Math.toRadians(trig));
                result = first + res;
                display.setText("" + result);

            }
            else if(basicoperation=="sub"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.tan(Math.toRadians(trig));
                result = first - res;
                display.setText("" + result);

            }
            else if(basicoperation=="mul"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.tan(Math.toRadians(trig));
                result = first * res;
                display.setText("" + result);

            }
            else if(basicoperation=="div"){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.tan(Math.toRadians(trig));
                result = first / res;
                display.setText("" + result);

            }
            else if (basicoperation==""){
                String value = display.getText().toString();
                String numericValue = value.replaceAll("[^0-9]", ""); // return numberic part of Sin(----)
                trig = Float.parseFloat(numericValue);
                float res= (float) Math.tan(Math.toRadians(trig));
                display.setText(""+res);
                // currentOperation="";
            }
            basicoperation="";
        }
        again=true;  // prevent from entering value after computing result with =
    }

    public  void buttonc(View V){
        TextView display = new TextView(this);
        display = (TextView) findViewById(R.id.textView);
        display.setText("0");
        again=false; // prevent from writting to computed result
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}