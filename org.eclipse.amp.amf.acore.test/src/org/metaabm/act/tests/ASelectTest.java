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

import org.metaabm.act.ASelect;
import org.metaabm.act.MetaABMActFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>AQuery Space</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ASelectTest extends AActTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ASelectTest.class);
    }

    /**
     * Constructs a new AQuery Space test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ASelectTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this ASelect test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected ASelect getFixture() {
        return (ASelect) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        if (fixture == null) {
            setFixture(MetaABMActFactory.eINSTANCE.createASelect());
        }
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

} // AQuerySpaceTest
