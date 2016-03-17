package com.xiefei.lottery.adapter.base;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by xiefei on 2016/3/16.
 */
public abstract class BaseAdapter extends RecyclerView.Adapter<BaseViewHolder>{
    private Context context;
    public BaseAdapter(Context context) {
        this.context = context;
    }
    protected Context getContext(){
        return context;
    }
    protected View getViewById(@LayoutRes int layoutRes,ViewGroup parent){
        return LayoutInflater.from(getContext()).inflate(layoutRes,parent,false);
    }


}
