package tonchev.sportsdirect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenActivity extends AppCompatActivity {
    private Button accesoires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);
        accesoires = (Button) findViewById(R.id.acces_men);

        accesoires.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenActivity.this , AccessoriesActivity.class);
                MenActivity.this.startActivity(intent);
            }
        });

    }

    public void callFootwear(View view) {
        Intent intent = new Intent(this, MenFootwearActivity.class);
        startActivity(intent);
    }

    public void callClothing (View view) {
        Intent intent = new Intent(this, MenClothingActivity.class);
        startActivity(intent);
    }

    public void callMyHistory(View view) {
        Intent intent = new Intent(MenActivity.this, MyHistoryActivity.class);
        startActivity(intent);
    }

    public void callShoppingBag(View view) {
        if (!MainActivity.loggedUser.getShoppingBag().isEmpty()) {
            Intent intent = new Intent(MenActivity.this, MyShoppingBagActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Bag empty. Please add some products first!", Toast.LENGTH_SHORT).show();
        }
    }
}
