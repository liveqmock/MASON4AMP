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
package org.metaabm.tests;

import junit.textui.TestRunner;

import org.metaabm.MetaABMFactory;
import org.metaabm.SNetwork;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>SNetwork</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class SNetworkTest extends SProjectionTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SNetworkTest.class);
    }

    /**
     * Constructs a new SNetwork test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SNetworkTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this SNetwork test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected SNetwork getFixture() {
        return (SNetwork) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMFactory.eINSTANCE.createSNetwork());
        getFixture().setLabel("Label");
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

} // SNetworkTest
