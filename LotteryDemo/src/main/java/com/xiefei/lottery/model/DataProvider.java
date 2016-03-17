package com.xiefei.lottery.model;

import com.xiefei.lottery.R;
import com.xiefei.lottery.entity.DataEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiefei on 2016/3/16.
 */
public class DataProvider {
    public static List<DataEntity> getData(){
        List<DataEntity> dataEntities = new ArrayList<>();
        DataEntity dataEntity = new DataEntity();
        dataEntity.setIsFinished(false);
        dataEntity.setLogoUrl(R.drawable.icon);
        dataEntity.setTitle("10元话费");
        dataEntity.setData("11月17日");
        dataEntity.setProgram("积分夺宝");
        dataEntity.setNumber(5);
        dataEntity.setProgress(40);
        dataEntity.setPersonNum(8);
        dataEntity.setReminder("满29人次即开奖");
        dataEntities.add(dataEntity);
        dataEntity = new DataEntity();
        dataEntity.setIsFinished(true);
        dataEntity.setLogoUrl(R.drawable.icon);
        dataEntity.setTitle("10元话费");
        dataEntity.setData("11月17日");
        dataEntity.setProgram("积分夺宝");
        dataEntity.setNumber(5);
        dataEntity.setWinner("王思聪");
        dataEntity.setFinishData("2015年11月15日 06:00");
        dataEntities.add(dataEntity);
        dataEntity = new DataEntity();
        dataEntity.setIsFinished(true);
        dataEntity.setLogoUrl(R.drawable.icon);
        dataEntity.setTitle("10元话费");
        dataEntity.setData("11月17日");
        dataEntity.setProgram("积分夺宝");
        dataEntity.setNumber(5);
        dataEntity.setWinner("忘记拥抱");
        dataEntity.setFinishData("2015年11月13日 00:30");
        dataEntities.add(dataEntity);
        return dataEntities;
    }
}
