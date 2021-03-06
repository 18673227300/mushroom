package org.marker.mushroom.dao;


/**
 * 
 * @author marker
 * @version 1.0
 */
public interface UserGroupCategoryDao extends ISupportDao{


    /**
     * 批量保存关系
     * @param gid 组Id
     * @param cids 栏目ID
     */
    void batchSave(int gid, String[] cids);


    /**
     * 根据用户组删除关系
     * @param gid
     */
    public void deleteAllByGid(int gid);
}
