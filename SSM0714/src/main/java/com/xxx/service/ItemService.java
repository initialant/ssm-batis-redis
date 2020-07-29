package com.xxx.service;

import com.xxx.pojo.Item;

import java.util.List;

public interface ItemService {
    public List<Item> queryAll();
    public int deleteItemById(int id);
    public int updateItemById(Item item);
}
