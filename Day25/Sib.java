package Day25;

public class Sib {                                        // which block create with the help of static keyword this is asked in the interview
	static {                                              // answer is SIB
		System.out.println("SIB Execute1");
	}
	static {                                              // answer is SIB
		System.out.println("SIB Execute2");
	}
	static {                                              // answer is SIB
		System.out.println("SIB Execute3");
	}
	static {                                              // answer is SIB
		System.out.println("SIB Execute4");
	}static {                                              // answer is SIB order of execution is line by line
		System.out.println("SIB Execute5");
	}
	public static void main(String[] args) 

	{

		System.out.println("main method");

		

	}

	}
		
		
		
		
		
	
