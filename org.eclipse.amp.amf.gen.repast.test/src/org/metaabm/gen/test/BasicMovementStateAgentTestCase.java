package org.metaabm.gen.test;

import org.metaabm.gen.test.share.AgentTestCase;

/**
 * Basic Movement State Agent Java Implementation. Generated by metaabm system:
 * Apr 13, 2008 3:03:55 PM EDT in project: org.metaabm.gen.repast.test (testing)
 */
public class BasicMovementStateAgentTestCase extends AgentTestCase {

    /**
     * Constructs a new Basic Movement State Agent.
     */
    public BasicMovementStateAgentTestCase() {
        super("org.eclipse.amp.amf.gen.repast.test.target", "Basic Movement State Agent Test",
                        "org.eclipse.amp.amf.gen.test.BasicMovementStateAgent");
    }

    public void setUp() {
        agentLoaded = new BasicMovementStateAgent();
    }

    public IBasicMovementStateAgent getAgent() {
        return (IBasicMovementStateAgent) agentLoaded;
    }

    public void testExistence() {
        assertNotNull(getAgent());
    }

    /**
     * Gets the State property for Basic Movement State Agent.
     * 
     * @return
     */
    public StateEnum getState() {
        return getAgent().getState();
    }

    /**
     * Sets the State property for Basic Movement State Agent.
     * 
     * @param _state the new State value
     */
    public void setState(StateEnum state) {
        getAgent().setState(state);
    }

    /**
     * Gets the Some Boolean property for Basic Movement State Agent.
     * 
     * @return
     */
    public boolean isSomeBoolean() {
        return getAgent().isSomeBoolean();
    }

    /**
     * Sets the Some Boolean property for Basic Movement State Agent.
     * 
     * @param _someBoolean the new Some Boolean value
     */
    public void setSomeBoolean(boolean someBoolean) {
        getAgent().setSomeBoolean(someBoolean);
    }
}
