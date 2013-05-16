package com.goda5.hagendaz.common.util;

import java.math.BigDecimal;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class ShardCoinTest {
	private Logger LOGGER = LoggerFactory.getLogger(ShardCoinTest.class);
	private static final BigDecimal heightOf5Penny = new BigDecimal("0.1");
	private static final BigDecimal diameterOf5Penny = new BigDecimal("2");
	private static final BigDecimal shardHeight = new BigDecimal("3000000");
	private static final BigDecimal roomHeight = new BigDecimal("300");
	private static final BigDecimal roomWidth = new BigDecimal("300");
	private static final BigDecimal roomDepth = new BigDecimal("300");
	
	private BigDecimal volumnOfEach5Penny() {
		return heightOf5Penny.multiply(diameterOf5Penny).multiply(diameterOf5Penny);
	}
	
	private BigDecimal numOf5PsIfHeightIs(BigDecimal height) {
		return height.divide(heightOf5Penny);
	}
	
	private BigDecimal volumnOfTheRoom() {
		return roomHeight.multiply(roomDepth).multiply(roomWidth);
	}
	
	@Test
	public void shard5Pcoins() {
		BigDecimal volumnOf5PsOfShardHeight = volumnOfEach5Penny().multiply(numOf5PsIfHeightIs(shardHeight));
		LOGGER.debug("" + volumnOfTheRoom().doubleValue());
		LOGGER.debug("" + volumnOf5PsOfShardHeight.doubleValue());
		Assert.assertTrue(volumnOfTheRoom().compareTo(volumnOf5PsOfShardHeight) > 0);
	}
	
}
