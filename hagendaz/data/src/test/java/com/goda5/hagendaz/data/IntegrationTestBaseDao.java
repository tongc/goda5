package com.goda5.hagendaz.data;

import javax.inject.Inject;

import javax.sql.DataSource;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;


@ActiveProfiles("local")
@ContextConfiguration(locations = { "classpath:data.xml" })
public abstract class IntegrationTestBaseDao extends AbstractTransactionalTestNGSpringContextTests {
	@Inject
	@Override
	public void setDataSource(final DataSource dataSource) {
		super.setDataSource(dataSource);
	}
}
