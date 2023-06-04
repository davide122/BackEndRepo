package com.example.Run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Repository.Cittarepo;
import com.example.Repository.Edificiorepo;
import com.example.Repository.Postazionerepo;
@Component
public class Apprunner implements CommandLineRunner{
@Autowired
Cittarepo cittarepo;
	
@Autowired
Edificiorepo edificiorepo;

@Autowired 
Postazionerepo postazionerepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
