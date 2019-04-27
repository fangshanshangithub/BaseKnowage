package com.httpbase.httpbase.controller.trans;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.httpbase.httpbase.entity.Table_A;
import com.httpbase.httpbase.entity.Table_B;
import com.httpbase.httpbase.extras.gosns.IntegerDefault0Adapter;
import com.httpbase.httpbase.service.Table_AService;
import com.httpbase.httpbase.service.Table_BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@Controller
@RequestMapping("trans")
public class TransitionContrller {

    public static Long cleanCount = 0L;




    @Autowired
    private Table_BService tableBService;

    @Autowired
    private Table_AService tableAService;


    private Gson gson = new GsonBuilder() //
            .registerTypeAdapter(Integer.class, new IntegerDefault0Adapter())//
            .serializeNulls().create(); // 过滤空字段的问题

    @RequestMapping("")
    public String index() {
        return "trans_index";
    }

    /**
     * 清空 A,B的数据
     * @return
     */
    @RequestMapping("truncate")
    @ResponseBody
    public String clean() {
        int i = tableBService.cleanRecord();
        int j = tableAService.cleanRecord();

        return "清空A,B表数据成功" + (++cleanCount);
    }




    /**
     * 事务方法在平级调用，都是在controller中被调用
     * @return
     */
    @RequestMapping("trans_01")
    @ResponseBody
    public  String trans_01(@RequestBody String param) {

        /**
         * gosn json 转 bean
         * json 字符串中的元素要喝bean中的元素一一对应，json中的的元素可以比bean中的多，但是不能少
         */
        Type type = new TypeToken<Table_A> () {
        }.getType();        //bean类型
        Table_A table_a = gson.fromJson(param, type);

        Type type1 = new TypeToken<Table_B> () {
        }.getType();        //bean类型
        Table_B table_b = gson.fromJson(param, type1);


        tableAService.save_trans(table_a);

        tableBService.save_trans(table_b);



        return "事务方法在平级调用，tableAService.save_trans是个事务方法，tableBService.save_trans是个事务方法，这2个方法在同一个controller，相互独立";
    }
    /**
     * 事务方法调用事务方法
     * @return
     */
    @RequestMapping("trans_02")
    @ResponseBody
    public String trans_02(@RequestBody String param) {

        Type type = new TypeToken<Table_A> () {
        }.getType();        //bean类型
        Table_A table_a = gson.fromJson(param, type);

        Type type1 = new TypeToken<Table_B> () {
        }.getType();        //bean类型
        Table_B table_b = gson.fromJson(param, type1);

        tableAService.save_trans_union_all(table_a, table_b);

        return "事务方法调用事务方法";
    }

    /**
     * 事务方法调用普通方法
     * @return
     */
    @RequestMapping("trans_03")
    @ResponseBody
    public String trans_03(@RequestBody String param) {

        Type type = new TypeToken<Table_A> () {
        }.getType();        //bean类型
        Table_A table_a = gson.fromJson(param, type);

        Type type1 = new TypeToken<Table_B> () {
        }.getType();        //bean类型
        Table_B table_b = gson.fromJson(param, type1);

        tableAService.save_trans_union(table_a, table_b);

        return "事务方法调用普通方法";
    }

    /**
     * 普通方法 调用 事务方法
     * @return
     */
    @RequestMapping("trans_04")
    @ResponseBody
    public String trans_04(@RequestBody String param) {

        Type type = new TypeToken<Table_A> () {
        }.getType();        //bean类型
        Table_A table_a = gson.fromJson(param, type);

        Type type1 = new TypeToken<Table_B> () {
        }.getType();        //bean类型
        Table_B table_b = gson.fromJson(param, type1);

        tableAService.save_trans_union(table_a, table_b);

        return "事务方法调用普通方法";
    }

    /**
     * 表B 所有记录
     * @return
     */
    @RequestMapping("a_allData")
    @ResponseBody
    public List<Table_A> a_allData() {
        return tableAService.findAll();

    }

    /**
     * 表B 所有记录
     * @return
     */
    @RequestMapping("b_allData")
    @ResponseBody
    public List<Table_B> b_allData() {
        return tableBService.findAll();

    }


    /**
     * 无事务的方法调用
     * @return
     */
    @RequestMapping("noAnno")
    public @ResponseBody String noAnno(@RequestBody String param) {

        Type type = new TypeToken<Table_A> () {
        }.getType();        //bean类型
        Table_A table_a = gson.fromJson(param, type);

        Type type1 = new TypeToken<Table_B> () {
        }.getType();        //bean类型
        Table_B table_b = gson.fromJson(param, type1);


        tableAService.save(table_a);

        tableBService.save(table_b);



        return "tableAService.save(table_a)和 tableBService.save(table_b)是普通方法出现异常不会阻塞，不涉及到回滚";
    }


}
