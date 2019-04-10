package nase_klase;

public class C extends A 
{
	public C(int k, int u)
	{
		super(k); // poziva se konstruktor nadklase A sa jednim brojem
		System.out.println("Kreiranje objekat klase C " + k + " "+ u);
	 	
	}

}
