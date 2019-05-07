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

        switch (text) {
            case "Select skill":
                changeScreenValues(textView_fig, textView_tariff, "0", 0.0);
                break;
            case "Back drop":
                changeScreenValues(textView_fig, textView_tariff, "1b", 0.1);
                break;
            case "Back somersault (pike)":
                changeScreenValues(textView_fig, textView_tariff, "4-<", 0.6);
                break;
            case "Back somersault (straight)":
                changeScreenValues(textView_fig, textView_tariff, "4-/", 0.6);
                break;
            case "Back somersault (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "4-o", 0.5);
                break;
            case "Back somersault to seat (pike)":
                changeScreenValues(textView_fig, textView_tariff, "4s-<", 0.6);
                break;
            case "Back somersault to seat (straight)":
                changeScreenValues(textView_fig, textView_tariff, "4s-/", 0.6);
                break;
            case "Back somersault to seat (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "4s-o", 0.5);
                break;
            case "Barani (piked)":
                changeScreenValues(textView_fig, textView_tariff, "41<", 0.6);
                break;
            case "Barani (straight)":
                changeScreenValues(textView_fig, textView_tariff, "41/", 0.6);
                break;
            case "Barani (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "41o", 0.6);
                break;
            case "Barani ball out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "51<", 0.7);
                break;
            case "Barani ball out (straight)":
                changeScreenValues(textView_fig, textView_tariff, "51/", 0.7);
                break;
            case "Barani ball out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "51o", 0.7);
                break;
            case "Barani in - back out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "810<", 1.1);
                break;
            case "Barani in - back out (straight)":
                changeScreenValues(textView_fig, textView_tariff, "810/", 1.1);
                break;
            case "Barani in - back out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "810o", 1.1);
                break;
            case "Cody (pike)":
                changeScreenValues(textView_fig, textView_tariff, "5-<", 0.7);
                break;
            case "Cody (straight)":
                changeScreenValues(textView_fig, textView_tariff, "5-/", 0.7);
                break;
            case "Cody (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "5-o", 0.6);
                break;
            case "Crash dive":
                changeScreenValues(textView_fig, textView_tariff, "3b", 0.3);
                break;
            case "Double back (pike)":
                changeScreenValues(textView_fig, textView_tariff, "8--<", 1.2);
                break;
            case "Double back (straight)":
                changeScreenValues(textView_fig, textView_tariff, "8--/", 1.2);
                break;
            case "Double back (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "8--o", 1.0);
                break;
            case "Double bounce roll (pike)":
                changeScreenValues(textView_fig, textView_tariff, "8b--<", 1.2);
                break;
            case "Double bounce roll (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "8b--o", 1.0);
                break;
            case "Front drop":
                changeScreenValues(textView_fig, textView_tariff, "1f", 0.1);
                break;
            case "Front somersault (pike)":
                changeScreenValues(textView_fig, textView_tariff, "f4-<", 0.6);
                break;
            case "Front somersault (straight)":
                changeScreenValues(textView_fig, textView_tariff, "f4-/", 0.6);
                break;
            case "Front somersault (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "f3-o", 0.5);
                break;
            case "Full":
                changeScreenValues(textView_fig, textView_tariff, "42/", 0.7);
                break;
            case "Full full (pike)":
                changeScreenValues(textView_fig, textView_tariff, "822<", 1.6);
                break;
            case "Full full (straight)":
                changeScreenValues(textView_fig, textView_tariff, "822/", 1.6);
                break;
            case "Full full (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "822o", 1.4);
                break;
            case "Full in - half out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "821<", 1.5);
                break;
            case "Full in - half out (straight)":
                changeScreenValues(textView_fig, textView_tariff, "821/", 1.5);
                break;
            case "Full in - half out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "821o", 1.3);
                break;
            case "Full in - rudi out":
                changeScreenValues(textView_fig, textView_tariff, "823/", 1.7);
                break;
            case "Full twist jump":
                changeScreenValues(textView_fig, textView_tariff, "02", 0.2);
                break;
            case "Half in - half out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "811<", 1.4);
                break;
            case "Half in - half out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "811o", 1.2);
                break;
            case "Half in - rudi out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "813<", 1.6);
                break;
            case "Half in - rudi out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "813o", 1.4);
                break;
            case "Half out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "801<", 1.3);
                break;
            case "Half out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "801o", 1.1);
                break;
            case "Half out ball out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "901<", 1.4);
                break;
            case "Half out ball out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "901o", 1.2);
                break;
            case "Half twist jump":
                changeScreenValues(textView_fig, textView_tariff, "01", 0.1);
                break;
            case "Half twist to back drop":
                changeScreenValues(textView_fig, textView_tariff, "1b1", 0.2);
                break;
            case "Half twist to crash dive":
                changeScreenValues(textView_fig, textView_tariff, "3b1", 0.4);
                break;
            case "Half twist to feet (from B)":
                changeScreenValues(textView_fig, textView_tariff, "11", 0.2);
                break;
            case "Half twist to feet (from S)":
                changeScreenValues(textView_fig, textView_tariff, "01", 0.1);
                break;
            case "Half twist to front drop":
                changeScreenValues(textView_fig, textView_tariff, "1f1", 0.2);
                break;
            case "Half twist to seat drop":
                changeScreenValues(textView_fig, textView_tariff, "s1", 0.1);
                break;
            case "Lazy back":
                changeScreenValues(textView_fig, textView_tariff, "3f-", 0.3);
                break;
            case "Miller":
                changeScreenValues(textView_fig, textView_tariff, "833/", 1.8);
                break;
            case "One and a half twist jump":
                changeScreenValues(textView_fig, textView_tariff, "03/", 0.3);
                break;
            case "One and three (pike)":
                changeScreenValues(textView_fig, textView_tariff, "7--<", 0.9);
                break;
            case "One and three (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "7--o", 0.8);
                break;
            case "Pike jump":
                changeScreenValues(textView_fig, textView_tariff, "<", 0.0);
                break;
            case "Randy":
                changeScreenValues(textView_fig, textView_tariff, "45/", 1.0);
                break;
            case "Rudi":
                changeScreenValues(textView_fig, textView_tariff, "43/", 0.8);
                break;
            case "Rudi out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "803<", 1.5);
                break;
            case "Rudi out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "803o", 1.3);
                break;
            case "Seat drop":
                changeScreenValues(textView_fig, textView_tariff, "0s", 0.0);
                break;
            case "Straddle jump":
                changeScreenValues(textView_fig, textView_tariff, "v", 0.0);
                break;
            case "Triff half in - half out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "12101<", 2.1);
                break;
            case "Triff half in - half out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "12101o", 1.8);
                break;
            case "Triff half out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "12001<", 2.0);
                break;
            case "Triff half out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "12001o", 1.7);
                break;
            case "Triff rudi out (pike)":
                changeScreenValues(textView_fig, textView_tariff, "12003<", 2.2);
                break;
            case "Triff rudi out (tuck)":
                changeScreenValues(textView_fig, textView_tariff, "12003", 1.9);
                break;
            case "Tuck jump":
                changeScreenValues(textView_fig, textView_tariff, "o", 0.0);
                break;
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
