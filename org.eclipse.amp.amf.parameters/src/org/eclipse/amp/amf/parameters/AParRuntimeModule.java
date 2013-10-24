/*
 * generated by Xtext
 */
package org.eclipse.amp.amf.parameters;

import org.eclipse.amp.amf.parameters.scoping.AParImportResolver;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.impl.Linker;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;







/**
 * Use this class to register components to be used within the IDE.
 */
public class AParRuntimeModule extends org.eclipse.amp.amf.parameters.AbstractAParRuntimeModule {

    public Class<? extends ImportUriResolver> bindImportUriResolver() {
        return AParImportResolver.class;
    }

    @Override
    /**
     * @return
     * @see org.eclipse.xtext.service.DefaultRuntimeModule#bindILinker()
     */
    public Class<? extends ILinker> bindILinker() {
        return Linker.class;
    }

    // public Class<? extends XtextResource> bindXtextResource() {
    // return XtextResource.class;
    // }
    //
    // /**
    // * @return
    // * @see org.eclipse.xtext.service.DefaultRuntimeModule#bindIResourceFactory()
    // */
    // public Class<? extends IResourceFactory> bindIResourceFactory() {
    // return AParResourceFactory.class;
    // }

    // /**
    // * @return
    // * @see org.eclipse.xtext.service.DefaultRuntimeModule#bindIResourceServiceProvider$Registry()
    // */
    // public Registry bindIResourceServiceProvider$Registry() {
    // return super.bindIResourceServiceProvider$Registry();
    // }

    // /**
    // * @param binder
    // * @see org.eclipse.amp.amf.parameters.AbstractAParRuntimeModule#configure(com.google.inject.Binder)
    // */
    // public void configure(Binder binder) {
    // super.configure(binder);
    // binder.bind(IResourceServiceProvider.class).to(MetaABMResourceServiceProvider.class);
    // }
}