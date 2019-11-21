package com.agisvx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ArrayUtilTestCase {
    //

    @Test
    public void testUniqueData() {
        ////原List集合
        List<LocalPointsModel> list = new TrackModelData().initData();
        //使用迭代器删除重复元素，可保持原来的顺序
        Iterator<LocalPointsModel> iterator = list.iterator();
        List<LocalPointsModel> newList = new ArrayList<LocalPointsModel>();
        while (iterator.hasNext()) {
            LocalPointsModel next = iterator.next();
            //将新集合中没有的元素添加到新集合
            if (!newList.contains(next)) {
                newList.add(next);
            }
        }
        for (LocalPointsModel model : newList) {
            System.out.println(JSONObject.toJSONString(model));
        }
    }
}
