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
package org.metaabm.act.tests;

import junit.textui.TestRunner;

import org.metaabm.act.ACreateAgents;
import org.metaabm.act.MetaABMActFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>ACreate Agents</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public class ACreateAgentsTest extends ASelectTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ACreateAgentsTest.class);
    }

    /**
     * Constructs a new ACreate Agents test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ACreateAgentsTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this ACreate Agents test case. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected ACreateAgents getFixture() {
        return (ACreateAgents) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMActFactory.eINSTANCE.createACreateAgents());
        super.setUp();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} // ACreateAgentsTest
