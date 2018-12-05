    package jehealneil.sih.com.sihjehealneilpracticalexam2;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        EditText firstnameInput,lastnameInput,exam1input,exam2input,resultOutput;
        Button buttonResult;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            firstnameInput=(EditText)findViewById(R.id.firstnameInput);
            lastnameInput=(EditText)findViewById(R.id.lastnameInput);
            exam1input=(EditText)findViewById(R.id.exam1Input);
            exam2input=(EditText)findViewById(R.id.exam2Input);
            resultOutput=(EditText)findViewById(R.id.result);
            buttonResult=(Button)findViewById(R.id.buttonResult);
            buttonResult.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    String first;
                    String second;
                    int third;
                    int fourth;
                    int result;
                    first=String.valueOf(firstnameInput.getText().toString());
                    second=String.valueOf(lastnameInput.getText().toString());
                    third=Integer.valueOf(exam1input.getText().toString());
                    fourth=Integer.valueOf(exam2input.getText().toString());
                    result=(third + fourth)/2;
                    resultOutput.setText(String.valueOf(result));
                }

            });

        }
    }




