package tonchev.sportsdirect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LadiesActivity2 extends AppCompatActivity {
    private Button clothing ;
    private Button footwear;
    private Button accesories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladies2);

        clothing = (Button) findViewById(R.id.ladies_clothing);
        footwear = (Button) findViewById(R.id.ladies_footwear);
        accesories = (Button) findViewById(R.id.ladies_accesories);

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LadiesActivity2.this,LadiesClothing.class);
                LadiesActivity2.this.startActivity(intent);

            }
        };
        clothing.setOnClickListener(listener2);
        footwear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LadiesActivity2.this,LadiesFootwear.class);
                LadiesActivity2.this.startActivity(intent);
            }
        });
        accesories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LadiesActivity2.this, AccessoriesActivity.class);
                LadiesActivity2.this.startActivity(intent);
            }
        });


    }

    public void callMyHistory(View view) {
        Intent intent = new Intent(LadiesActivity2.this, MyHistoryActivity.class);
        startActivity(intent);
    }

    public void callShoppingBag(View view) {
        if (!MainActivity.loggedUser.getShoppingBag().isEmpty()) {
            Intent intent = new Intent(LadiesActivity2.this, MyShoppingBagActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Bag empty. Please add some products first!", Toast.LENGTH_SHORT).show();
        }
    }
}
