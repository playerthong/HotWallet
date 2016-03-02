package thinktodo.com.hotwallet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 2/27/2016.
 */
public class ChooseAmountActivity extends AppCompatActivity {


    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.chooseamount_btrma)
    TextView chooseamountBtrma;
    @Bind(R.id.chooseamount_btrmb)
    TextView chooseamountBtrmb;
    @Bind(R.id.chooseamount_btrmc)
    TextView chooseamountBtrmc;
    @Bind(R.id.btNext)
    Button mBtNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseamount);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Choose Amount");
        ButterKnife.bind(this);

//        chooseamountBtrma.setTextColor(getResources().getColor(R.color.colorWhite));
//        chooseamountBtrma.setBackgroundResource(R.drawable.chooseamount_button_pressed);
//
//        chooseamountBtrmb.setTextColor(getResources().getColor(R.color.colorRed));
//        chooseamountBtrmb.setBackgroundResource(R.drawable.chooseamount_button_normal);
//
//        chooseamountBtrmc.setTextColor(Color.parseColor("#950e13"));
//        chooseamountBtrmc.setBackground(getDrawable(R.drawable.chooseamount_button_normal));


        chooseamountBtrma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state_pressed = chooseamountBtrma.isPressed();
                if (state_pressed == true) {
                    chooseamountBtrma.setTextColor(getResources().getColor(R.color.colorWhite));
                    chooseamountBtrma.setBackgroundResource(R.drawable.chooseamount_button_pressed);

                    chooseamountBtrmb.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrmb.setBackgroundResource(R.drawable.chooseamount_button_normal);

                    chooseamountBtrmc.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrmc.setBackgroundResource(R.drawable.chooseamount_button_normal);
                }
            }
        });
        chooseamountBtrmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state_pressed = chooseamountBtrmb.isPressed();
                if (state_pressed == true) {
                    chooseamountBtrmb.setTextColor(getResources().getColor(R.color.colorWhite));
                    chooseamountBtrmb.setBackgroundResource(R.drawable.chooseamount_button_pressed);

                    chooseamountBtrma.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrma.setBackgroundResource(R.drawable.chooseamount_button_normal);

                    chooseamountBtrmc.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrmc.setBackgroundResource(R.drawable.chooseamount_button_normal);

                }
            }
        });
        chooseamountBtrmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state_pressed = chooseamountBtrmc.isPressed();
                if (state_pressed == true) {
                    chooseamountBtrmc.setTextColor(getResources().getColor(R.color.colorWhite));
                    chooseamountBtrmc.setBackgroundResource(R.drawable.chooseamount_button_pressed);

                    chooseamountBtrmb.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrmb.setBackgroundResource(R.drawable.chooseamount_button_normal);

                    chooseamountBtrma.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrma.setBackgroundResource(R.drawable.chooseamount_button_normal);

                }
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.btNext)
    public void onClick() {

    }
}
