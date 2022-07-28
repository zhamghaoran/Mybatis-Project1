package com.zhr.mybatis;

import com.zhr.mybatis.mapper.EmpMapper;
import com.zhr.mybatis.pojo.Emp;
import com.zhr.mybatis.pojo.EmpExample;
import com.zhr.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession intersession = SqlSessionUtils.intersession();
        EmpMapper mapper = intersession.getMapper(EmpMapper.class);
        // 查询所有数据
        // System.out.println(mapper.selectByExample(null).toString());
        EmpExample empExample = new EmpExample();
        // 创建条件对象 根据条件查询
//        empExample.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(20);
//        empExample.or().andSexEqualTo("男");
//        for (Emp emp : mapper.selectByExample(empExample)) {
//            System.out.println(emp.toString());
//        }
         // 测试普通修改
        Emp emp = new Emp(11,"smallA",null,"女",null,null);
        mapper.updateByPrimaryKey(emp);

    }
}
