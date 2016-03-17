package com.xiefei.lottery.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.xiefei.lottery.R;
import com.xiefei.lottery.adapter.LotteryAdapter;
import com.xiefei.lottery.entity.DataEntity;
import com.xiefei.lottery.fragment.base.BaseFragment;
import com.xiefei.lottery.fragment.view.ItemDivider;
import com.xiefei.lottery.presenter.LotteryPresenter;
import com.xiefei.lottery.view.LotteryView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xiefei on 2016/3/16.
 */
public class LotteryFragment extends BaseFragment<LotteryPresenter,LotteryView> implements LotteryView,SwipeRefreshLayout.OnRefreshListener{
    @Bind(R.id.recycle_list)
    RecyclerView recyclerList;
    @Bind(R.id.main_swipe_refresh_layout)
    SwipeRefreshLayout refreshLayout;
    private List<DataEntity> list;
    private LotteryAdapter lotteryAdapter;
    @Override
    public int getLayout() {
        return R.layout.lottery_list;
    }

    @Override
    public LotteryPresenter createPresent() {
        LotteryPresenter mvpPresenter = new LotteryPresenter();
        return mvpPresenter;
    }

    @Override
    protected boolean isRetainInstance() {
        return false;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(LotteryFragment.this, view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        lotteryAdapter = new LotteryAdapter(getContext());
        recyclerList.setLayoutManager(linearLayoutManager);
        recyclerList.addItemDecoration(new ItemDivider(getContext(), R.drawable.recycle_divider));
        recyclerList.setAdapter(lotteryAdapter);
//        presenter.attachView(this);
        presenter.getData();
        refreshLayout.setOnRefreshListener(this);
    }

    @Override
    public void showLoading(boolean isPullToRefresh) {
//        if(isPullToRefresh)
//            refreshLayout.setRefreshing(false);
    }
    //根据不同情况显示（网络错误、刷新错误等等页面）
    @Override
    public void showContent() {
//        refreshLayout.setRefreshing(true);
        if(refreshLayout.isRefreshing())
            refreshLayout.setRefreshing(false);
    }

    @Override
    public void showError(Throwable throwable, boolean isPullToRefresh) {

    }

    @Override
    public void setData(List<DataEntity> data) {
        if(list == null)
            list = data;
        else
            list.addAll(data);
        lotteryAdapter.addAll(data);
    }

    @Override
    public void onRefresh() {
        presenter.getData();
    }
}
