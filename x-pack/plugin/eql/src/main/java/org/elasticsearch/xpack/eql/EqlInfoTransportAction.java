/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.eql;

import org.elasticsearch.action.support.ActionFilters;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.transport.TransportService;
import org.elasticsearch.xpack.core.XPackField;
import org.elasticsearch.xpack.core.action.XPackInfoFeatureAction;
import org.elasticsearch.xpack.core.action.XPackInfoFeatureTransportAction;

public class EqlInfoTransportAction extends XPackInfoFeatureTransportAction {

    @Inject
    public EqlInfoTransportAction(TransportService transportService, ActionFilters actionFilters) {
        super(XPackInfoFeatureAction.EQL.name(), transportService, actionFilters);
    }

    @Override
    public String name() {
        return XPackField.EQL;
    }

    @Override
    public boolean available() {
        return true;
    }

    @Override
    public boolean enabled() {
        return true;
    }

}