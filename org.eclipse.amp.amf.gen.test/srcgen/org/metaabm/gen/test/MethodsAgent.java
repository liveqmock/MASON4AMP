package org.metaabm.gen.test;

/**
 * Methods Agent Java Implementation.
 * 
 * Generated by metaabm system: May 12, 2009 7:32:34 PM PDT in project: org.metaabm.gen.test  (testing) */

import static org.junit.Assert.*;

public class MethodsAgent {

	/**
	 * 
	 */

	private int integer1 = 1;
	/**
	 * Constructs a new Methods Agent.
	 */

	public MethodsAgent() {
		createUniqueID();
	}
	//todo, make this a useful value for evaluating compatibility of different versions of generated classes
	private static final long serialVersionUID = 89989998L;

	private String uniqueID;

	public String getUID() {
		return uniqueID;
	}

	public void createUniqueID() {
		uniqueID = org.apache.commons.lang.RandomStringUtils
				.randomAlphanumeric(5);
	}

	/**
	 * Clones the agent, ensuring that a unique id is assigned.
	 */
	public Object clone() {
		try {
			MethodsAgent clone = (MethodsAgent) super.clone();
			clone.createUniqueID();
			return clone;
		} catch (Exception e) {
			throw new RuntimeException("Unexpected cloning exception: " + e);
		}
	}

	@org.junit.Test
	public void dummy() {
		assertTrue(true);
	}
	/**
	 * .
	 */

	@org.junit.Test
	public void testMethodsAgentRule() {

		/*PROTECTED REGION ID(MethodsAgent_testMethodsAgentRule_Pre) ENABLED START*/
		//Pre-Conditions Here
		/*PROTECTED REGION END*/

		setInteger1(getInteger1() + 1);

		/*PROTECTED REGION ID(MethodsAgent_testMethodsAgentRule_Post) ENABLED START*/
		//Post-Conditions Here
		/*PROTECTED REGION END*/

	}
	/**
	 * .
	 */

	@org.junit.Test
	public void methodAddsOnetoInteger1() {

		setInteger1(getInteger1() + 1);

	}

	/**
	 * Gets the Integer 1 property for Methods Agent.
	 * @return 
	 */

	public int getInteger1() {
		return integer1;
	}

	/**
	 * Sets the Integer 1 property for Methods Agent.
	 * 
	 * @param _integer1 the new Integer 1 value
	 */

	public void setInteger1(int _integer1) {
		integer1 = _integer1;
	}
}
