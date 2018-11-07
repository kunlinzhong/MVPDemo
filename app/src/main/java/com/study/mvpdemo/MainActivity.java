package com.study.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.study.adapter.ListViewAdapter;
import com.study.model.Girl;
import com.study.presenter.GirlPresenter;
import com.study.view.IGirlView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IGirlView{

    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list);
        new GirlPresenter<>(this).fetch();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"加载成功",Toast.LENGTH_LONG).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        ListViewAdapter adapter = new ListViewAdapter(this,girls);
        listView.setAdapter(adapter);
    }
}
