package com.study.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.study.model.Girl;
import com.study.mvpdemo.R;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Girl> girls;

    public ListViewAdapter(Context context,List<Girl> girls){
        inflater = LayoutInflater.from(context);
        this.girls = girls;
    }
    @Override
    public int getCount() {
        return girls.size();
    }

    @Override
    public Object getItem(int i) {
        return girls.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int pos, View converView, ViewGroup viewGroup) {
        View view  = inflater.inflate(R.layout.listview_item_layout,null);
        Girl g = girls.get(pos);
        TextView title = (TextView)view.findViewById(R.id.title);
        TextView content = (TextView)view.findViewById(R.id.content);
        title.setText(g.getTitle());
        content.setText(g.getContent());
        return view;
    }
}
