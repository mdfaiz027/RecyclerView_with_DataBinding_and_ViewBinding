package com.example.recyclerview_with_databinding_and_viewbinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_with_databinding_and_viewbinding.databinding.SingleRowDesignBinding;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<Student> list;

    public MyAdapter(List<Student> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        SingleRowDesignBinding binding = SingleRowDesignBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Student Current = list.get(position);
        holder.singleRowDesignBinding.setStudentobject(Current);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        SingleRowDesignBinding singleRowDesignBinding;

        public ViewHolder(@NonNull SingleRowDesignBinding singleRowDesignBinding) {
            super(singleRowDesignBinding.getRoot());

            this.singleRowDesignBinding = singleRowDesignBinding;

        }
    }
}
