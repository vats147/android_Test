package com.inshortsapk.pr_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class pr5 extends AppCompatActivity {

    private EditText productNameEditText;
    private EditText priceEditText;
    private EditText qtyEditText;

    private Button calculateAmountButton;
    private Button saveButton;
    private Button displayButton;

    private SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr5);

        productNameEditText = findViewById(R.id.product_name_edit_text);
        priceEditText = findViewById(R.id.price_edit_text);
        qtyEditText = findViewById(R.id.qty_edit_text);

        calculateAmountButton = findViewById(R.id.calculate_amount_button);
        saveButton = findViewById(R.id.save_button);
        displayButton = findViewById(R.id.display_button);

        // Initialize the SQLite database
        database = openOrCreateDatabase("ProductDatabase", MODE_PRIVATE, null);
        database.execSQL("CREATE TABLE IF NOT EXISTS products (id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, price REAL, qty INTEGER)");

        calculateAmountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAmount();
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveProduct();
            }
        });

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayProducts();
            }
        });
    }

    private void calculateAmount() {
        String productName = productNameEditText.getText().toString();
        float price = Float.parseFloat(priceEditText.getText().toString());
        int qty = Integer.parseInt(qtyEditText.getText().toString());

        float totalAmount = price * qty;

        // Display the calculated amount in a notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "product_notification")
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle("Total Amount")
                .setContentText("The total amount for " + productName + " is $" + totalAmount)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        notificationManager.notify(1, builder.build());
    }

    private void saveProduct() {
        String productName = productNameEditText.getText().toString();
        float price = Float.parseFloat(priceEditText.getText().toString());
        int qty = Integer.parseInt(qtyEditText.getText().toString());

        ContentValues values = new ContentValues();
        values.put("name", productName);
        values.put("price", price);
        values.put("qty", qty);

        database.insert("products", null, values);

        Toast.makeText(this, "Product saved successfully", Toast.LENGTH_SHORT).show();
    }

    private void displayProducts() {
        // Query the database to get the products with qty greater than 10
        Cursor cursor = database.rawQuery("SELECT * FROM products WHERE qty > 10", null);

        // Create a StringBuilder to hold the product details
        StringBuilder productDetailsBuilder = new StringBuilder();

        // Create an ArrayList to hold the product details
        ArrayList<String> productDetailsList = new ArrayList<>();

        // Loop through the cursor and add the product details to the ArrayList
        while (cursor.moveToNext()) {
            @SuppressLint("Range") String productName = cursor.getString(cursor.getColumnIndex("name"));
            @SuppressLint("Range") float price = cursor.getFloat(cursor.getColumnIndex("price"));
            @SuppressLint("Range") int qty = cursor.getInt(cursor.getColumnIndex("qty"));

            String productDetails = "Product Name: " + productName + ", Price: Rs." + price + ", Quantity: " + qty;
            productDetailsList.add(productDetails);
        }

        // Close the cursor
        cursor.close();

        // Check if any products were found
        if (productDetailsList.isEmpty()) {
            Toast.makeText(this, "No products found with quantity greater than 10", Toast.LENGTH_SHORT).show();
            return;
        }

        // Create an ArrayAdapter to display the product details in a ListView
        ArrayAdapter<String> productDetailsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productDetailsList);

        // Create a new ListView and set the adapter to display the product details
        ListView productDetailsListView = new ListView(this);
        productDetailsListView.setAdapter(productDetailsAdapter);

        // Create an AlertDialog to display the ListView
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Products with Quantity > 10");
        alertDialogBuilder.setView(productDetailsListView);
        alertDialogBuilder.setPositiveButton("OK", null);

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

        // Save the product details to a file named "ProductDetails.txt" in the internal storage of the device
        try {
            FileOutputStream outputStream = openFileOutput("ProductDetails.txt", Context.MODE_PRIVATE);
            outputStream.write(productDetailsBuilder.toString().getBytes());
            outputStream.close();
            Toast.makeText(this, "Product details saved to file: ProductDetails.txt", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "Error saving product details to file", Toast.LENGTH_SHORT).show();
        }
    }



}






