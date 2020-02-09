package edu.ggc.jcantillo.blackrock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Portfolio myPortfolio = new Portfolio(10000);
        myPortfolio.purchaseStock("AAPL", 10);
        myPortfolio.purchaseStock("TSLA", 1);
        myPortfolio.purchaseStock("MGMT", 10);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();

        ArrayList<Stock> myStocks = myPortfolio.getStocksOwned();
        for (Stock stock : myStocks) {
            exampleList.add(new ExampleItem(stock.getstockName(), stock.getQuantityOwned()+""));
        }

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
