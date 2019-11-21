package com.agisvx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.google.common.base.Strings;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.*;
import java.util.*;

public class AppTestCase {
    //
//    @Test
    public void testApp() {
        //
//        App app=new App();
//        //
//        app.showInfo("wanngslanglang");
//        //
//        String className=App.class.getSimpleName();
//        //
//        System.out.println("simple name is "+className);
//        //
//        System.out.println("full name is "+App.class.getName());
//        //
//        System.out.println(1<<26);
//        //
//
//        //
        Queue<String> queue = new LinkedList<String>();
        //
        queue.add("wang");
        //
        queue.add("shang");

        queue.add("lang");
        //
//        Stack<String> stack=new


        //
        System.out.println("before size == " + queue.size());
//        String item=queue.poll();
        int index = 0;
        while (!queue.isEmpty()) {
            //
            //
//            queue.add("cc"+index);
//            index++;

            String item = queue.poll();
            //
            System.out.println(item);

        }
        //
        System.out.println("after size == " + queue.size());

        //

        Stack<String> stack = new Stack<String>();
        //
        stack.push("wang");
        stack.push("shang");
        stack.push("lang");
        //
        //


        System.out.println("before stack size ==" + stack.size());

        //
        while (!stack.isEmpty()) {
            //
            System.out.println(stack.pop());

        }
        //

        System.out.println("after stack size ==" + stack.size());
    }

    //
//    @Test
    public void testJson() {
        //
        JSONObject jsonObject = new JSONObject();
        //
        jsonObject.put("result", 200);
        jsonObject.put("error", -999);
        //
        jsonObject.put("data", "wangsl");
        //

        String info = jsonObject.toJSONString();
        //
        System.out.println(info);
        //

        String jsonString = "{\"result\":200,\"data\":\"wangsl\",\"error\":-999}";
        //

        JSONObject jsonObject1 = JSONObject.parseObject(jsonString);
        //
        System.out.println(jsonObject1.getString("result").equals("200"));
    }


    //


    //    @Test
    public void testJsonParse() {
        //
        List<User> users = new ArrayList<>();
        //
        users.add(new User("wsl", 1, "ddd1"));
        users.add(new User("wsl2", 2, "ddd2"));
        users.add(new User("wsl3", 3, "ddd3"));
        users.add(new User("wsl4", 4, "ddd4"));
        users.add(new User("wsl5", 5, "ddd5"));
        //

        System.out.println(JSONObject.toJSONString(users));
    }


    private String jsonString = " [{'address':'ddd1','age':1,'name':'wsl'},{'address':'ddd2','age':2,'name':'wsl2'},{'address':'ddd3','age':3,'name':'wsl3'},{'address':'ddd4','age':4,'name':'wsl4'},{'address':'ddd5','age':5,'name':'wsl5'}]";

    //

    //    @Test
    public void testJSON01() {
        //
        List<User> users = JSONObject.parseObject(jsonString, new TypeReference<List<User>>() {
        });
        //

        //
        for (User user : users
        ) {
            //

//            User user1=(User) user;
            //
            System.out.println(user.getAddress());


        }
    }


    //
//    @Test
    public void testFloat() {
        //

//        float item=0.0f;
//        //
//        if(item<0.000001){
//            //
//            System.out.println("dddd");
//        }

//
//        String dateStr = "2019-10-25 13:59:27";
//        //
//
//        //
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
//        //
//        try {
//            Date dd = simpleDateFormat.parse(dateStr);
//            //
//            System.out.println(dd.getTime());
//        } catch (ParseException e) {
//            //
//            e.printStackTrace();
//        }


//        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
//        double data= Double.valueOf(df.format(12322323.444345));
//        //
//        System.out.println(data);

        //


//        double   f   =   111231.5585;
//        BigDecimal b   =   new   BigDecimal("28,081.55");
//        double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
//        //
//        System.out.println(f1);


        //

        List<LocalPointsModel> models = new TrackModelData().initData();

        LinkedHashSet<Object> haoma = new LinkedHashSet<Object>();

        //

        //



        Map<String, Object> mapModels = new HashMap<>();

        //
        //
        List<Map<String, Object>> newModels = new ArrayList<>();
        //

//Arr

        //
        for (LocalPointsModel mo : models) {


            String keyId = "" + mo.getLgtd() + "" + mo.getLttd();
            //
            mapModels.put(keyId, mo);

//            System.out.println(JSONObject.toJSONString(mo));
        }
        //
        //
        Set<String> keySet = mapModels.keySet();
        //
        for (String keyId : keySet) {

            //
            System.out.println(JSONObject.toJSONString(mapModels.get(keyId)));
        }
//        String[] items = {"a", "a", "a", "a", "b"};
        //
//        for (LocalPointsModel model: models) {
//
//            haoma.add(model);
//        }

//        for (int i=0;i<items.length;i++){
//            //
//            haoma.add(items[i]);
//        }
//
//        // 创建迭代器
//        Iterator<Object> iterator = haoma.iterator();
//        int a = 0;
//        // 迭代集合
//        while (iterator.hasNext()) { // true
//            //
////            String jsonString=JSONObject.toJSONString(iterator.next());
////            Object c = iterator.next();
//
//            System.out.println(iterator.next());
//        }

//        float data=20.55f;
//        //
//        DecimalFormat format=new DecimalFormat(".##.");
//        System.out.println(data/1000);

//        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
//        dfs.setDecimalSeparator('.');
//        dfs.setGroupingSeparator(',');
//        dfs.setMonetaryDecimalSeparator('.');
//        DecimalFormat df = new DecimalFormat("###,###.##",dfs);
//
//        String aa = "3,500,000.00";
//        //
//        try{
//            Number num = df.parse(aa);
//            System.out.println(num.doubleValue());
//        }
//        catch (ParseException e){
//            //
//            e.printStackTrace();
//        }

        //

        // item
//        JSONObject jsonObject=new JSONObject();
//        //
//        jsonObject.put("data",-999);
//        //
//        System.out.println(jsonObject.getInteger("data"));
//        //
//        if(jsonObject.getInteger("data")==-999){
//            //
//            System.out.println("data is error .");
//        }
//        double x=23.5455;
//        NumberFormat ddf1= NumberFormat.getNumberInstance() ;
//
//
//
//        ddf1.setMaximumFractionDigits(3);
//        double s= Double.valueOf(ddf1.format(x)) ;
//        System.out.print(s);

//        Date date=
//        //
//        System.out.println(date.getTime());
    }


    //pu
//    @Test
    public void testZero() {
        //
        //
        double item = 33.2423424 / 1000;
        //
        //
        JSONObject jsonObject=new JSONObject();
        //

        DecimalFormat format = new DecimalFormat("#0.000");
        jsonObject.put("mileage", format.format(item));
        //
        jsonObject.put("data",item);
        //
        System.out.println(jsonObject.getString("mileage"));
        //

    }

    //


}
