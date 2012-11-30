package com.goda5.hagendaz.common;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.filters.FilterPackageInfo;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.PojoValidator;
import com.openpojo.validation.affirm.Affirm;
import com.openpojo.validation.rule.impl.NoNestedClassRule;
import com.openpojo.validation.rule.impl.NoPrimitivesRule;
import com.openpojo.validation.rule.impl.NoStaticExceptFinalRule;
import com.openpojo.validation.test.impl.DefaultValuesNullTester;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;

public class PojoTest {
    // Configured for expectation, so we know when a class gets added or removed.
    private static final int EXPECTED_CLASS_COUNT = 9;
    // The package to test
    private static final String POJO_PACKAGE = "com.goda5.hagendaz.common.domain";

    private List<PojoClass> pojoClasses;
    private PojoValidator pojoValidator;

    @BeforeMethod
    public void setup() {
        pojoClasses = PojoClassFactory.getPojoClasses(POJO_PACKAGE, new FilterPackageInfo());

        pojoValidator = new PojoValidator();

        // Create Rules to validate structure for POJO_PACKAGE
        //pojoValidator.addRule(new NoPublicFieldsRule());
        pojoValidator.addRule(new NoPrimitivesRule());
        pojoValidator.addRule(new NoStaticExceptFinalRule());
        //pojoValidator.addRule(new GetterMustExistRule());
        //pojoValidator.addRule(new SetterMustExistRule());
        pojoValidator.addRule(new NoNestedClassRule());
        //pojoValidator.addRule(new BusinessKeyMustExistRule());

        // Create Testers to validate behaviour for POJO_PACKAGE
        pojoValidator.addTester(new DefaultValuesNullTester());
        pojoValidator.addTester(new SetterTester());
        pojoValidator.addTester(new GetterTester());
        //pojoValidator.addTester(new BusinessIdentityTester());
    }

    @Test
    public void ensureExpectedPojoCount() {
        Affirm.affirmEquals("Classes added / removed?", EXPECTED_CLASS_COUNT, pojoClasses.size());
    }

    @Test
    public void testPojoStructureAndBehavior() {
        for (final PojoClass pojoClass : pojoClasses) {
            pojoValidator.runValidation(pojoClass);
        }
    }
}