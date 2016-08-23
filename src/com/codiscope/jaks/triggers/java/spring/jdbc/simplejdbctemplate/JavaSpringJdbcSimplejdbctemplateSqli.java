package com.codiscope.jaks.triggers.java.spring.jdbc.simplejdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.DelegatingDataSource;

import java.util.ArrayList;
import java.util.HashMap;

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

    public void possessiveTest() {

        SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(new DelegatingDataSource());
        jdbcTemplate.query("", new ParameterizedBeanPropertyRowMapper<Object>(), new HashMap<String, Object>());
        jdbcTemplate.update("", new HashMap<String, Object>());
        jdbcTemplate.batchUpdate("", new ArrayList<Object[]>());
    }

    public void negativeTest() {

        SimpleJdbcTemplate jdbcTemplate = new SimpleJdbcTemplate(new DelegatingDataSource());
        jdbcTemplate.queryForMap("", new HashMap<String, Object>());
        jdbcTemplate.queryForList("", new ArrayList<String>());
    }

    public void test() {
        JdbcTemplate template = new JdbcTemplate();

        ResultSetExtractor rse = null;

        template.update(databasesource.method1());
        template.query(websource.method1(), rse);
    }
}
