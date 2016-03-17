package com.xiefei.lottery.presenter;

import com.xiefei.lottery.model.DataProvider;
import com.xiefei.lottery.mvp.presenter.LcePresenter;
import com.xiefei.lottery.mvp.presenter.MvpBasePresenter;
import com.xiefei.lottery.view.LotteryView;

/**
 * Created by xiefei on 2016/3/16.
 */
public class LotteryPresenter extends MvpBasePresenter<LotteryView> implements LcePresenter {
    private boolean isPullToRefresh = false;
    @Override
    public void getData() {
//        getView().setData();
        getView().showLoading(isPullToRefresh);
        if(isPullToRefresh){
            getView().showContent();
            return;
        }
        getView().setData(DataProvider.getData());
        getView().showContent();
        isPullToRefresh = true;
    }
}
