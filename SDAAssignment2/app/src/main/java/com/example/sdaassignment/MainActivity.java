package com.example.sdaassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> Questions=new ArrayList<String>();
    ArrayList<String> Answers=new ArrayList<String>();
    private RadioGroup Choices;
    private RadioButton ans;
    private Button next;
    TextView Qv;
    int i=0;
    ArrayList<Integer> answers=new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Questions.add("1. Germany won the world war 2");
        Questions.add("2. Germany initiates the world war 2");
        Questions.add("3. douglas McArther was American five-star general");
        Questions.add("4. Hitler was muslim");
        Questions.add("5. World war 2 was started on 1939");
        Questions.add("6. World war 2 was ended on 1945");
        Questions.add("7. Two military opposing alliance in world war 2 were Allied and Axis");
        Questions.add("8. Joseph stalin was Soviet Leader");
        Questions.add("9. Hirohito was Punjabi Leader");
        Questions.add("10. Japan and Germany were friends");

        Answers.add("False");
        Answers.add("True");
        Answers.add("True");
        Answers.add("False");
        Answers.add("True");
        Answers.add("True");
        Answers.add("True");
        Answers.add("True");
        Answers.add("False");
        Answers.add("True");
        next=findViewById(R.id.button);
        Choices = (RadioGroup) findViewById(R.id.Options);
        Qv=findViewById(R.id.QuestionView);
        Qv.setText(Questions.get(i));
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = Choices.getCheckedRadioButtonId();
                ans= (RadioButton) findViewById(selectedId);
                String anss=ans.getText().toString();
                String CompareAnswer=Answers.get(i);
                if(anss.equalsIgnoreCase(CompareAnswer)){
                    answers.add(1);
                }
                i++;

                if(i<Questions.size()){
                    Qv.setText(Questions.get(i));
                    ans.setChecked(false);
                }else {
                    Toast.makeText(getApplicationContext(),
                            answers.size()+" Are Correct out of 10", Toast.LENGTH_SHORT).show();
                }




            }
        });
    }


}
