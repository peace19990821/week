package com.wts.week01.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wts.week01.domain.Brand;
import com.wts.week01.domain.Goods;
import com.wts.week01.domain.Gtype;
import com.wts.week01.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	/**
	 * @Title: getGoodsList 
	 * @Description: 列表
	 * @param model
	 * @param pageNum
	 * @param goods
	 * @return
	 * @return: String
	 */
	@RequestMapping("selList")
	public String getGoodsList(Model model,@RequestParam(defaultValue="1")int pageNum,Goods goods) {
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = goodsService.getGoodsList(goods);
		PageInfo<Goods> info = new PageInfo<>(list);
		model.addAttribute("pg",info);
		return "select";
	}
	
	// 去添加
	@RequestMapping("toAdd")
	public String toAdd(Model model) {
		List<Gtype> types = goodsService.getGtype();
		List<Brand> brands = goodsService.getBrand();
		model.addAttribute("types", types);
		model.addAttribute("brands", brands);
		model.addAttribute("goods", new Goods());
		return "add";
	}
	
	// 添加
	@RequestMapping("add")
	public String add(Goods goods) {
		goodsService.add(goods);
		return "redirect:selList";
	}
	
	// 详情
	@RequestMapping("look")
	public String look(Integer gid,Model model) {
		Goods goods =  goodsService.look(gid);
		List<Gtype> types = goodsService.getGtype();
		List<Brand> brands = goodsService.getBrand();
		model.addAttribute("types", types);
		model.addAttribute("brands", brands);
		model.addAttribute("goods",goods);
		return "look";
	}
	
	// 批删
	@RequestMapping("delMore")
	public String delMore(int[] gids) {
		goodsService.delMore(gids);
		return "redirect:selList";
	}
	
	// 去修改
	@RequestMapping("toUpdate")
	public String toUpdate(Integer gid,Model model) {
		List<Gtype> types = goodsService.getGtype();
		List<Brand> brands = goodsService.getBrand();
		Goods goods =  goodsService.look(gid);
		model.addAttribute("types", types);
		model.addAttribute("brands", brands);
		model.addAttribute("goods",goods);
		return "update";
	}
	
	// 修改
	@RequestMapping("update")
	public String update(Goods goods) {
		goodsService.update(goods);
		return "redirect:selList";
	}
}
