package com.example.nasri.examine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Timestamp;


public class PatientDetails extends AppCompatActivity {

    // variables are listed here
    private TextView textViewDisplaySystem;
    private TextView textViewExaminationComponent;
    private TextView textViewDetailedInstructions;
    private EditText editTextGetTextAnswer;
    private Button btn_answer1;
    private Button btn_answer2;
    private Button btn_answer3;
    private Button btn_answer4;
    private String summery;
    private String nameOfSystem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_details);

        btn_answer1 = findViewById(R.id.btn_answer1);
        btn_answer2 = findViewById(R.id.btn_answer2);
        btn_answer2.setVisibility(View.GONE);
        btn_answer3 = findViewById(R.id.btn_answer3);
        btn_answer3.setVisibility(View.GONE);
        btn_answer4 = findViewById(R.id.btn_answer4);
        btn_answer4.setVisibility(View.GONE);


        textViewDisplaySystem = findViewById(R.id.textViewDisplaySystem);
        nameOfSystem = getIntent().getStringExtra("SYSTEM");
        textViewDisplaySystem.setText("You are examining " + nameOfSystem);

        textViewExaminationComponent = findViewById(R.id.textViewExaminationComponent);
        textViewExaminationComponent.setText("Name of the patient");

        textViewDetailedInstructions = findViewById(R.id.textViewDetailedInstructions);
        textViewDetailedInstructions.setText("Name of the patient is important to correctly identify. Name is used when presenting the examination findings. When examining a child, talk to the child using the name to build rapport.");

        editTextGetTextAnswer = findViewById(R.id.editTextGetTextAnswer);
        editTextGetTextAnswer.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        editTextGetTextAnswer.setHint("Patient's name");


        btn_answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nameOfSystem.equals("the cardiovascular system")) {
//Start prompt sequence for cvs examination
                    //Below is the sequence of prompts for the examination of CVS

                    if (textViewExaminationComponent.getText().toString().equals("Name of the patient")) {

                        //first component of CVS examination
                        //Get the name, write to summery and set screen for age
                        summery = "Name: " + editTextGetTextAnswer.getText().toString() + "\n";
                        textViewExaminationComponent.setText("Age");
                        textViewDetailedInstructions.setText("Age is an important consideration when prioritizing the list of differntial diagnosis.");
                        editTextGetTextAnswer.setText("");
                        editTextGetTextAnswer.setHint("Age");


                    } else if (textViewExaminationComponent.getText().toString().equals("Age")) {

                        //get the age, append to summery and set screen for complains
                        summery = summery.concat("Age: " + editTextGetTextAnswer.getText().toString() + "\n");
                        textViewExaminationComponent.setText("Complains");
                        textViewDetailedInstructions.setText("Ask about the complains of the patient. Complains determine which componets to examinse, and compains of pain will be impoetant to keep in mind to exakine the painful parts at last");
                        editTextGetTextAnswer.setText("");
                        editTextGetTextAnswer.setHint("Complains");
                        editTextGetTextAnswer.setInputType(InputType.TYPE_TEXT_FLAG_IME_MULTI_LINE);

                    } else if (textViewExaminationComponent.getText().toString().equals("Complains")) {

                        //get the complains, append to summery and set screen for sex
                        summery = summery.concat("Complains: " + editTextGetTextAnswer.getText().toString() + "\n");
                        textViewExaminationComponent.setText("Sex");
                        textViewDetailedInstructions.setText("What is the sex of the patient? Sex is a risk facor for diseases like MI and atherrosclerosis");


                        //display the male and female buttons
                        editTextGetTextAnswer.setVisibility(View.GONE);
                        btn_answer1.setText("Male");
                        btn_answer2.setText("Female");
                        btn_answer2.setVisibility(View.VISIBLE);


                        //append sex: female
                        btn_answer2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                summery = summery.concat("Sex: Female\n");

                                //set screen for general appearence
                                textViewExaminationComponent.setText("General appearance");
                                textViewDetailedInstructions.setText("Describe the appearance as well-looking, ill-looking, obese, wasted, bloated ");
                                editTextGetTextAnswer.setText("");
                                editTextGetTextAnswer.setHint("Appearance");
                                editTextGetTextAnswer.setVisibility(View.VISIBLE);
                                btn_answer1.setText("Continue");
                                btn_answer2.setVisibility(View.GONE);
                            }
                        });
                        {

                        }
                    } else if (textViewExaminationComponent.getText().toString().equals("Sex")) {

                        //append sex: male to summery
                        summery = summery.concat("Sex: Male\n");

                        //set screen for general appearence
                        textViewExaminationComponent.setText("General appearance");
                        textViewDetailedInstructions.setText("Describe the appearance as well-looking, ill-looking, obese, wasted, bloated ");
                        editTextGetTextAnswer.setText("");
                        editTextGetTextAnswer.setHint("Appearance");
                        editTextGetTextAnswer.setVisibility(View.VISIBLE);
                        btn_answer1.setText("Continue");
                        btn_answer2.setVisibility(View.GONE);


                    } else if (textViewExaminationComponent.getText().toString().equals("General appearance")) {

                        //append Appearance to summery
                        summery = summery.concat("Appearance: " + editTextGetTextAnswer.getText().toString() + "\n");

                        //set screen for dysmorphic features
                        textViewExaminationComponent.setText("Dysmorphic features");
                        textViewDetailedInstructions.setText("Look for dysmorphic features such as Marfans syndrome. They are associaated with aortic dissedtion");
                        editTextGetTextAnswer.setText("");
                        editTextGetTextAnswer.setHint("Dysmorphic features");

                    } else if (textViewExaminationComponent.getText().toString().equals("Dysmorphic features")) {

                        //append dismorphic features to summery
                        summery = summery.concat("Dysmorphic features: " + editTextGetTextAnswer.getText().toString() + "\n");

                        //set screen for dyspnea
                        textViewExaminationComponent.setText("Dyspnea");
                        textViewDetailedInstructions.setText("Look if the patient is breating rapidly. Look for coastal recessions to see the severity of dyspnea");
                        editTextGetTextAnswer.setVisibility(View.GONE);
                        btn_answer1.setText("Dyspnoic");
                        btn_answer2.setText("Not dyspnoic");
                        btn_answer2.setVisibility(View.VISIBLE);


                    } else if (textViewExaminationComponent.getText().toString().equals("Dyspnea")) {


                        summery = summery.concat("Dyspnea: " + editTextGetTextAnswer.getText().toString() + "\n");
                        textViewExaminationComponent.setText("End");
                        //end is used here to prematurely terminate the loop and show the summery

                    } else if (textViewExaminationComponent.getText().toString().equals("End")) {
                        //display the summery
                        //make a toast to say examination is incomplete
                        Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                        //change the layout and display the summery
                        textViewExaminationComponent.setText("Summery");
                        String endTime = new Timestamp(System.currentTimeMillis()).toString();
                        textViewDetailedInstructions.setText("Summery of examination findings as at " + endTime + "\n" + summery + "\nThis examination was performed with the aid of the Examine Android app.");
                        editTextGetTextAnswer.setVisibility(View.GONE);
                        btn_answer1.setText("Share");
                        btn_answer1.setVisibility(View.VISIBLE);
                        btn_answer2.setVisibility(View.GONE);
                        btn_answer3.setVisibility(View.GONE);
                        btn_answer4.setVisibility(View.GONE);


                    } else if (textViewExaminationComponent.getText().toString().equals("Summery")) {

                        //Share the summery in plain text. Keep this at the very end to make it easy to read.
                        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        sharingIntent.putExtra(Intent.EXTRA_TEXT, textViewDetailedInstructions.getText().toString());
                        startActivity(Intent.createChooser(sharingIntent, textViewDetailedInstructions.getText().toString()));


                    }


                } else if (nameOfSystem.equals("the respiratory system")) {
//Start prompt sequence for respi

                    //informative tost
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();


                } else if (nameOfSystem.equals("the abdomen")) {
//start prompt sequence for abdomen

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();


                } else if (nameOfSystem.equals("the cranial nerves")) {
//start prompt sequence for cranial nerves

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("the peripheral nervous system")) {
//start prompt sequence for peripheral nerves

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("the upper limbs")) {
//start prompt sequence for upper limb

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();


                } else if (nameOfSystem.equals("the lower limbs")) {
//start prompt sequence for lower limb

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("the neonatal examination")) {
//start prompt sequence for neonatal

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("a pregnant mother")) {
//start prompt sequence pregnant mother

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("per vaginal examination")) {
//start prompt sequence PV exam

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("per rectal examination")) {
//start prompt sequence for PR exam

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("a neck lump")) {
//start prompt sequence for lump

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("a lump at hernial orifice")) {
//start prompt sequence hernia

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("the breast")) {
//start prompt sequence breast

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("a lump")) {
//start prompt sequence lump

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else if (nameOfSystem.equals("the knee joints")) {
//start prompt sequence knee

                    //informative toast
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(PatientDetails.this, "Examination sequence for this component is not yet completed", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}
