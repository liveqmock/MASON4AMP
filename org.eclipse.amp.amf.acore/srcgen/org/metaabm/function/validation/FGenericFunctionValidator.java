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
package org.metaabm.function.validation;

import org.eclipse.emf.common.util.EList;
import org.metaabm.SAttributeType;
import org.metaabm.function.FArgumentPrototype;

/**
 * A sample validator interface for
 * {@link org.metaabm.function.FGenericFunction}. This doesn't really do
 * anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's
 * code generator can be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FGenericFunctionValidator {
	boolean validate();

	boolean validateOutputPrototypes(EList<FArgumentPrototype> value);

	boolean validateResultType(SAttributeType value);

	boolean validateInputTypes(EList<SAttributeType> value);
}
