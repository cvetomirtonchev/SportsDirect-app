package tonchev.sportsdirect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectionActivity extends AppCompatActivity {
    private Button ladiesChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        ladiesChoice = (Button) findViewById(R.id.ladiesButton);


        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectionActivity.this,LadiesActivity2.class);
                SelectionActivity.this.startActivity(intent);
            }
        };
        ladiesChoice.setOnClickListener(listener);
    }

    public void menChoice(View view) {
        Intent intent = new Intent(this, MenActivity.class);
        startActivity(intent);
    }

    public void callMyHistory(View view) {
        Intent intent = new Intent(SelectionActivity.this, MyHistoryActivity.class);
        startActivity(intent);
    }

    public void callShoppingBag(View view) {
        if (!MainActivity.loggedUser.getShoppingBag().isEmpty()) {
            Intent intent = new Intent(SelectionActivity.this, MyShoppingBagActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Bag empty. Please add some products first!", Toast.LENGTH_SHORT).show();
        }
    }
}
