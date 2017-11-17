package com.gsccs.sme.plat.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.sme.api.domain.CooperTask;
import com.gsccs.sme.plat.task.model.CooperTaskExample;

public interface CooperTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int countByExample(CooperTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int deleteByExample(CooperTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int insert(CooperTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int insertSelective(CooperTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    List<CooperTask> selectByExample(CooperTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    CooperTask selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int updateByExampleSelective(@Param("record") CooperTask record, @Param("example") CooperTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int updateByExample(@Param("record") CooperTask record, @Param("example") CooperTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int updateByPrimaryKeySelective(CooperTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_coopertask
     *
     * @mbggenerated Sat Jul 16 17:04:25 CST 2016
     */
    int updateByPrimaryKey(CooperTask record);
}