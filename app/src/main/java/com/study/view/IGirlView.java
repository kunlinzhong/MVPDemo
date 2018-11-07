package com.study.view;

import com.study.model.Girl;

import java.util.List;

/**
 * 定义所有的ui逻辑
 */
public interface IGirlView {
    void showLoading();
    void showGirls(List<Girl> girls);
}
