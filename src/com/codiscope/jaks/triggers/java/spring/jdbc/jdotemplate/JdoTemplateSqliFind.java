package com.codiscope.jaks.triggers.java.spring.jdbc.jdotemplate;

import org.springframework.orm.jdo.JdoTemplate;

/**
 * The Class JdoTemplateSqliFind
 */
public class JdoTemplateSqliFind {

    public void testFind() {

        JdoTemplate jt = new JdoTemplate();
        jt.find(JdoTemplateSqliFind.class);
    }
}
