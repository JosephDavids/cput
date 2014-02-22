/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import Service.Compare;
import Service.implementation.CompareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */
@Configuration
public class CompareConfig 
{
    @Bean (name ="ItsTheSame")
    public Compare callImpl()
    {
        return (Compare) new CompareImpl();
    }
    
}
