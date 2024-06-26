package com.dao;

import com.entity.GuahaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuahaoView;

/**
 * 宠物挂号 Dao 接口
 *
 * @author 
 */
public interface GuahaoDao extends BaseMapper<GuahaoEntity> {

   List<GuahaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
