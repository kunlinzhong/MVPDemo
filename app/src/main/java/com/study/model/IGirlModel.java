package com.study.model;

import java.util.List;

/**
 * 用来加载数据
 */
public interface IGirlModel {
    void loadGirl(GirlOnLoadListener girlOnLoadListener);
    interface GirlOnLoadListener{
        void onComplete(List<Girl> girls);
    }
}
