package biz;

import java.util.List;

import entity.Grade;

public interface GradeBiz {
	public boolean addGrade(Grade grade); //添加学生成绩
	public boolean delGrade(int sno,int cno); //删除学生成绩
	public boolean updateGrade(int sno,int cno,String course_name,int grade,int b_grade); //更新学生成绩
	public List<Grade> queryGrades(); //查询所有学生成绩
	public List<Grade> queryGradeByName(String student_name); //查询指定名字的学生成绩
	public List<Grade> queryGradeBySno(int sno); //查询指定学号的学生成绩
	public List<Grade> queryGradeByClassroom(int classroom); //查询指定班级的学生成绩
	public List<Grade> queryGradeByMajor(String major); //查询指定专业的学生成绩
	public List<Grade> queryGradeByFaculty(String faculty); //查询指定学院的学生成绩
	public List<Grade> queryGradeByCno(int cno);
	

}
