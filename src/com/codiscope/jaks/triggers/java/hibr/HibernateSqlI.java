package com.codiscope.jaks.triggers.java.hibr;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import tests.sources.PrivateSource;

public  class HibernateSqlI {

    private PrivateSource privateSource = new PrivateSource();

    private void createQuery(){

        String source = privateSource.method1();
        Session session = null;
        session.createFilter(source, source);
        session.delete(source);
        session.delete(source, source);
        Query query = session.createQuery(source);

        query.iterate();
        session.find(source);
    }


    private void createFilter(){
        String source = privateSource.method1();
        Session session =null;
        session.createFilter(source,source);
    }

}
