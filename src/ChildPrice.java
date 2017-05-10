/*
 * ChildPrice.java
 *
 * created at 10.05.2017 by Simon Gerhardt, s.gerhardt@seeburger.de
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

public class ChildPrice implements Price {
	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}
}
