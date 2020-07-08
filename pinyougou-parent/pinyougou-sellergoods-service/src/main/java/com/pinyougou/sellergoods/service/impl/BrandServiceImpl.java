package com.pinyougou.sellergoods.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;
	
	@Override
	public List<TbBrand> findAll() {

	ArrayList<TbBrand> list = new ArrayList<>();
		TbBrand tbBrand = new TbBrand();
		tbBrand.setId(54L);
		tbBrand.setName("沈伟");
		tbBrand.setFirstChar("sad");
		list.add(tbBrand);
		return list;
		//return brandMapper.selectByExample(null);
	}

}
