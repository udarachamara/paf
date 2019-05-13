package com.dilshan.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dilshan.model.Item;
import com.dilshan.service.ItemService;


@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/")
	public String setupForm (Map < String, Object > map) {
		Item item = new Item();
		map.put("item",item);
		map.put("itemList",itemService.getAllItems());
		return "item";
	}
	
	@RequestMapping( value="/item.do" , method=RequestMethod.POST)
	public String doActions(@ModelAttribute Item item, BindingResult result, @RequestParam String action, Map < String, Object > map) {
		Item itemResult = new Item();
		switch(action.toLowerCase()) {
			case "add":
				itemService.add(item);
				itemResult = item;
				break;
			case "edit":
				itemService.edit(item);
				itemResult = item;
				break;
			case "delete":
				itemService.delete(item.getItemId());
				itemResult = new Item();
				break;
			case "search":
				Item serchedItem = itemService.getItem(item.getItemId());
				itemResult = serchedItem != null ? serchedItem : new Item();
				break;
		}
		map.put("item", itemResult);
		map.put("itemList", itemService.getAllItems());
		return "item";
	}

}
