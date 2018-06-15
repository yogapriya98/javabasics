package com.java.lang;

public class ObjectExamples {
	int count;
	String desc;
	public ObjectExamples(){
	}	
	public ObjectExamples(int count,String desc) {
		this.count = count;
		this.desc  = desc;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof ObjectExamples) {
				ObjectExamples oe = (ObjectExamples)obj;
				if(count == oe.count && desc.equals(oe.desc)) {
					return true;
				}
			}
			return false;
		}
		return super.equals(obj);
	
	}
	// default overriden String method in eclipse
	@Override
	public String toString() {
		return "ObjectExamples [count=" + count + ", desc=" + desc + "]";
	}
	public static void main(String[] args) {
		ObjectExamples oe = new ObjectExamples(50,"String");
		System.out.println(oe);   // default calling of toString() method
		System.out.println(oe.hashCode()); //return value of obj
		Class cls = oe.getClass();
		 // (Or)                             //getClass()
		Class clss = ObjectExamples.class;
	}

}
