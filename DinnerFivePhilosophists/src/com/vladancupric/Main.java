package com.vladancupric;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Filozof[] filozofi = new Filozof[5];
		Object[] viljuske = new Object[5];

		
		for(int i =0; i< viljuske.length;i++) {
			viljuske[i] = new Object();
		}
		for(int i=0; i<filozofi.length;i++) {
			Object levaViljuska = viljuske[i];
			Object desnaViljuska = viljuske[(i+1) % viljuske.length];
			if(i== filozofi.length-1){
				filozofi[i] = new Filozof(desnaViljuska,levaViljuska);
			}
			else{
				filozofi[i] = new Filozof(levaViljuska,desnaViljuska);
			}
		
		filozofi[i] = new Filozof(levaViljuska, desnaViljuska);
		Thread t = new Thread(filozofi[i], " filozof "+ (i+1));
		t.start();
		}
	}

}
