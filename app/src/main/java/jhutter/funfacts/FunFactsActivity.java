package jhutter.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mLayout;
    private FactBook mFactBook = new FactBook();
    //private FunFactsColorPalette mColorPalette = new FunFactsColorPalette();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // assign the views from the layout view to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mFactTextView.setText(mFactBook.getFact());
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        //mLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        //mLayout.setBackgroundColor(Color.parseColor(mColorPalette.getColorString()));


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // update the screen with our dynamic fact
                mFactTextView.setText(mFactBook.getFact());
                //mLayout.setBackgroundColor(Color.parseColor(mColorPalette.getColorString()));
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
