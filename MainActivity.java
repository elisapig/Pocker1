package com.elisa.pocker;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Pocker pocker = new Pocker();
    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //porker.shuffle();
        pocker.print();
        recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new PokerAdapter());
    }

    class PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PockerHolder> {

        @NonNull
        @Override
        public PockerHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
            View view = getLayoutInflater().inflate(R.layout.pocker,parent,false);
            return new PockerHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PockerHolder holder, int position) {
    holder.pockerText.setText(pocker.cards[position].getCard());

        }

        @Override
        public int getItemCount() {
            return pocker.cards.length;
        }

        class PockerHolder extends RecyclerView.ViewHolder{
            TextView pockerText;
            public PockerHolder(View itemView) {
                super(itemView);
                pockerText = itemView.findViewById(R.id.tv_pocker);
            }
        }
    }
}