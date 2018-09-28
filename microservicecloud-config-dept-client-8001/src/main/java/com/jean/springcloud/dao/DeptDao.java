package com.jean.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jean.springcloud.entities.Dept;

@Mapper //不要忘记了这个注解
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
