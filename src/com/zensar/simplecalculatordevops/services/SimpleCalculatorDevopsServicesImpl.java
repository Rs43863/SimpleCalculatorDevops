package com.zensar.simplecalculatordevops.services;

public class SimpleCalculatorDevopsServicesImpl implements SimpleCalculatorDevopsServices{

	@Override
	public Double add(Double firstNo, Double secondNo) {
		System.out.println(firstNo+secondNo);
		return (firstNo+secondNo);
	}

	@Override
	public Double minus(Double firstNo, Double secondNo) {
		return (firstNo-secondNo);
	}

	@Override
	public Double multiply(Double firstNo, Double secondNo) {
		// TODO Auto-generated method stub
		return (firstNo*secondNo);
	}

	@Override
	public Double divide(Double firstNo, Double secondNo) {
		// TODO Auto-generated method stub
		return (firstNo/secondNo);
	}

	@Override
	public Double percentage(Double firstNo, Double secondNo) {
		Double per=firstNo/secondNo;
		return (per*100);
	}
	@Override
	public Double square(Double firstNo) {
		return (firstNo*firstNo);
	}

	@Override
	public Double inverse(Double firstNo) {
		// TODO Auto-generated method stub
		return (1/firstNo);
	}

	@Override
	public Double squareRoot(Double firstNo) {
		// TODO Auto-generated method stub
		return (Math.sqrt(firstNo));
	}

}
