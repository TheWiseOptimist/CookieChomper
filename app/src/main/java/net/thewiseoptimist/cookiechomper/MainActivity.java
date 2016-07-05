package net.thewiseoptimist.cookiechomper;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    int quantity, price;
    TextView quantityTextView;
    TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity = 2;
        price = 5;
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
        priceTextView = (TextView) findViewById(R.id.price_text_view);
    }

    /**
     * Submit order. This method is called when the order button is clicked
     *
     * @param view the view
     */
    public void submitOrder(View view) {
        display(quantity);
        displayPrice(quantity * price);
    }


    /**
     * Display price.  Helper method that displays the given price value on the screen.
     *
     * @param number the number
     */
    private void displayPrice(int number) {
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


    /**
     * Display. Helper method that displays the given quantity value on the screen.
     *
     * @param number the number
     */
    private void display(int number) {
        quantity = number;
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + quantity);
    }

    public void increment(View view) {
        display(++quantity);
    }

    public void decrement(View view) {
        if (quantity >= 1)
            display(--quantity);
        else
            display(0);
    }
}

