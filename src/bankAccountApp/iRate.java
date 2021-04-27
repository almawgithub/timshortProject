package bankAccountApp;

public interface iRate {
	default double getRate()
	{
		return 2.5;
	}

}
