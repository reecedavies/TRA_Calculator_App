package com.example.tra_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adapter
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.skills));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Spinner 1
        Spinner spinnerOne = findViewById(R.id.spinnerOne);
        spinnerOne.setAdapter(myAdapter);
        spinnerOne.setOnItemSelectedListener(this);

        // Spinner 2
        Spinner spinnerTwo = findViewById(R.id.spinnerTwo);
        spinnerTwo.setAdapter(myAdapter);
        spinnerTwo.setOnItemSelectedListener(this);

        // Spinner 3
        Spinner spinnerThree = findViewById(R.id.spinnerThree);
        spinnerThree.setAdapter(myAdapter);
        spinnerThree.setOnItemSelectedListener(this);

        // Spinner 4
        Spinner spinnerFour = findViewById(R.id.spinnerFour);
        spinnerFour.setAdapter(myAdapter);
        spinnerFour.setOnItemSelectedListener(this);

        // Spinner 5
        Spinner spinnerFive = findViewById(R.id.spinnerFive);
        spinnerFive.setAdapter(myAdapter);
        spinnerFive.setOnItemSelectedListener(this);

        // Spinner 6
        Spinner spinnerSix = findViewById(R.id.spinnerSix);
        spinnerSix.setAdapter(myAdapter);
        spinnerSix.setOnItemSelectedListener(this);

        // Spinner 7
        Spinner spinnerSeven = findViewById(R.id.spinnerSeven);
        spinnerSeven.setAdapter(myAdapter);
        spinnerSeven.setOnItemSelectedListener(this);

        // Spinner 8
        Spinner spinnerEight = findViewById(R.id.spinnerEight);
        spinnerEight.setAdapter(myAdapter);
        spinnerEight.setOnItemSelectedListener(this);

        // Spinner 9
        Spinner spinnerNine = findViewById(R.id.spinnerNine);
        spinnerNine.setAdapter(myAdapter);
        spinnerNine.setOnItemSelectedListener(this);

        // Spinner 10
        Spinner spinnerTen = findViewById(R.id.spinnerTen);
        spinnerTen.setAdapter(myAdapter);
        spinnerTen.setOnItemSelectedListener(this);

    }

    /*
    Creates Toast, and checks which spinner has been used.
    Calls checkSkill()
     */
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String text = adapterView.getSelectedItem().toString();                     // Spinner selected text

        TextView textViewOne_fig = findViewById(R.id.textViewOne_fig);              // Fig 1
        TextView textViewOne_tariff = findViewById(R.id.textViewOne_tariff);        // Tariff 1

        TextView textViewTwo_fig = findViewById(R.id.textViewTwo_fig);              // Fig 2
        TextView textViewTwo_tariff = findViewById(R.id.textViewTwo_tariff);        // Tariff 2

        TextView textViewThree_fig = findViewById(R.id.textViewThree_fig);          // Fig 3
        TextView textViewThree_tariff = findViewById(R.id.textViewThree_tariff);    // Tariff 3

        TextView textViewFour_fig = findViewById(R.id.textViewFour_fig);            // Fig 4
        TextView textViewFour_tariff = findViewById(R.id.textViewFour_tariff);      // Tariff 4

        TextView textViewFive_fig = findViewById(R.id.textViewFive_fig);            // Fig 5
        TextView textViewFive_tariff = findViewById(R.id.textViewFive_tariff);      // Tariff 5

        TextView textViewSix_fig = findViewById(R.id.textViewSix_fig);              // Fig 6
        TextView textViewSix_tariff = findViewById(R.id.textViewSix_tariff);        // Tariff 6

        TextView textViewSeven_fig = findViewById(R.id.textViewSeven_fig);          // Fig 7
        TextView textViewSeven_tariff = findViewById(R.id.textViewSeven_tariff);    // Tariff 7

        TextView textViewEight_fig = findViewById(R.id.textViewEight_fig);          // Fig 8
        TextView textViewEight_tariff = findViewById(R.id.textViewEight_tariff);    // Tariff 8

        TextView textViewNine_fig = findViewById(R.id.textViewNine_fig);            // Fig 9
        TextView textViewNine_tariff = findViewById(R.id.textViewNine_tariff);      // Tariff 9

        TextView textViewTen_fig = findViewById(R.id.textViewTen_fig);              // Fig 10
        TextView textViewTen_tariff = findViewById(R.id.textViewTen_tariff);        // Tariff 10


        // Display Toast of selected item (Except "Select skill" option)
        if(!text.equals("Select skill"))
        {
            Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_SHORT).show();
        }


        // Check which spinner has been used
        if (adapterView.getId() == R.id.spinnerOne)
        {
            checkSkill(textViewOne_fig, textViewOne_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerTwo)
        {
            checkSkill(textViewTwo_fig, textViewTwo_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerThree)
        {
            checkSkill(textViewThree_fig, textViewThree_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerFour)
        {
            checkSkill(textViewFour_fig, textViewFour_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerFive)
        {
            checkSkill(textViewFive_fig, textViewFive_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerSix)
        {
            checkSkill(textViewSix_fig, textViewSix_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerSeven)
        {
            checkSkill(textViewSeven_fig, textViewSeven_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerEight)
        {
            checkSkill(textViewEight_fig, textViewEight_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerNine)
        {
            checkSkill(textViewNine_fig, textViewNine_tariff, text);
        }
        else if (adapterView.getId() == R.id.spinnerTen)
        {
            checkSkill(textViewTen_fig, textViewTen_tariff, text);
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    /*
    Checks which skill has been selected.
    Calls  changeScreenValues()
    */
    public void checkSkill(TextView textView_fig, TextView textView_tariff, String text)
    {

        if (text.equals("Select skill"))
        {
            changeScreenValues(textView_fig, textView_tariff, "0", 0.0);
        }
        else if(text.equals("Back drop"))
        {
            changeScreenValues(textView_fig, textView_tariff, "1b", 0.1);
        }
        else if(text.equals("Back somersault (pike)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "4-<", 0.6);
        }
        else if(text.equals("Back somersault (straight)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "4-/", 0.6);
        }
        else if(text.equals("Back somersault (tuck)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "4-o", 0.5);
        }
        else if(text.equals("Back somersault to seat (pike)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "4s-<", 0.6);
        }
        else if(text.equals("Back somersault to seat (straight)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "4s-/", 0.6);
        }
        else if(text.equals("Back somersault to seat (tuck)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "4s-o", 0.5);
        }
        else if(text.equals("Barani (piked)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "41<", 0.6);
        }
        else if(text.equals("Barani (straight)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "41/", 0.6);
        }
        else if(text.equals("Barani (tuck)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "41o", 0.6);
        }
        else if(text.equals("Barani ball out (pike)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "51<", 0.7);
        }
        else if(text.equals("Barani ball out (straight)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "51/", 0.7);
        }
        else if(text.equals("Barani ball out (tuck)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "51o", 0.7);
        }
        else if(text.equals("Barani in - back out (pike)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "810<", 1.1);
        }
        else if(text.equals("Barani in - back out (straight)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "810/", 1.1);
        }
        else if(text.equals("Barani in - back out (tuck)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "810o", 1.1);
        }
        else if(text.equals("Cody (pike)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "5-<", 0.7);
        }
        else if(text.equals("Cody (straight)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "5-/", 0.7);
        }
        else if(text.equals("Cody (tuck)"))
        {
            changeScreenValues(textView_fig, textView_tariff, "5-o", 0.6);
        }



    }

    /*
    Changes screen TextViews, specific to arguments
     */
    public void changeScreenValues(TextView textView_fig, TextView textView_tariff, String fig, double tariff)
    {
        textView_fig.setText(fig);
        textView_tariff.setText(Double.toString(tariff));

        // Change tariff total
        updateRoutineTariff();
    }

    public void updateRoutineTariff()
    {
        TextView textViewOne_tariff = findViewById(R.id.textViewOne_tariff);        // Tariff 1
        TextView textViewTwo_tariff = findViewById(R.id.textViewTwo_tariff);        // Tariff 2
        TextView textViewThree_tariff = findViewById(R.id.textViewThree_tariff);    // Tariff 3
        TextView textViewFour_tariff = findViewById(R.id.textViewFour_tariff);      // Tariff 4
        TextView textViewFive_tariff = findViewById(R.id.textViewFive_tariff);      // Tariff 5
        TextView textViewSix_tariff = findViewById(R.id.textViewSix_tariff);        // Tariff 6
        TextView textViewSeven_tariff = findViewById(R.id.textViewSeven_tariff);    // Tariff 7
        TextView textViewEight_tariff = findViewById(R.id.textViewEight_tariff);    // Tariff 8
        TextView textViewNine_tariff = findViewById(R.id.textViewNine_tariff);      // Tariff 9
        TextView textViewTen_tariff = findViewById(R.id.textViewTen_tariff);        // Tariff 10

        // Create double for values to be stored
        double output = 0.0;
        output += Double.parseDouble(textViewOne_tariff.getText().toString())
        + Double.parseDouble(textViewTwo_tariff.getText().toString())
        + Double.parseDouble(textViewThree_tariff.getText().toString())
        + Double.parseDouble(textViewFour_tariff.getText().toString())
        + Double.parseDouble(textViewFive_tariff.getText().toString())
        + Double.parseDouble(textViewSix_tariff.getText().toString())
        + Double.parseDouble(textViewSeven_tariff.getText().toString())
        + Double.parseDouble(textViewEight_tariff.getText().toString())
        + Double.parseDouble(textViewNine_tariff.getText().toString())
        + Double.parseDouble(textViewTen_tariff.getText().toString());

        /*
        Old code that caused float output
        TextView textViewTotalTariff = findViewById(R.id.textViewTotalTariff);
        textViewTotalTariff.setText(Double.toString(output));
        */

        DecimalFormat value = new DecimalFormat("#.#");

        // Change total-tariff text view
        TextView textViewTotalTariff = findViewById(R.id.textViewTotalTariff);
        textViewTotalTariff.setText(value.format(output));
    }
}
