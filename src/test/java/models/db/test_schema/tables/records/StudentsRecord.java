/*
 * This file is generated by jOOQ.
 */
package models.db.test_schema.tables.records;


import models.db.test_schema.tables.Students;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentsRecord extends TableRecordImpl<StudentsRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>test_schema.students.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>test_schema.students.student_id</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>test_schema.students.student_name</code>.
     */
    public void setStudentName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test_schema.students.student_name</code>.
     */
    public String getStudentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test_schema.students.faculty</code>.
     */
    public void setFaculty(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test_schema.students.faculty</code>.
     */
    public String getFaculty() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Students.STUDENTS.STUDENT_ID;
    }

    @Override
    public Field<String> field2() {
        return Students.STUDENTS.STUDENT_NAME;
    }

    @Override
    public Field<String> field3() {
        return Students.STUDENTS.FACULTY;
    }

    @Override
    public Integer component1() {
        return getStudentId();
    }

    @Override
    public String component2() {
        return getStudentName();
    }

    @Override
    public String component3() {
        return getFaculty();
    }

    @Override
    public Integer value1() {
        return getStudentId();
    }

    @Override
    public String value2() {
        return getStudentName();
    }

    @Override
    public String value3() {
        return getFaculty();
    }

    @Override
    public StudentsRecord value1(Integer value) {
        setStudentId(value);
        return this;
    }

    @Override
    public StudentsRecord value2(String value) {
        setStudentName(value);
        return this;
    }

    @Override
    public StudentsRecord value3(String value) {
        setFaculty(value);
        return this;
    }

    @Override
    public StudentsRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentsRecord
     */
    public StudentsRecord() {
        super(Students.STUDENTS);
    }

    /**
     * Create a detached, initialised StudentsRecord
     */
    public StudentsRecord(Integer studentId, String studentName, String faculty) {
        super(Students.STUDENTS);

        setStudentId(studentId);
        setStudentName(studentName);
        setFaculty(faculty);
    }
}