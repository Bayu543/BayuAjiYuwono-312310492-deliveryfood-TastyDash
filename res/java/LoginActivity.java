import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Referensi elemen UI
        ImageView foodImage = findViewById(R.id.food_image);
        TextView title = findViewById(R.id.title);

        // Load animasi
        Animation slideIn = AnimationUtils.loadAnimation(this, R.anim.slide_in);
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        // Terapkan animasi
        foodImage.startAnimation(slideIn);
        title.startAnimation(fadeIn);
    }
}
