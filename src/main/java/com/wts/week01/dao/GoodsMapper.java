package com.wts.week01.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wts.week01.domain.Brand;
import com.wts.week01.domain.Goods;
import com.wts.week01.domain.Gtype;

public interface GoodsMapper {

	List<Goods> getGoodsList(Goods goods);

	List<Gtype> getGtype();

	List<Brand> getBrand();

	void add(Goods goods);

	Goods look(@Param("gid")Integer gid);

	void delMore(@Param("gids")int[] gids);

	void update(Goods goods);

}
