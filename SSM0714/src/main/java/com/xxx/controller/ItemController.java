package com.xxx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xxx.pojo.Item;
import com.xxx.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;


    @RequestMapping("/queryItems")
    public ModelAndView queryAll(int pageNum,int pageSize) {
        //pageHelp
        PageHelper.startPage(pageNum,pageSize);

        List<Item> items = itemService.queryAll();
        PageInfo<Item> pageInfo = new PageInfo<Item>(items);

/*        //打印确认
        for(Item item:items){
            System.out.println(item);
        }*/

        ModelAndView mav = new ModelAndView();
       // mav.addObject("items", items);
        mav.addObject("pageInfo",pageInfo);
        mav.setViewName("items_list");
        return mav;
    }


    @RequestMapping("/deleteItems")
    public ModelAndView deleteItemById(int pageNum,int pageSize,int id) {

        //这里先实现删除  根据传入的id
        int s = itemService.deleteItemById(id);
        String str = null;
        str = (s > 0?"success":"failed");
        System.out.println(str);
        //pageHelp
        PageHelper.startPage(pageNum,pageSize);

        List<Item> items = itemService.queryAll();
        PageInfo<Item> pageInfo = new PageInfo<Item>(items);

        ModelAndView mav = new ModelAndView();
        mav.addObject("pageInfo",pageInfo);
        //增加一个删除的传递数据
        mav.addObject("result",str);

        mav.setViewName("items_list");

        return mav;
    }


    @RequestMapping("/updateItem")
    public ModelAndView updateById(int pageNum,int pageSize,int id,int price,String name) {
        Item item = new Item();
        item.setId(id);
        item.setName(name);
        item.setPrice(price);
        int s = itemService.updateItemById(item);

        //pageHelp
        PageHelper.startPage(pageNum,pageSize);

        List<Item> items = itemService.queryAll();
        PageInfo<Item> pageInfo = new PageInfo<Item>(items);

        ModelAndView mav = new ModelAndView();
        mav.addObject("pageInfo",pageInfo);
        mav.setViewName("items_list");

        return mav;
    }

    @RequestMapping("/trans")
    public ModelAndView trans(int id) {

        ModelAndView mav = new ModelAndView();
        mav.addObject("id",id);
        mav.setViewName("update_list");

        return mav;
    }
}
