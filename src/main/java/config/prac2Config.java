/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import Service.implementation.prac2Impl;
import Service.prac2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration 
public class prac2Config 
{
    @Bean(name = "notAgame")
    public prac2 getService()
    {
        return (prac2) new prac2Impl();
    }
    
}
