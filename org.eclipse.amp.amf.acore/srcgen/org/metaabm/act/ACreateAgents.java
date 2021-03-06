/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.act;

import org.metaabm.IValue;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ACreate
 * Agents</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ACreateAgents#getAgentCount <em>Agent Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getACreateAgents()
 * @model
 * @generated
 */
public interface ACreateAgents extends ASelect {

	/**
	 * Returns the value of the '<em><b>Agent Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Count</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Count</em>' reference.
	 * @see #setAgentCount(IValue)
	 * @see org.metaabm.act.MetaABMActPackage#getACreateAgents_AgentCount()
	 * @model ordered="false"
	 * @generated
	 */
	IValue getAgentCount();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ACreateAgents#getAgentCount <em>Agent Count</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Agent Count</em>' reference.
	 * @see #getAgentCount()
	 * @generated
	 */
	void setAgentCount(IValue value);

} // ACreateAgents
