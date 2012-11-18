package com.taskmanager

class Role {

	String authority
	String name
	
	static mapping = {
		cache true
	}

	static constraints = {
		authority blank: false, unique: true
	}
	String toString(){
		name
	 }
}
