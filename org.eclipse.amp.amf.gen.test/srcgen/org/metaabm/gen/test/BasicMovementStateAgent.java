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
 * Basic Movement State Agent Java Implementation.
 * 
 * Generated by metaabm system: May 12, 2009 7:32:33 PM PDT in project: org.metaabm.gen.test  (testing) */

import static org.junit.Assert.*;

public class BasicMovementStateAgent {

	/**
	 * 
	 */

	private StateEnum state = StateEnum.option1;
	/**
	 * 
	 */

	private boolean someBoolean = false;
	/**
	 * Constructs a new Basic Movement State Agent.
	 */

	public BasicMovementStateAgent() {
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
			BasicMovementStateAgent clone = (BasicMovementStateAgent) super
					.clone();
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
	 * Gets the State property for Basic Movement State Agent.
	 * @return 
	 */

	public StateEnum getState() {
		return state;
	}

	/**
	 * Sets the State property for Basic Movement State Agent.
	 * 
	 * @param _state the new State value
	 */

	public void setState(StateEnum _state) {
		state = _state;
	}
	/**
	 * Gets the Some Boolean property for Basic Movement State Agent.
	 * @return 
	 */

	public boolean isSomeBoolean() {
		return someBoolean;
	}

	/**
	 * Sets the Some Boolean property for Basic Movement State Agent.
	 * 
	 * @param _someBoolean the new Some Boolean value
	 */

	public void setSomeBoolean(boolean _someBoolean) {
		someBoolean = _someBoolean;
	}
}
