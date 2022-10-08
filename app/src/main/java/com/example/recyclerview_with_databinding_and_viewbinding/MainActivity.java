package com.example.recyclerview_with_databinding_and_viewbinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview_with_databinding_and_viewbinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MyAdapter myAdapter;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.recview.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        myAdapter= new MyAdapter(getStudents());
        binding.recview.setAdapter(myAdapter);
    }

    public List<Student> getStudents(){

        List<Student> list = new ArrayList<>();
        list.add(new Student("Faiz1", "MCA"));
        list.add(new Student("Faiz2", "MCA"));
        list.add(new Student("Faiz3", "MCA"));
        list.add(new Student("Faiz4", "MCA"));
        list.add(new Student("Faiz5", "MCA"));
        list.add(new Student("Faiz6", "MCA"));
        list.add(new Student("Faiz7", "MCA"));
        list.add(new Student("Faiz8", "MCA"));
        list.add(new Student("Faiz9", "MCA"));
        list.add(new Student("Faiz10", "MCA"));

        return list;
    }
}