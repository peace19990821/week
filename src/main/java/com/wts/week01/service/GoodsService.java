package com.wts.week01.service;

import java.util.List;

import com.wts.week01.domain.Brand;
import com.wts.week01.domain.Goods;
import com.wts.week01.domain.Gtype;

public interface GoodsService {

	List<Goods> getGoodsList(Goods goods);

	List<Gtype> getGtype();

	List<Brand> getBrand();

	void add(Goods goods);

	Goods look(Integer gid);

	void delMore(int[] gids);

	void update(Goods goods);

}
