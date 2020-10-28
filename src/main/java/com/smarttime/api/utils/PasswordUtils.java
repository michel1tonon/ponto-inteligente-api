package com.smarttime.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
		
	}
	
	/**
	 * Gera uma senha utilizando o BCrypt.
	 * 
	 * @param senha
	 * @return String
	 * 
	 * */
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return null;
		}
		
		log.info("Gerando hash com o BCrypt");
		BCryptPasswordEncoder bCEncoder = new BCryptPasswordEncoder();
		return bCEncoder.encode(senha);
	}
}
