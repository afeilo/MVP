package com.xiefei.lottery.fragment.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xiefei.lottery.mvp.presenter.MvpPresenter;
import com.xiefei.lottery.mvp.view.MvpView;


/**
 * Created by xiefei on 2016/3/16.
 */
public abstract class BaseFragment<P extends MvpPresenter,V extends MvpView> extends Fragment implements MvpView{
    protected P presenter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresent();
        setRetainInstance(isRetainInstance());
    }
    //将P与V绑定
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.attachView(getMvpView());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getLayout(),container,false);
    }
    public abstract @LayoutRes int getLayout();
    public abstract P createPresent();
    public V getMvpView(){
        return (V) this;
    }
    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.detachView(isRetainInstance());
        setRetainInstance(isRetainInstance());
    }
    protected abstract boolean isRetainInstance();
}
