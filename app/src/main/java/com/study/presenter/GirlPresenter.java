package com.study.presenter;

import com.study.model.Girl;
import com.study.model.IGirlModel;
import com.study.view.IGirlView;

import java.util.List;

/**
 * 表示层
 */
public class GirlPresenter<T extends IGirlView> {
    //view层的引用
    IGirlView iGirlView;

    //model的引用
    IGirlModel iGirlModel;

    public GirlPresenter(T view){
        this.iGirlView = view;
    }
    //执行操作（ui逻辑）
    public void fetch(){
        if(iGirlView!=null){
            iGirlView.showLoading();
            if(iGirlModel!=null){
                iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if(iGirlView!=null){
                            iGirlView.showGirls(girls);
                        }
                    }
                });
            }
        }
    }
}
