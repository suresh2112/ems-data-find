package com.createiq.sms.queries;

public interface StudentQueries {
	public String student_query_insert="insert into student(sid,name,fee)values(?,?,?)";
	public String student_query_findall="select * from student";
	public String student_query_delete="delete from student where sid=?";
	public String student_query_update="update student set sname=?,sfee=? where sid=?";
	public String student_query_find_byid="select * from student where sid=?";
	
	

}
