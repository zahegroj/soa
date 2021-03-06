package opensoa.drools.tests;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import opensoa.drools.hellodrools.Person;
import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.compiler.DrlParser;
import org.drools.compiler.DroolsParserException;
import org.drools.compiler.PackageBuilder;
import org.drools.compiler.PackageBuilderConfiguration;
import org.drools.lang.descr.PackageDescr;
import org.drools.rule.Package;
import org.drools.runtime.rule.Activation;
import org.drools.runtime.rule.FactHandle;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Test11_2 extends TestCase {

	
    protected RuleBase getRuleBase() throws Exception {
        return RuleBaseFactory.newRuleBase( RuleBase.RETEOO,
                                            null );
    }


	private RuleBase loadRuleBase(final Reader reader) throws IOException,
			DroolsParserException, Exception {
		return loadRuleBase(reader, new PackageBuilderConfiguration());
	}

	private RuleBase loadRuleBase(final Reader reader,
			final PackageBuilderConfiguration conf) throws IOException,
			DroolsParserException, Exception {
		
		final DrlParser parser = new DrlParser();
		final PackageDescr packageDescr = parser.parse(reader);
		if (parser.hasErrors()) {
			System.out.println(parser.getErrors());
			Assert.fail("Error messages in parser, need to sort this our (or else collect error messages)");
		}
		// pre build the package
		final PackageBuilder builder = new PackageBuilder(conf);
		builder.addPackage(packageDescr);
		final Package pkg = builder.getPackage();

		// add the package to a rulebase
		RuleBase ruleBase = getRuleBase();
		ruleBase.addPackage(pkg);

		return ruleBase;
	}

	public void testHelloWorld() throws Exception {
		
		final Reader reader = new InputStreamReader(getClass()
				.getResourceAsStream("/HelloDrools.drl"));
		
		final RuleBase ruleBase = loadRuleBase(reader);
		
        final WorkingMemory wm = ruleBase.newStatefulSession();
        
        final List results = new ArrayList();

        wm.setGlobal( "results", results );

        Person person = new Person ( "John Doe", 22, "M" );
        
        final FactHandle personFH = wm.insert( person );
        
        Activation[] activations = wm.getAgenda().getActivations();
        
        // we'll check the first rule to see if it should be fired
        assertEquals(
        		"Rule name match",
        		"HelloBasic",
        		activations[0].getRule().getName());    
        
        wm.fireAllRules();  
        
        assertEquals( 
        		4, 
        		results.size() );
        
        // Since we retracted the object from working memory in the "HelloDude"
        // rule, our fact handle should no longer be in working memory.
        assertNull(
        		wm.getFactHandle(personFH));
        
	}
}
