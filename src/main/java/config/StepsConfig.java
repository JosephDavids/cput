/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import Service.Steps;
import Service.implementation.StepsImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */

@Configuration
public class StepsConfig {
    @Bean(name= "stepsBean")
    
    public Steps stepsConfig()
    {
        return new StepsImp();
    }
    
}

