 public class RSA{
	public static void main(String[] args){
		int p,q,n,pn;
		
		p=53;q=61;
		n=p*q;
		pn=(p-1)*(q-1);
	
		//int e=pn/2;
		
		//if(e%2==0)
		//	e=e+1;
		
		int e = 59;
		
		System.out.println(" n : " + n + "  e : " + e + " pn : " + pn);
		int d=inverse(e,n);
		
		d=d % pn;
		System.out.println("d : " + d);
	}
	public static int inverse(int e,int n){
		int q;
		int r;
		int t1=0,t2=1,t;
		
		while(n!=1){
			q=n/e;
			r=n%e;
			t=t1-(t2*q);
			System.out.println("" + q + " \t" + n + " \t" + e + " \t" + r + " \t" + t1 + " \t" + t2 + " \t" + t);
			t1=t2;
			t2=t;
			n=e;
			e=r;
		}
		
		if(t1 < 0)
			t1=n-t1;
		return t1;
	}
 }