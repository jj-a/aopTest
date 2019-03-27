package kr.co.aoptest.part1;

public aspect Advice {
	
	pointcut callsay(): call(* Test.say(..));
	
	before(): callsay(){
		System.out.println("하이");
	}
	
}
