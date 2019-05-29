package com.softechsol.springaop.product;

public class ProductServiceImplementation implements ProductService {

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

}
