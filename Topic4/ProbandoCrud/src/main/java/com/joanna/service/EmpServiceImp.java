package com.joanna.service;

import com.joanna.model.Empleado;
import com.joanna.repository.EmpRepository;
import org.hibernate.annotations.SQLDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class EmpServiceImp implements EmpService{
    JdbcTemplate template;

    @Autowired
    EmpRepository repo;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Empleado p){
        String sql="insert into Emp99(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";
        return template.update(sql);
    }

    public int update(Empleado p){
        String sql="update Emp99 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";
        return template.update(sql);
    }


    public int delete(int id){
        Empleado emp = repo.getEmpById(id);
        return emp;
    }
    public Empleado getEmpById(int id){
        Empleado emp = repo.getEmpById(id);
        //String sql="select * from Emp99 where id=?";
        //return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Empleado>(Empleado.class));
        return emp;
    }
    public List<Empleado> getEmployees(){
        /*return template.query("select * from Emp99",new RowMapper<Empleado>(){
            public Empleado mapRow(ResultSet rs, int row) throws SQLException {
                Empleado e=new Empleado();
                e.setId((long) rs.getInt(1));
                e.setName(rs.getString(2));
                e.setSalary(rs.getFloat(3));
                e.setDesignation(rs.getString(4));
                return e;
            }
        });*/
        return repo.getEmployees();
    }
}
