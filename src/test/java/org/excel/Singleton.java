package org.excel;



public class Singleton {
public static Singleton a ;
public static Singleton getobject() {
if (a==null) {
	int identityHashCode = System.identityHashCode(a);
	System.out.println(identityHashCode);
	a=new Singleton();
}
return a;
}
public static void main(String[] args) {
	Singleton getobject = getobject();
	int identityHashCode = System.identityHashCode(getobject);
	System.out.println(identityHashCode);
	Singleton getobject2 = getobject();
	int identityHashCode3 = System.identityHashCode(getobject2);
	System.out.println(identityHashCode3);
	
}
}
