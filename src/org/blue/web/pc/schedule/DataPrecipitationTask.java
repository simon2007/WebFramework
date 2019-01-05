package org.blue.web.pc.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DataPrecipitationTask {
	
	@Scheduled(cron = "0 0 1 * * ?") 
    public void DealUpProductDate(){  
		
    } 
	
	@Scheduled(cron = "0 0 1 * * ?") 
    public void DealProductSaleDate(){  
		
    } 
}
