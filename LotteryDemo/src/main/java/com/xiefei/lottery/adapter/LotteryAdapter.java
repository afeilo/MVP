package com.xiefei.lottery.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.xiefei.lottery.R;
import com.xiefei.lottery.adapter.base.BaseViewHolder;
import com.xiefei.lottery.adapter.base.ListAdapter;
import com.xiefei.lottery.entity.DataEntity;

import java.util.List;

/**
 * Created by xiefei on 2016/3/16.
 */
public class LotteryAdapter extends ListAdapter<DataEntity>{
    public LotteryAdapter(Context context) {
        super(context);
    }

    public LotteryAdapter(Context context, List list) {
        super(context, list);
    }

    @Override
    protected int getItemViewEntityType(int position) {
        return list.get(position).isFinished()?2:1;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder baseViewHolder = null;
        if(viewType == 1){
            baseViewHolder = new LotteryViewHolder(getViewById(R.layout.lottery_list_item,parent));
        }else if(viewType == 2){
            baseViewHolder = new LotteryViewHolder2(getViewById(R.layout.lottery_list_item_two,parent));
        }
        return baseViewHolder;
    }
}
