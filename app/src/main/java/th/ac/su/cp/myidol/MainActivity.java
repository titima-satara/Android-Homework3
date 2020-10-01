package th.ac.su.cp.myidol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();

        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);

        RecyclerView rv = findViewById(R.id.wordList_recyclerView);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private WordItem[] items = {
            new WordItem(R.drawable.bambamgot7, "Kanpimuk Puwakul","BamBam Got7"),
            new WordItem(R.drawable.kimsoohyun, "Kim Soo Hyun","Kimsoohyun"),
            new WordItem(R.drawable.kristperewat, "Perawat Sangpotirat","Krist Perawat"),
            new WordItem(R.drawable.leejongsuk, "Lee Jong Suk","Leejongsuk"),
            new WordItem(R.drawable.markgot7, "Mark Tuan","Mark Got7"),
            new WordItem(R.drawable.mikepirat, "Pirat Nitipaisalkul","Mike Pirat"),
            new WordItem(R.drawable.thetoys, "Thanwa Boonsoongnern","The Toys"),
            new WordItem(R.drawable.wangyibo, "Wang Yibo","Wangyibo"),
            new WordItem(R.drawable.winmaytawin, "Metawin Opasiamkajorn ","Win Metawin"),
            new WordItem(R.drawable.xiaozhan, "Xiao Zhan","Xiaozhan")
    };


    public MyAdapter() {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_word, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(items[position].imageResId);
        holder.wordTextView.setText(items[position].word);
        holder.wordTextView2.setText(items[position].word2);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView wordTextView;
        TextView wordTextView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            wordTextView = itemView.findViewById(R.id.word_text_view);
            wordTextView2 = itemView.findViewById(R.id.word_text_view2);
        }
    }
}
