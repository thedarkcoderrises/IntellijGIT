package com.maventest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        App a = new App();
        a.printJSONLg();

    }

void printJSONLg(){


    for (int i=0;i<20;i++){
        if(i/2==0){
            logger.debug("This is i ="+i);
        }else{
            logger.info("This is i ="+i);
//                if(i==12){

                    try {
                        throw new NullPointerException();
                    } catch (Exception e) {
                        logger.error(e,e);
                    }
//                }

        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    }

}
