package com.xxx.service;

import com.xxx.dao.ItemMapper;
import com.xxx.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> queryAll() {
        return itemMapper.queryAll();
    }

    @Override
    public int deleteItemById(int id) {
        return itemMapper.deleteItemById(id);
    }


    @Override
    public int updateItemById(Item item) {
        return itemMapper.updateItemById(item);
    }
}
