--创建员工表格
CREATE TABLE 'Employee'{
    'user_id' bigint(20) NOT NULL AUTO_INCREMENT COMMENT'员工号',
    'name' varchar(20) NOT NULL COMMENT'姓名',
    'introduce' varchar(50) NOT NULL COMMENT'简介',
    'department' varchar(10) NOT NULL COMMENT'部门',
    'post' varchar(10) NOT NULL COMMENT'岗位',
    'wages' int NOT NULL COMMENT'工资',
    'performance' varchar (80) COMMENT'绩效说明',
    'totalWages' varchar (12)
    PRIMARY KEY ("user_id")
}ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='员工表格';

--创建登陆表格
CREATE TABLE 'Login'{
    'user_id' bigint(20) NOT NULL AUTO_INCREMENT COMMENT'员工号',
    'password' varchar(18) NOT NULL COMMENT'密码',
    PRIMARY KEY ("user_id")
}ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账号密码表';

--创建部门表格
CREATE TABLE 'Post'{
    'PostNumber' int (10) NOT NULL AUTO_INCREMENT COMMENT'岗位编号',
    'department' varchar (10) NOT NULL COMMENT'部门',
    'post' varchar (10) NOT NULL COMMENT'岗位',
    PRIMARY KEY ('PostNumber')
}ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='岗位表格';