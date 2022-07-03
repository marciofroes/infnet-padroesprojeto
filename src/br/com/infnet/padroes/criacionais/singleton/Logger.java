package br.com.infnet.padroes.criacionais.singleton;

public class Logger {

	private static Logger instance;
	
	private Logger() {
	}

	
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void printLog(String msg) {
		System.out.println(msg);
	}
	
}
