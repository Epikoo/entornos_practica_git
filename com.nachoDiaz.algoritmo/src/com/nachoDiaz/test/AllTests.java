package com.nachoDiaz.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestAlgoritmo.class, TestPotencia.class })
public class AllTests {

}
