package spring.springJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	@Autowired
	JdbcTemplate template;
	
	@Autowired
	NamedParameterJdbcTemplate namedTemplate;
	
	@Autowired
	SimpleJdbcInsert simpleInsert;
	
	public int studentRecordsCount() {
		int count = template.queryForObject("select count(*) from student", Integer.class);
		return count;
	}
	
	public String studentNameById(int id) {
		String name = template.queryForObject("select name from student where id=?", String.class, id);
		return name;
	}
	
	public Map<String,Object> studentDetailsById(int id){
		Map<String,Object> map = template.queryForMap("select id , name , age from student where id = ?", id);
		return map;
	}
	
	public List<Map<String,Object>> studentDetailsByAge(int age){
		List<Map<String,Object>> list = template.queryForList("select id,name,age from student where age= ?",age);
		return list;
	}
	
	public int deleteStudentsOnAgeIsNull() {
		int count = template.update("delete from student where age is null");
		return count;
	}
	
	public Student getStudentById(int id) {
		Student student = template.queryForObject("select id , name, age from student where id = ?",new StudentRowMapper(),id);
		return student;
	}
	
	class StudentRowMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setAge(rs.getInt(3));
			return student;
		}
		
	}
	
	
	public List<Student> getStudentsByAge(int age){
		List<Student> students = template.query("select id , name, age from student where age = ?",
				(rs)->{
					List<Student> list = new ArrayList<>();
					while(rs.next()) {
						Student s= new Student();
						s.setId(rs.getInt(1));
						s.setName(rs.getString(2));
						s.setAge(rs.getInt(3));
						list.add(s);
					}
					return list;
				},
				age);
		return students;
	}
	
	
	public String getStudentNameByIdUsingNPJT(int id) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("name",id);
		map.put("nam",id);
		String name = namedTemplate.queryForObject("select name from student where id=:nam", map, String.class);
		return name;
	}
	
	public String getStudentNameByIdUsingMSPS(int id) {
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("name", id);
		
		String name = namedTemplate.queryForObject("select name from student where id = :name", source, String.class);
		return name;
	}
	
	public int  insertStudentUsingBeanProperySqlParameterSource(Student student) {
		BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(student);
		
		int count = namedTemplate.update("insert into student values(:id,:name,:age)", source);
		return count;
	}
	
	public int insertStudentUsingSimpleJdbcInsert(Student student) {
		simpleInsert.setTableName("student");
		
//		Map<String,Object> map = new HashMap<>();
//		map.put("id", student.getId());
//		map.put("name", student.getName());
//		map.put("age", student.getAge());
		
		BeanPropertySqlParameterSource map= new BeanPropertySqlParameterSource(student);
		
		int count = simpleInsert.execute(map);
		return count;
	}
}
