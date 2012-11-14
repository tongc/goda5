package com.goda5.hagendaz.data;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.test.context.ContextConfiguration;

import com.goda5.hagendaz.common.IntegrationTestBase;

@ContextConfiguration(locations = { "classpath:data.xml" })
public abstract class IntegrationTestBaseDao extends IntegrationTestBase {
	@Inject
	@Override
	public void setDataSource(final DataSource dataSource) {
		super.setDataSource(dataSource);
	}
}
