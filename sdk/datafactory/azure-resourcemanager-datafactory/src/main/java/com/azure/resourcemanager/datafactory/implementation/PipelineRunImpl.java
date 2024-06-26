// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.PipelineRunInner;
import com.azure.resourcemanager.datafactory.models.PipelineRun;
import com.azure.resourcemanager.datafactory.models.PipelineRunInvokedBy;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class PipelineRunImpl implements PipelineRun {
    private PipelineRunInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    PipelineRunImpl(PipelineRunInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String runId() {
        return this.innerModel().runId();
    }

    public String runGroupId() {
        return this.innerModel().runGroupId();
    }

    public Boolean isLatest() {
        return this.innerModel().isLatest();
    }

    public String pipelineName() {
        return this.innerModel().pipelineName();
    }

    public Map<String, String> parameters() {
        Map<String, String> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, String> runDimensions() {
        Map<String, String> inner = this.innerModel().runDimensions();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PipelineRunInvokedBy invokedBy() {
        return this.innerModel().invokedBy();
    }

    public OffsetDateTime lastUpdated() {
        return this.innerModel().lastUpdated();
    }

    public OffsetDateTime runStart() {
        return this.innerModel().runStart();
    }

    public OffsetDateTime runEnd() {
        return this.innerModel().runEnd();
    }

    public Integer durationInMs() {
        return this.innerModel().durationInMs();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String message() {
        return this.innerModel().message();
    }

    public Map<String, Object> additionalProperties() {
        Map<String, Object> inner = this.innerModel().additionalProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PipelineRunInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
