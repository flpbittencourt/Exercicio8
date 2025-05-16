package com.example.exercicio8;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.ViewHolder>{
    private final List<Filme> localDataSet;
    public FilmeAdapter(List<Filme> localDataSet){this.localDataSet = localDataSet;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Filme filme = localDataSet.get(position);
        holder.getImageView().setImageResource(filme.img);
        holder.getTextViewNome().setText(filme.nome);
        holder.getTextViewAno().setText(filme.ano);
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView textViewNome;
        private final TextView textViewAno;
        private final ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNome = itemView.findViewById(R.id.txtNomeFilme);
            textViewAno = itemView.findViewById(R.id.txtAnoFilme);
            imageView = itemView.findViewById(R.id.imgFilme);

            itemView.setOnClickListener(this);
        }

        public TextView getTextViewNome() {
            return textViewNome;
        }
        public TextView getTextViewAno() {
            return textViewAno;
        }

        public ImageView getImageView() {
            return imageView;
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(),
                    "Filme: " + getTextViewNome().getText().toString() + " (" + getTextViewAno().getText().toString() + ")", Toast.LENGTH_SHORT).show();
        }
    }


}

