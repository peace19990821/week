package com.wts.week01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wts.week01.dao.GoodsMapper;
import com.wts.week01.domain.Brand;
import com.wts.week01.domain.Goods;
import com.wts.week01.domain.Gtype;
import com.wts.week01.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	GoodsMapper goodsMapper;

	@Override
	public List<Goods> getGoodsList(Goods goods) {
		return goodsMapper.getGoodsList(goods);
	}

	@Override
	public List<Gtype> getGtype() {
		return goodsMapper.getGtype();
	}

	@Override
	public List<Brand> getBrand() {
		return goodsMapper.getBrand();
	}

	@Override
	public void add(Goods goods) {
		goodsMapper.add(goods);
	}

	@Override
	public Goods look(Integer gid) {
		return goodsMapper.look(gid);
	}

	@Override
	public void delMore(int[] gids) {
		 goodsMapper.delMore(gids);
	}

	@Override
	public void update(Goods goods) {
		 goodsMapper.update(goods);
	}
}
