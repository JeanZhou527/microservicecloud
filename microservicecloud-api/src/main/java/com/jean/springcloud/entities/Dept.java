package com.jean.springcloud.entities;

import java.io.Serializable;


//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@SuppressWarnings("serial")
@NoArgsConstructor   //需要导入无参构造函数
//@AllArgsConstructor  //需要导入有参构造函数
@Data                  //需要导入getset
@Accessors(chain=true) //需要链式访问
public class Dept implements Serializable{  //做微服务必须实现这个系列化接口  
	
	private Long    deptno;
	private String  dname;
	private String  db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
		
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
}
