package com.wts.week01.test;

import java.io.IOException;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import com.wts.week01.dao.GoodsMapper;
import com.wts.week01.domain.Goods;


public class TestGoods {

	SqlSession session;
	GoodsMapper mapper;
	
	@Before
	public void before() throws IOException {
		Resources.getResourceAsProperties("mybatis.xml");
		mapper = session.getMapper(GoodsMapper.class);
	}
	
	@Test
	public void add() {
		Goods goods = new Goods(1, "鞋", "2012-12-12", 65, 0, 1, 1);
		mapper.add(goods);
		System.out.println("添加成功!");
		session.commit();
		session.close();
	}
	
	@Test
	public void delete() {
		int[] gids = {1};
		mapper.delMore(gids);
		System.out.println("删除成功!");
		session.commit();
		session.close();
	}
}
