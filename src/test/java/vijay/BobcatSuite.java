package vijay;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.concurrent.ConcurrentSuite;

import vijay.GuiceModule;

@Modules(GuiceModule.class)
@RunWith(ConcurrentSuite.class)
@Suite.SuiteClasses({WikipediaTest.class})
public class BobcatSuite {

}
