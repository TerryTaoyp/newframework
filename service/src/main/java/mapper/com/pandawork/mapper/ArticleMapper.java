package com.pandawork.mapper;

import com.pandawork.common.entity.Article;
import org.apache.ibatis.annotations.Param;

/**
 * 文章信息管理Mapper层
 * Created by 石昊 on 2017/4/10.
 */
public interface ArticleMapper {
    /**
     * 添加文章信息
     * @param article
     * @throws Exception
     */
    public void newArticle(@Param("article")Article article)throws Exception;

    /**
     * 删除文章信息
     * @param aid
     * @return
     * @throws Exception
     */
    public boolean delById(@Param("id")int aid)throws Exception;

    /**
     * 更新文章信息
     * @param article
     * @throws Exception
     */
    public void update(@Param("article")Article article)throws Exception;

    /**
     * 根据ID查找文章
     * @param aid
     * @return
     * @throws Exception
     */
    public Article queryById(@Param("id")int aid)throws Exception;

    /**
     * 根据版块ID查找文章
     * @param pid
     * @return
     * @throws Exception
     */
    public Article queryByPlate(@Param("plateid")int pid)throws Exception;
}
