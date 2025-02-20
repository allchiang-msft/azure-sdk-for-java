// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.SecurityGroupViewResultInner;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasParent;
import com.azure.resourcemanager.resources.fluentcore.model.HasInnerModel;
import com.azure.resourcemanager.resources.fluentcore.model.Refreshable;
import java.util.Map;

/** The information about security rules applied to the specified VM.. */
@Fluent
public interface SecurityGroupView
    extends HasInnerModel<SecurityGroupViewResultInner>, HasParent<NetworkWatcher>, Refreshable<SecurityGroupView> {
    /**
     * Gets network interfaces on the specified VM.
     *
     * @return network interfaces on the specified VM
     */
    Map<String, SecurityGroupNetworkInterface> networkInterfaces();

    /**
     * Gets virtual machine id.
     *
     * @return virtual machine id
     */
    String vmId();
}
