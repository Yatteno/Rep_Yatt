package com.example.wanthelp;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import ru.maxfad.mysplashscreen.R;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private List<CategoryEntity> items;

    DataAdapter(Context context, List<CategoryEntity> items) {
        this.items = items;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_person, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        CategoryEntity item = items.get(position);
        holder.bindView(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView nameView;
        ViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.image);
            nameView = (TextView) view.findViewById(R.id.name);
        }

        public void bindView(CategoryEntity item){
            imageView.setImageResource(item.getImage());
            nameView.setText(item.getName());
        }

    }
}
