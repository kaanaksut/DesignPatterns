package StrategyDesingPattern.Calisma1;

public class EsitAgirlikStratejisi implements SinavStratejisi{

	@Override
	public EnumDers getBirinci() {
		// TODO Auto-generated method stub
		return EnumDers.TURKCE;
	}

	@Override
	public EnumDers getIkıncı() {
		// TODO Auto-generated method stub
		return EnumDers.MATEMATIK;
	}

	@Override
	public EnumDers getUcuncu() {
		// TODO Auto-generated method stub
		return EnumDers.SOSYAL;
	}

	@Override
	public EnumDers getDorduncu() {
		// TODO Auto-generated method stub
		return EnumDers.FEN;
	}

}
