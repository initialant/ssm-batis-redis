package com.xxx.dao;

import com.xxx.pojo.Item;

import java.util.List;

public interface ItemMapper {
    public List<Item> queryAll();
    public int deleteItemById(int id);
    public int updateItemById(Item item);

}
