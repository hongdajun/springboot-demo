package com.springboot.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Description: CMP TODO
 * @Author hongweijun
 * @Date 2019/8/26
 * @Version V1.0.0
 **/
public class DateFormatConversion
{
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String timeStamptoDate(Long timeStamp)
    {
        String dateString = sdf.format(new Date(timeStamp));

        return dateString;
    }

    public static Long dateToTimeStamp(String date)
    {
        Long timeStamp = null;
        try
        {
            Date dateStr = sdf.parse(date);
            timeStamp = dateStr.getTime();
        }
        catch (ParseException e)
        {
            System.out.println(e);
        }
        return timeStamp;
    }
}
