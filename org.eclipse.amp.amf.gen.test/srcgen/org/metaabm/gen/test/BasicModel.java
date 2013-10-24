/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
*/
package org.metaabm.gen.test;

/**
 * Basic Model Java Implementation.
 * 
 * Generated by metaabm system: May 12, 2009 7:32:34 PM PDT in project: org.metaabm.gen.test  (testing) */

import static org.junit.Assert.*;

public class BasicModel {

	/**
	 * 
	 */

	private boolean someFlag = true;
	/**
	 * The number of generated member agents to create.
	 */

	private int generatedMemberAgentCount = 10;
	/**
	 * 
	 */

	private int someInteger = 45;
	/**
	 * 
	 */

	private double someFloat = 1.8;
	/**
	 * The number of operations agents to create.
	 */

	private int operationsAgentCount = 0;
	/**
	 * The number of state agents to create.
	 */

	private int stateAgentCount = 0;
	/**
	 * The number of methods agents to create.
	 */

	private int methodsAgentCount = 0;
	/**
	 * Constructs a new Basic Model.
	 */

	public BasicModel() {
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
			BasicModel clone = (BasicModel) super.clone();
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
	public void testFake() {

		/*PROTECTED REGION ID(BasicModel_testFake_Pre) ENABLED START*/
		//Pre-Conditions Here
		/*PROTECTED REGION END*/

		assertTrue(true);

		/*PROTECTED REGION ID(BasicModel_testFake_Post) ENABLED START*/
		//Post-Conditions Here
		/*PROTECTED REGION END*/

	}
	/**
	 * Gets the Some Flag property for Basic Model.
	 * @return 
	 */

	public boolean isSomeFlag() {
		return someFlag;
	}

	/**
	 * Sets the Some Flag property for Basic Model.
	 * 
	 * @param _someFlag the new Some Flag value
	 */

	public void setSomeFlag(boolean _someFlag) {
		someFlag = _someFlag;
	}
	/**
	 * Gets the Generated Member Agent Count property for Basic Model.
	 * @return The number of generated member agents to create.
	 */

	public int getGeneratedMemberAgentCount() {
		return generatedMemberAgentCount;
	}

	/**
	 * Sets the Generated Member Agent Count property for Basic Model.
	 * The number of generated member agents to create.
	 * @param _generatedMemberAgentCount the new Generated Member Agent Count value
	 */

	public void setGeneratedMemberAgentCount(int _generatedMemberAgentCount) {
		generatedMemberAgentCount = _generatedMemberAgentCount;
	}
	/**
	 * Gets the Some Integer property for Basic Model.
	 * @return 
	 */

	public int getSomeInteger() {
		return someInteger;
	}

	/**
	 * Sets the Some Integer property for Basic Model.
	 * 
	 * @param _someInteger the new Some Integer value
	 */

	public void setSomeInteger(int _someInteger) {
		someInteger = _someInteger;
	}
	/**
	 * Gets the Some Float property for Basic Model.
	 * @return 
	 */

	public double getSomeFloat() {
		return someFloat;
	}

	/**
	 * Sets the Some Float property for Basic Model.
	 * 
	 * @param _someFloat the new Some Float value
	 */

	public void setSomeFloat(double _someFloat) {
		someFloat = _someFloat;
	}
	/**
	 * Gets the Operations Agent Count property for Basic Model.
	 * @return The number of operations agents to create.
	 */

	public int getOperationsAgentCount() {
		return operationsAgentCount;
	}

	/**
	 * Sets the Operations Agent Count property for Basic Model.
	 * The number of operations agents to create.
	 * @param _operationsAgentCount the new Operations Agent Count value
	 */

	public void setOperationsAgentCount(int _operationsAgentCount) {
		operationsAgentCount = _operationsAgentCount;
	}
	/**
	 * Gets the State Agent Count property for Basic Model.
	 * @return The number of state agents to create.
	 */

	public int getStateAgentCount() {
		return stateAgentCount;
	}

	/**
	 * Sets the State Agent Count property for Basic Model.
	 * The number of state agents to create.
	 * @param _stateAgentCount the new State Agent Count value
	 */

	public void setStateAgentCount(int _stateAgentCount) {
		stateAgentCount = _stateAgentCount;
	}
	/**
	 * Gets the Methods Agent Count property for Basic Model.
	 * @return The number of methods agents to create.
	 */

	public int getMethodsAgentCount() {
		return methodsAgentCount;
	}

	/**
	 * Sets the Methods Agent Count property for Basic Model.
	 * The number of methods agents to create.
	 * @param _methodsAgentCount the new Methods Agent Count value
	 */

	public void setMethodsAgentCount(int _methodsAgentCount) {
		methodsAgentCount = _methodsAgentCount;
	}
}
