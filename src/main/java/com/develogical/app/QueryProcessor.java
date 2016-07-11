package com.develogical.app;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("APE")) {
            return "This course presents practical techniques for building software in an agile environment." + 
            		"We aim to minimise the time between the conception of an idea and its implementation in working software released to users. " +
            		"We aim to embrace the changes thrown at us by a continually changing market, and to mitigate the associated risks by using technical practices to ensure quality " +
            		"- of our software and of the processes that we use to develop it.";
        }
        return "";
    }
}
