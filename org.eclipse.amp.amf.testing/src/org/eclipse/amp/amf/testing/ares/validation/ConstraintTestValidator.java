/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintTestValidator.java,v 1.2 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.validation;

import org.eclipse.amp.amf.testing.aTest.Constraint;

import org.eclipse.amp.amf.testing.ares.Issue;

/**
 * A sample validator interface for {@link org.eclipse.amp.amf.testing.ares.ConstraintTest}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConstraintTestValidator {
    boolean validate();

    boolean validateConstraint(Constraint value);
    boolean validateIssue(Issue value);
    boolean validateActualValue(double value);
    boolean validateFailure(boolean value);
}
