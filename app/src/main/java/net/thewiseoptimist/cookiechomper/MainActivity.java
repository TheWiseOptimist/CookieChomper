package net.thewiseoptimist.cookiechomper;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    TextView quantityTextView;
    TextView priceTextView;
    private int quantity, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity = 2;
        price = 5;
        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        String quantityString = "" + quantity;
        quantityTextView.setText(quantityString);
        priceTextView = (TextView) findViewById(R.id.price_text_view);
    }

    /**
     * Submit order. This method is called when the order button is clicked
     *
     * @param view the view
     */
    public void submitOrder(View view) {
//        displayPrice(quantity * price);
        String priceMessage = "Total $" + (quantity * price);
        priceMessage += "\nThank You!";
        displayMessage(priceMessage);
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
     * Display message.
     *
     * @param message the message
     */
    private void displayMessage(String message) {
        priceTextView.setText(message);
    }

    /**
     * Display. Helper method that displays the given quantity value on the screen.
     *
     * @param number the number
     */
    private void display(int number) {
        quantity = number;
        String quantityString = "" + quantity;
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(quantityString);
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

