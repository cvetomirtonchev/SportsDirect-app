package tonchev.sportsdirect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import shops.FootWear;
import shops.Product;

public class MenFootwearActivity extends AppCompatActivity {

    private Button football;
    private Button flips;
    private Button sandals;
    private Button running;
    private Button boots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_footwear);

        football = (Button) findViewById(R.id.men_football);
        flips = (Button) findViewById(R.id.men_fliflops);
        sandals = (Button) findViewById(R.id.men_sandals);
        running = (Button) findViewById(R.id.men_running);
        boots = (Button) findViewById(R.id.men_boots);

        View.OnClickListener takeMeToProd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.men_football:
                        // tretoto trqbva da e specType navsqkyde za da moje activitito da obraboti pravilno dannite
                        Intent intent = new Intent(MenFootwearActivity.this, ProductsActivity.class);
                        intent.putExtra("gender", Product.Gender.MEN);
                        intent.putExtra("productType", Product.ProductType.FOOTWEAR);
                        intent.putExtra("specType", FootWear.ShoesType.FOOTBALL);
                        startActivity(intent);
                        break;
                    case R.id.men_fliflops:
                        Intent intent2 = new Intent(MenFootwearActivity.this, ProductsActivity.class);
                        intent2.putExtra("gender", Product.Gender.MEN);
                        intent2.putExtra("productType", Product.ProductType.FOOTWEAR);
                        intent2.putExtra("specType", FootWear.ShoesType.FLIPFLOPS);
                        startActivity(intent2);
                        break;
                    case R.id.men_sandals:
                        Intent intent3 = new Intent(MenFootwearActivity.this, ProductsActivity.class);
                        intent3.putExtra("gender", Product.Gender.MEN);
                        intent3.putExtra("productType", Product.ProductType.FOOTWEAR);
                        intent3.putExtra("specType", FootWear.ShoesType.SANDALS);
                        startActivity(intent3);
                        break;
                    case R.id.men_running:
                        Intent intent4 = new Intent(MenFootwearActivity.this, ProductsActivity.class);
                        intent4.putExtra("gender", Product.Gender.MEN);
                        intent4.putExtra("productType", Product.ProductType.FOOTWEAR);
                        intent4.putExtra("specType", FootWear.ShoesType.RUNNIG);
                        startActivity(intent4);
                        break;
                    case R.id.men_boots:
                        Intent intent5 = new Intent(MenFootwearActivity.this, ProductsActivity.class);
                        intent5.putExtra("gender", Product.Gender.MEN);
                        intent5.putExtra("productType", Product.ProductType.FOOTWEAR);
                        intent5.putExtra("specType", FootWear.ShoesType.BOOTS);
                        startActivity(intent5);
                        break;
                }
            }
        };
        football.setOnClickListener(takeMeToProd);
        flips.setOnClickListener(takeMeToProd);
        sandals.setOnClickListener(takeMeToProd);
        running.setOnClickListener(takeMeToProd);
        boots.setOnClickListener(takeMeToProd);
    }

    public void callMyHistory(View view) {
        Intent intent = new Intent(MenFootwearActivity.this, MyHistoryActivity.class);
        startActivity(intent);
    }

    public void callShoppingBag(View view) {
        if (!MainActivity.loggedUser.getShoppingBag().isEmpty()) {
            Intent intent = new Intent(MenFootwearActivity.this, MyShoppingBagActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Bag empty. Please add some products first!", Toast.LENGTH_SHORT).show();
        }
    }
}
