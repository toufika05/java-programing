package com.theone.toufika;

///////composition with static reference variable variable////

class  Brain{
String human;
Brain(String human){
  this.human=human;
}
void visual(String s){
	System.out.println(human+" is thinking he will "+ s);
}
}
class Thought{
String tName;
static Brain b;////static reference variables
Thought(String tName){
	this.tName=tName;
}
void printThought(String s){
	b.visual(s);
	System.out.println(tName+" in this human's mind");
}
}
class HasaRelationship{
public static void main(String[] args) {
	 Brain ba=new Brain("Raj");
	 Thought.b=ba;

	 Thought t1=new Thought("Creative thinking");
	 t1.printThought(" making a painting");
	 System.out.println();

	 Thought t2=new Thought("Logical thinking");
	 t2.printThought(" going to solve a problem ");

	
}
}
