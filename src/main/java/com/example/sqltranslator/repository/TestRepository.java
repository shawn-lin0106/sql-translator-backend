package com.example.sqltranslator.repository;

import com.example.sqltranslator.entity.TestEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestRepository extends BaseMapper<TestEntity> {

}