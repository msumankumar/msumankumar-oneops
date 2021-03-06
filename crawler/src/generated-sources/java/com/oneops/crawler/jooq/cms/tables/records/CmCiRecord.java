/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables.records;


import com.oneops.crawler.jooq.cms.tables.CmCi;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CmCiRecord extends UpdatableRecordImpl<CmCiRecord> implements Record12<Long, Long, Integer, String, String, String, Integer, Long, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -358970992;

    /**
     * Setter for <code>kloopzcm.cm_ci.ci_id</code>.
     */
    public void setCiId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.ci_id</code>.
     */
    public Long getCiId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.ns_id</code>.
     */
    public void setNsId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.ns_id</code>.
     */
    public Long getNsId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.class_id</code>.
     */
    public void setClassId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.class_id</code>.
     */
    public Integer getClassId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.ci_name</code>.
     */
    public void setCiName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.ci_name</code>.
     */
    public String getCiName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.ci_goid</code>.
     */
    public void setCiGoid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.ci_goid</code>.
     */
    public String getCiGoid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.comments</code>.
     */
    public void setComments(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.comments</code>.
     */
    public String getComments() {
        return (String) get(5);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.ci_state_id</code>.
     */
    public void setCiStateId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.ci_state_id</code>.
     */
    public Integer getCiStateId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.last_applied_rfc_id</code>.
     */
    public void setLastAppliedRfcId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.last_applied_rfc_id</code>.
     */
    public Long getLastAppliedRfcId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.created_by</code>.
     */
    public void setCreatedBy(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.created_by</code>.
     */
    public String getCreatedBy() {
        return (String) get(8);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.updated_by</code>.
     */
    public void setUpdatedBy(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.updated_by</code>.
     */
    public String getUpdatedBy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, Integer, String, String, String, Integer, Long, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, Integer, String, String, String, Integer, Long, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return CmCi.CM_CI.CI_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return CmCi.CM_CI.NS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CmCi.CM_CI.CLASS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CmCi.CM_CI.CI_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CmCi.CM_CI.CI_GOID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CmCi.CM_CI.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CmCi.CM_CI.CI_STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return CmCi.CM_CI.LAST_APPLIED_RFC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return CmCi.CM_CI.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return CmCi.CM_CI.UPDATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return CmCi.CM_CI.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return CmCi.CM_CI.UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getCiId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getNsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCiName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCiGoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getCiStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getLastAppliedRfcId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getCiId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getNsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getClassId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCiName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCiGoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCiStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getLastAppliedRfcId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUpdatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value1(Long value) {
        setCiId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value2(Long value) {
        setNsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value3(Integer value) {
        setClassId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value4(String value) {
        setCiName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value5(String value) {
        setCiGoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value6(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value7(Integer value) {
        setCiStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value8(Long value) {
        setLastAppliedRfcId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value9(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value10(String value) {
        setUpdatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value11(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord value12(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiRecord values(Long value1, Long value2, Integer value3, String value4, String value5, String value6, Integer value7, Long value8, String value9, String value10, Timestamp value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CmCiRecord
     */
    public CmCiRecord() {
        super(CmCi.CM_CI);
    }

    /**
     * Create a detached, initialised CmCiRecord
     */
    public CmCiRecord(Long ciId, Long nsId, Integer classId, String ciName, String ciGoid, String comments, Integer ciStateId, Long lastAppliedRfcId, String createdBy, String updatedBy, Timestamp created, Timestamp updated) {
        super(CmCi.CM_CI);

        set(0, ciId);
        set(1, nsId);
        set(2, classId);
        set(3, ciName);
        set(4, ciGoid);
        set(5, comments);
        set(6, ciStateId);
        set(7, lastAppliedRfcId);
        set(8, createdBy);
        set(9, updatedBy);
        set(10, created);
        set(11, updated);
    }
}
