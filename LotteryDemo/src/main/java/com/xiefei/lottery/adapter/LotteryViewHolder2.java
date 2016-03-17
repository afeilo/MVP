package com.xiefei.lottery.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.xiefei.lottery.R;
import com.xiefei.lottery.adapter.base.BaseViewHolder;
import com.xiefei.lottery.entity.DataEntity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by xiefei on 2016/3/16.
 */
public class LotteryViewHolder2 extends BaseViewHolder<DataEntity> {
    @Bind(R.id.lottery_item_image)
    ImageView lotteryItemImage;
    @Bind(R.id.lottery_item_title)
    TextView lotteryItemTitle;
    @Bind(R.id.lottery_item_sub_title)
    TextView lotteryItemSubTitle;
    @Bind(R.id.lottery_item_more_info)
    TextView lotteryItemMoreInfo;
    @Bind(R.id.lottery_item_winner_name)
    TextView lotteryItemWinnerName;
    public LotteryViewHolder2(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    @Override
    public void setData(DataEntity dataEntity) {
        lotteryItemImage.setImageResource(dataEntity.getLogoUrl());
        lotteryItemTitle.setText(dataEntity.getTitle());
        lotteryItemSubTitle.setText(dataEntity.getProgram() + " " + dataEntity.getData() + " 第" + dataEntity.getNumber() + "场");
        lotteryItemWinnerName.setText(dataEntity.getWinner());
        lotteryItemMoreInfo.setText(dataEntity.getFinishData()+" 已开奖");
    }
}
