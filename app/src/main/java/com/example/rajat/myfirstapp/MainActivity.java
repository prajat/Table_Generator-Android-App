package com.example.rajat.myfirstapp;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    public void press(View view)
    {

        Button mbutton;
        EditText medit = (EditText)findViewById(R.id.editText);

        //Log.v("EditText", medit.getText().toString());
        String content = medit.getText().toString();
        EditText t1=(EditText)findViewById(R.id.editText2);
        t1.setText("");
        for(int i=1; i<=20; i++){
            int a = Integer.parseInt(content)*(i);

            String str = Integer.toString(a);

            t1.append(content +" X "+ i + " = "+ str+"\n");

        }

//        TextView t2=new TextView(this);
//        t2.setText("Your number is="+medit.getText());
//        setContentView(t2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}
