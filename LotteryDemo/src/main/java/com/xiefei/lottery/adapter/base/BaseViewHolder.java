package com.xiefei.lottery.adapter.base;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.xiefei.lottery.R;

/**
 * Created by xiefei on 2016/3/16.
 */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder{
    protected View itemView;
    public BaseViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
    }
    //设置数据
    public abstract void setData(T t);
    //findView
    public <V extends View>V $(@IdRes int id) {
        return (V)itemView.findViewById(id);
    }
}
