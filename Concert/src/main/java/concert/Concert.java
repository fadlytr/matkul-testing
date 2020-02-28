/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concert;

import java.io.PrintStream;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Fadly TR
 */
public class Concert {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Audience.xml");
//        Audience audience = ctx.getBean("audience", Audience.class);
//        Performance performance = ctx.getBean("performance", Performance.class);
//        performance.perform();
        ImplementPerformance ip = ctx.getBean("impe", ImplementPerformance.class);
        ip.perform();
    }
}
