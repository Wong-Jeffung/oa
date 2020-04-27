package com.pointlion.mvc.common.model;


import com.jfinal.aop.Before;
import com.jfinal.plugin.activerecord.tx.Tx;
import com.pointlion.mvc.common.model.base.BaseOaApplyLeave;

@SuppressWarnings("serial")
public class OaApplyLeave  extends BaseOaApplyLeave<OaApplyLeave>{
    public static final OaApplyLeave dao = new OaApplyLeave();
    public static final String tableName = "oa_apply_leave";

    /***
     * 根据主键查询
     */
    public OaApplyLeave getById(String id){
        return OaApplyLeave.dao.findById(id);
    }

    /***
     * 删除
     * @param ids
     */
    @Before(Tx.class)
    public void deleteByIds(String ids){
        String idarr[] = ids.split(",");
        for(String id : idarr){
            OaApplyLeave o = OaApplyLeave.dao.getById(id);
            o.delete();
        }
    }
}
