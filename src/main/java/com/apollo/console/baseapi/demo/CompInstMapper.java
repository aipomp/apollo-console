package com.apollo.console.baseapi.demo;

import com.apollo.console.demo.bean.CompInst;

public interface CompInstMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMP_INST
     *
     * @mbggenerated Thu Apr 30 16:25:19 CST 2015
     */
    int deleteByPrimaryKey(Long compInstId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMP_INST
     *
     * @mbggenerated Thu Apr 30 16:25:19 CST 2015
     */
    int insert(CompInst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMP_INST
     *
     * @mbggenerated Thu Apr 30 16:25:19 CST 2015
     */
    int insertSelective(CompInst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMP_INST
     *
     * @mbggenerated Thu Apr 30 16:25:19 CST 2015
     */
    CompInst selectByPrimaryKey(Long compInstId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMP_INST
     *
     * @mbggenerated Thu Apr 30 16:25:19 CST 2015
     */
    int updateByPrimaryKeySelective(CompInst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COMP_INST
     *
     * @mbggenerated Thu Apr 30 16:25:19 CST 2015
     */
    int updateByPrimaryKey(CompInst record);
}