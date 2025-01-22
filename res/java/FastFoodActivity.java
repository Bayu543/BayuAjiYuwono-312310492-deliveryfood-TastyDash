import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FastFoodActivity extends AppCompatActivity {

    private int cartCount = 0; // Counter for cart items
    private TextView cartBadge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);

        // Back Button with Animation
        ImageView btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            finish();
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        });

        // Badge to show cart count
        cartBadge = findViewById(R.id.cartBadge); // Assume a badge TextView in the layout

        // Add functionality for "+" button
        Button btnAddChicken = findViewById(R.id.btnAddChicken);
        btnAddChicken.setOnClickListener(v -> {
            cartCount++;
            updateCartBadge();
        });
    }

    // Update Cart Badge
    private void updateCartBadge() {
        if (cartCount > 0) {
            cartBadge.setVisibility(View.VISIBLE);
            cartBadge.setText(String.valueOf(cartCount));
        } else {
            cartBadge.setVisibility(View.GONE);
        }
    }
}
