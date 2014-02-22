/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import Service.implementation.pro1;
import Service.prac1Imp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class conf1 {
    @Bean(name = "apple")
    public  prac1Imp getService()
    {
        return (prac1Imp) new pro1();
    }
    
    @Bean(name = "orange")
    public prac1Imp getService2()
    {
        return (prac1Imp) new pro1();
    }
    
}
