package com.codiscope.jaks.triggers.java.spring.jdbc.jdotemplate;

import org.springframework.orm.jdo.JdoTemplate;

import java.util.Collection;

/**
 * The Class JdoTemplateSqliFind
 */
public class JdoTemplateSqliFind {

    public void possessiveTest() {

        JdoTemplate jt = new JdoTemplate();
        final Collection<JdoTemplateSqliFind> jdoTemplateSqliFinds = jt.find(JdoTemplateSqliFind.class);
        final Collection<JdoTemplateSqliFind> byNamedQuery = jt.findByNamedQuery(JdoTemplateSqliFind.class, "");
        final Collection collection = jt.find("");
    }

    public void negativeTest() {

        JdoTemplate jt = new JdoTemplate();
        jt.deletePersistent(new Object());
    }
}
