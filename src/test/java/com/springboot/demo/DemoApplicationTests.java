package com.springboot.demo;

import com.alibaba.fastjson.JSONArray;
import com.springboot.demo.util.DateFormatConversion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        String dateStr = "2015-07-03 22:20:20";
        Long stampBegin = DateFormatConversion.dateToTimeStamp(dateStr);
        System.out.println("LongStampBegin:"+stampBegin);
        String beginDate = "1435845268000";
        Long dateLong = Long.parseLong(beginDate);
        String dateBegin = DateFormatConversion.timeStamptoDate(dateLong);
        System.out.println("StringDate："+dateBegin);
    }
    @Test
    public void testPurchase(){
        List<Integer> ids = new ArrayList<>();
        ids.add(null);
        ids.add(null);
        System.out.println(ids.size());
        if (ids!=null){
            System.out.println("---------------");
        }
    }



}
