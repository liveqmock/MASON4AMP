package org.metaabm.gen.test;

import org.metaabm.gen.test.share.AgentTestCase;

/**
 * Complex Location Java Implementation. Generated by metaabm system: Apr 13,
 * 2008 3:03:56 PM EDT in project: org.metaabm.gen.repast.test (testing)
 */
public class ComplexLocationTestCase extends AgentTestCase {

    /**
     * Constructs a new Complex Location.
     */
    public ComplexLocationTestCase() {
        super("org.eclipse.amp.amf.gen.repast.test.target", "Complex Location Test", "org.eclipse.amp.amf.gen.test.ComplexLocation");
    }

    public void setUp() {
        agentLoaded = new ComplexLocation();
    }

    public IComplexLocation getAgent() {
        return (IComplexLocation) agentLoaded;
    }

    public void testExistence() {
        assertNotNull(getAgent());
    }

    /**
     * .
     */
    public void testSelfAvailableCreate() {
        /*
         * PROTECTED REGION ID(ComplexLocation_testSelfAvailableCreate_Pre)
         * ENABLED START
         */
        // Pre-Conditions Here
        /* PROTECTED REGION END */
        getAgent().testSelfAvailableCreate();

        /*
         * PROTECTED REGION ID(ComplexLocation_testSelfAvailableCreate_Post)
         * ENABLED START
         */
        // Post-Conditions Here
        /* PROTECTED REGION END */
    }

    /**
     * .
     */
    public void testSelfAvailableWithin() {
        /*
         * PROTECTED REGION ID(ComplexLocation_testSelfAvailableWithin_Pre)
         * ENABLED START
         */
        // Pre-Conditions Here
        /* PROTECTED REGION END */
        getAgent().testSelfAvailableWithin();

        /*
         * PROTECTED REGION ID(ComplexLocation_testSelfAvailableWithin_Post)
         * ENABLED START
         */
        // Post-Conditions Here
        /* PROTECTED REGION END */
    }

    /**
     * .
     */
    public void testAgentHere() {
        /* PROTECTED REGION ID(ComplexLocation_testAgentHere_Pre) ENABLED START */
        // Pre-Conditions Here
        /* PROTECTED REGION END */
        getAgent().testAgentHere();

        /* PROTECTED REGION ID(ComplexLocation_testAgentHere_Post) ENABLED START */
        // Post-Conditions Here
        /* PROTECTED REGION END */
    }

    /**
     * .
     */
    public void testSelfAvailable() {
        /*
         * PROTECTED REGION ID(ComplexLocation_testSelfAvailable_Pre) ENABLED
         * START
         */
        // Pre-Conditions Here
        /* PROTECTED REGION END */
        getAgent().testSelfAvailable();

        /*
         * PROTECTED REGION ID(ComplexLocation_testSelfAvailable_Post) ENABLED
         * START
         */
        // Post-Conditions Here
        /* PROTECTED REGION END */
    }

    /**
     * .
     */
    public void testSelfWithinBounds() {
        /*
         * PROTECTED REGION ID(ComplexLocation_testSelfWithinBounds_Pre) ENABLED
         * START
         */
        // Pre-Conditions Here
        /* PROTECTED REGION END */
        getAgent().testSelfWithinBounds();

        /*
         * PROTECTED REGION ID(ComplexLocation_testSelfWithinBounds_Post)
         * ENABLED START
         */
        // Post-Conditions Here
        /* PROTECTED REGION END */
    }

    /**
     * Gets the Location Good property for Complex Location.
     * 
     * @return
     */
    public boolean isLocationGood() {
        return getAgent().isLocationGood();
    }

    /**
     * Sets the Location Good property for Complex Location.
     * 
     * @param _locationGood the new Location Good value
     */
    public void setLocationGood(boolean locationGood) {
        getAgent().setLocationGood(locationGood);
    }
}
