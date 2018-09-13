package collectionprogrammes;
import java.util.*;  

import java.util.ArrayList;
import java.util.List;



  class A{
	
	String booknm="hello";
	int bookpa=100;
	
	public A(String booknm,int bookpa)
	       {	
		
		this.booknm=booknm;
		this.bookpa=bookpa;
	
	                              }
}

	
	public class ArrayList2{
		
	
	
        public static void main(String[] args) {
		// TODO Auto-generated method stub
        	ArrayList<A> p= new ArrayList<A>();
        	A h= new A("hello",40);
        	A m= new A("hi",30);
        	
        	p.add(h);
        	p.add(m);
        	
        	for(A q:p)
        	{
        		System.out.println(q.booknm+""+q.bookpa);
        	}
        	/*Iterator itr=p.iterator();
        	
        	
        	while(itr.hasNext())
        	{
        		A q=(A)itr.next();
        		System.out.println(q.booknm+""+q.bookpa);
        		
        	}
        	*/
    
    		
    		
        		
			

	}

}
