package td3.p3;

public  class VariablesSymbolique implements ExpressionSymbolique {
	protected String value ;
	
	public VariablesSymbolique(String value) {
		super();
		this.value = value;
	}
	
	
	public ExpressionSymbolique simplifie() {
	
		return null;
	}

	@Override
	public String afficher() {
		return this.value;
	}

	@Override
	public String calculer1() {
		// TODO Auto-generated method stub
		return this.value;
	}


	@Override
	public double calculer() {
		// TODO Auto-generated method stub
		return 0;
	}

	


	

}
