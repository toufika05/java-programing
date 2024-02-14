package com.theone.toufika;

//========= object Utilization layer=======/////
interface JDBC{
	void insertData();
	void fetchData();
}
//========object creation layer======//////
class ConnectionManager{
	static JDBC getConnection(String type){
		if(type.equals("Oracle")){
			return new Oracle();
		}
		else if(type.equals("MySQL")){
			return new MySQL();
		}
		else{
			return null;
		}
	}
}
//======implementation layer======/////
class Oracle implements JDBC{
	public void insertData(){
		System.out.println("Data insert into Oracle DataBase");
	}
	public void fetchData(){
		System.out.println("Data fetch from oracle DataBase");
	}
}
class MySQL implements JDBC{
	public void insertData(){
		System.out.println("Data insert into MySQL DataBase");
	}
	public void fetchData(){
		System.out.println("Data fetch from MySQL DataBase");
	}
}
class LooseCoupling{ //app
	public static void main(String[] args) {
		JDBC jd=ConnectionManager.getConnection("MySQL");//new Oracle();
		jd.insertData();
		jd.fetchData();
		
	}
}          