package com.study.model;

import java.util.ArrayList;
import java.util.List;

public class GirlModelIml implements IGirlModel{

    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data = new ArrayList<Girl>();
        data.add(new Girl("title 1","content 1"));
        data.add(new Girl("title 2","content 2"));
        data.add(new Girl("title 3","content 3"));
        data.add(new Girl("title 4","content 4"));
        data.add(new Girl("title 5","content 5"));
        data.add(new Girl("title 6","content 6"));
        girlOnLoadListener.onComplete(data);
    }
}
