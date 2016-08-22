package com.codiscope.jaks.triggers.java.spring.jdbc.ibatis;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

/**
 * The Class SpringIbatisSqli
 */
public class SpringIbatisSqli {

    public void execute() {

        final SqlMapClientTemplate template = new SqlMapClientTemplate();
        template.queryForList("queryForList");
        template.queryForObject("queryForObject");
        template.queryForMap("queryForMap", new Object(), "key");
        template.delete("DELETE");
        template.update("UPDATE");
        template.insert("INSERT");
    }
}
