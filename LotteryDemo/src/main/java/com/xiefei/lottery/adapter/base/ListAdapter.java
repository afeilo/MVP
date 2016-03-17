package com.xiefei.lottery.adapter.base;

import android.content.Context;
import android.view.ViewGroup;

import com.xiefei.lottery.R;
import com.xiefei.lottery.adapter.base.BaseAdapter;
import com.xiefei.lottery.adapter.base.BaseViewHolder;
import com.xiefei.lottery.entity.DataEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiefei on 2016/3/16.
 */
public abstract class ListAdapter<M> extends BaseAdapter {
    protected List<M> list;
    public ListAdapter(Context context) {
        super(context);
    }
    public ListAdapter(Context context, List list) {
        super(context);
        this.list = list;
    }
    public void setList(List<M> list){
        this.list = list;
    }
    public void addAll(List<M> list){
        if(this.list == null){
            this.list = list;
        }else
            this.list.addAll(list);
        this.notifyDataSetChanged();
    }
    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(list.get(position));
    }
    @Override
    public int getItemViewType(int position) {
        return getItemViewEntityType(position);
    }
    protected abstract int getItemViewEntityType(int position);
    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }
}
