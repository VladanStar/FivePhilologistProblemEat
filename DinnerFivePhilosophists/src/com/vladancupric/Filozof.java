package com.vladancupric;

public class Filozof implements Runnable{
	
	private final Object levaViljuska;
	private final Object desnaViljuska;
	
	
	public Filozof(Object levaViljuska, Object desnaViljuska) {
		super();
		this.levaViljuska = levaViljuska;
		this.desnaViljuska = desnaViljuska;
	}
	private void izvrsiAkciju(String akcija) {
		System.out.println(Thread.currentThread().getName() + " " + "akcija");
		try {
			Thread.sleep((int)Math.random()*100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while(true) {
			izvrsiAkciju(System.nanoTime()+  " filozof razmislja");
			synchronized (levaViljuska) {
				izvrsiAkciju(System.nanoTime() + " uzmi levu viljusku");
			synchronized (desnaViljuska) {
			izvrsiAkciju(System.nanoTime()+ " uzmi desnu viljuslu");
			izvrsiAkciju(System.nanoTime() + " spusti desnu viljusku");
			}
			izvrsiAkciju(System.nanoTime() + " spusta levu viljusku i ponovo razmislja");
			}
		
		}
	 
	
		
		}
}
