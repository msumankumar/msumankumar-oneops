/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmUpdateCiAttribute extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -670055720;

    /**
     * The parameter <code>kloopzcm.cm_update_ci_attribute.p_ci_attr_id</code>.
     */
    public static final Parameter<Long> P_CI_ATTR_ID = createParameter("p_ci_attr_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_ci_attribute.p_df_value</code>.
     */
    public static final Parameter<String> P_DF_VALUE = createParameter("p_df_value", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_ci_attribute.p_dj_value</code>.
     */
    public static final Parameter<String> P_DJ_VALUE = createParameter("p_dj_value", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_ci_attribute.p_owner</code>.
     */
    public static final Parameter<String> P_OWNER = createParameter("p_owner", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.cm_update_ci_attribute.p_comments</code>.
     */
    public static final Parameter<String> P_COMMENTS = createParameter("p_comments", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public CmUpdateCiAttribute() {
        super("cm_update_ci_attribute", Kloopzcm.KLOOPZCM);

        addInParameter(P_CI_ATTR_ID);
        addInParameter(P_DF_VALUE);
        addInParameter(P_DJ_VALUE);
        addInParameter(P_OWNER);
        addInParameter(P_COMMENTS);
    }

    /**
     * Set the <code>p_ci_attr_id</code> parameter IN value to the routine
     */
    public void setPCiAttrId(Long value) {
        setValue(P_CI_ATTR_ID, value);
    }

    /**
     * Set the <code>p_df_value</code> parameter IN value to the routine
     */
    public void setPDfValue(String value) {
        setValue(P_DF_VALUE, value);
    }

    /**
     * Set the <code>p_dj_value</code> parameter IN value to the routine
     */
    public void setPDjValue(String value) {
        setValue(P_DJ_VALUE, value);
    }

    /**
     * Set the <code>p_owner</code> parameter IN value to the routine
     */
    public void setPOwner(String value) {
        setValue(P_OWNER, value);
    }

    /**
     * Set the <code>p_comments</code> parameter IN value to the routine
     */
    public void setPComments(String value) {
        setValue(P_COMMENTS, value);
    }
}
