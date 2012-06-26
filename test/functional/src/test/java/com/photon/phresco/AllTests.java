/*package com.photon.phresco;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AccessoriesTest.class,  AudioDeviceTest.class,
		CameraTest.class, ComputerTest.class, MobileTest.class,
		MoviesTest.class, Mp3Test.class, RegisterTest.class, TabletTest.class,
		TelevisionTest.class, VideogamesTest.class })
public class AllTests {

}*/
package com.photon.phresco;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		
		// $JUnit-BEGIN$
		suite.addTestSuite(Registertest.class);
		suite.addTestSuite(TelevisionTest.class);
		suite.addTestSuite(ComputerTest.class);
		suite.addTestSuite(MobileTest.class);
		suite.addTestSuite(AudioDeviceTest.class);
		suite.addTestSuite(CameraTest.class);
		suite.addTestSuite(TabletTest.class);
		suite.addTestSuite(MoviesTest.class);
		suite.addTestSuite(VideogamesTest.class);
		suite.addTestSuite(Mp3Test.class);
		suite.addTestSuite(AccessoriesTest.class);
		// $JUnit-END$
		
		
		return suite;
	}
	

}

