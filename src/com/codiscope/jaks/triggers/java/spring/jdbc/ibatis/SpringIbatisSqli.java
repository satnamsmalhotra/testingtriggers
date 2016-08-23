package com.codiscope.jaks.triggers.java.spring.jdbc.ibatis;

import org.springframework.jdbc.support.SQLExceptionTranslator;
import org.springframework.orm.ibatis.SqlMapClientTemplate;

/**
 * The Class SpringIbatisSqli
 */
public class SpringIbatisSqli {

    public void possessiveTest() {

        final SqlMapClientTemplate template = new SqlMapClientTemplate();
        template.queryForList("queryForList");
        template.queryForObject("queryForObject");
        template.queryForMap("queryForMap", new Object(), "key");
        template.delete("DELETE");
        template.update("UPDATE");
        template.insert("INSERT");
    }

    public void negativeTest() {

        final SqlMapClientTemplate template = new SqlMapClientTemplate();
        final boolean lazyInit = template.isLazyInit();
        final SQLExceptionTranslator exceptionTranslator = template.getExceptionTranslator();
    }
}
