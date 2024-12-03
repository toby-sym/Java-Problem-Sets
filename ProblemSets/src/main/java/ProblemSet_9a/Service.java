	package ProblemSet_9a;
	
	public class Service {
		private String code;
		private String name;
		private VATRate rate;
		
		private final String codeValidation = "^[A-Z]{4}\\d{5}$";
		
		public Service(String code, String name, VATRate rate)
		{			
			if (name.equals(null) || !(code.matches(codeValidation)))
			{
				throw new IllegalArgumentException("Invalid Code Syntax");
			}

			this.code = code;
			this.name = name;
			this.rate = rate;
	
			
		}
		
		public String getCode()
		{
			return code;
		}
		
		public String getName()
		{
			return name;
		}
		
		public VATRate getRate()
		{
			return rate;
		}
		
	}
