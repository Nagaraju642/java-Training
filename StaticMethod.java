class StaticMethod
 {
	 static void myStaticMethod()
	 {
		 System.out.println("static Methods can be called without creating object");
	 }
		 public void myPublicMethod()
	 {
			 System.out.println("Public Method must be called by creating object");
	 }
			 public static void main(String[] args)
	 {
				 myStaticMethod();
				 StaticMethod d=new StaticMethod();
				 d.myPublicMethod();
 }
 }