package com.codiscope.jaks.triggers.java.spring.jdbc.simplejdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import tests.sources.DatabaseSource;
import tests.sources.FileSource;
import tests.sources.PrivateSource;
import tests.sources.WebSource;
import tests.sources.WebSourceCookie;

/**
 * The Class JavaSpringJdbcSimplejdbctemplateSqli
 */
public class JavaSpringJdbcSimplejdbctemplateSqli {

    private WebSourceCookie webcookie = new WebSourceCookie();
    private DatabaseSource databasesource = new DatabaseSource();
    private FileSource filesource = new FileSource();
    private PrivateSource privatesource = new PrivateSource();
    private WebSource websource = new WebSource();

    public void test() {
        JdbcTemplate template = new JdbcTemplate();

        ResultSetExtractor rse = null;

        template.update(databasesource.method1());
        template.query(websource.method1(), rse);
    }
}
