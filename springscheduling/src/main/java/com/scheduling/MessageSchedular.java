package com.scheduling;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageSchedular {

//	@Scheduled(fixedDelay = 2000)
	public void messageSchedular() {
		System.out.println("scheduled task    :" + LocalDateTime.now());
	}

//	@Scheduled(fixedRate  = 2000)
	public void messageSchedular1() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("scheduled task    :" + LocalDateTime.now());
	}

//	@Scheduled(initialDelay = 10000, fixedRate = 3000)
	public void messageSchedular2() {
		System.out.println("scheduled task    :" + LocalDateTime.now());
	}

	@Scheduled(cron = "0 * * * * *")
	public void runTask() {
		System.out.println("Task triggered at: " + new Date());
	}
}
