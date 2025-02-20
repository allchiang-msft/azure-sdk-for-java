// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.ExternalNetworkProperties;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.ExternalNetworkPropertiesOptionAProperties;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.L3OptionBProperties;
import com.azure.resourcemanager.managednetworkfabric.models.PeeringOption;
import com.azure.resourcemanager.managednetworkfabric.models.RouteTargetInformation;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ExternalNetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExternalNetworkProperties model = BinaryData.fromString(
            "{\"peeringOption\":\"OptionA\",\"optionBProperties\":{\"importRouteTargets\":[\"yzbfvxovqkx\",\"uxqggvqrnhyhl\",\"cjsqggjhffbxr\",\"rkijpeuqlsdxeqz\"],\"exportRouteTargets\":[\"wmwwmjswen\"],\"routeTargets\":{\"importIpv4RouteTargets\":[\"me\",\"leqioulndh\"],\"importIpv6RouteTargets\":[\"eojhtollhsvi\",\"mytzln\"],\"exportIpv4RouteTargets\":[\"pnovyoanfbcs\"],\"exportIpv6RouteTargets\":[\"gywvtxig\"]}},\"optionAProperties\":{\"mtu\":1582673883,\"vlanId\":1788188155,\"fabricASN\":3343774067436674244,\"peerASN\":2937989151061187405,\"bfdConfiguration\":{\"administrativeState\":\"Disabled\",\"intervalInMilliSeconds\":2082895999,\"multiplier\":49091821},\"ingressAclId\":\"qnucs\",\"egressAclId\":\"hsidsjtdlpbnin\",\"primaryIpv4Prefix\":\"azlsvbzfcpuo\",\"primaryIpv6Prefix\":\"dwjcciklhs\",\"secondaryIpv4Prefix\":\"krdre\",\"secondaryIpv6Prefix\":\"olr\"},\"configurationState\":\"Deprovisioning\",\"provisioningState\":\"Canceled\",\"administrativeState\":\"Disabled\",\"networkToNetworkInterconnectId\":\"vdlhydwbdbfgr\",\"importRoutePolicyId\":\"unytjlkesm\",\"exportRoutePolicyId\":\"athu\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"h\",\"importIpv6RoutePolicyId\":\"an\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"llbvgwzsfftedous\",\"exportIpv6RoutePolicyId\":\"tjtgravaqogfkb\"},\"annotation\":\"auzlqbtxxw\"}")
            .toObject(ExternalNetworkProperties.class);
        Assertions.assertEquals("auzlqbtxxw", model.annotation());
        Assertions.assertEquals(PeeringOption.OPTIONA, model.peeringOption());
        Assertions.assertEquals("yzbfvxovqkx", model.optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("wmwwmjswen", model.optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("me", model.optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("eojhtollhsvi",
            model.optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("pnovyoanfbcs",
            model.optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("gywvtxig", model.optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals("azlsvbzfcpuo", model.optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("dwjcciklhs", model.optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("krdre", model.optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("olr", model.optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals(1582673883, model.optionAProperties().mtu());
        Assertions.assertEquals(1788188155, model.optionAProperties().vlanId());
        Assertions.assertEquals(2937989151061187405L, model.optionAProperties().peerAsn());
        Assertions.assertEquals(2082895999, model.optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(49091821, model.optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("qnucs", model.optionAProperties().ingressAclId());
        Assertions.assertEquals("hsidsjtdlpbnin", model.optionAProperties().egressAclId());
        Assertions.assertEquals("vdlhydwbdbfgr", model.networkToNetworkInterconnectId());
        Assertions.assertEquals("unytjlkesm", model.importRoutePolicyId());
        Assertions.assertEquals("athu", model.exportRoutePolicyId());
        Assertions.assertEquals("h", model.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("an", model.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("llbvgwzsfftedous", model.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("tjtgravaqogfkb", model.exportRoutePolicy().exportIpv6RoutePolicyId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExternalNetworkProperties model = new ExternalNetworkProperties().withAnnotation("auzlqbtxxw")
            .withPeeringOption(PeeringOption.OPTIONA)
            .withOptionBProperties(new L3OptionBProperties()
                .withImportRouteTargets(
                    Arrays.asList("yzbfvxovqkx", "uxqggvqrnhyhl", "cjsqggjhffbxr", "rkijpeuqlsdxeqz"))
                .withExportRouteTargets(Arrays.asList("wmwwmjswen"))
                .withRouteTargets(
                    new RouteTargetInformation().withImportIpv4RouteTargets(Arrays.asList("me", "leqioulndh"))
                        .withImportIpv6RouteTargets(Arrays.asList("eojhtollhsvi", "mytzln"))
                        .withExportIpv4RouteTargets(Arrays.asList("pnovyoanfbcs"))
                        .withExportIpv6RouteTargets(Arrays.asList("gywvtxig"))))
            .withOptionAProperties(
                new ExternalNetworkPropertiesOptionAProperties().withPrimaryIpv4Prefix("azlsvbzfcpuo")
                    .withPrimaryIpv6Prefix("dwjcciklhs")
                    .withSecondaryIpv4Prefix("krdre")
                    .withSecondaryIpv6Prefix("olr")
                    .withMtu(1582673883)
                    .withVlanId(1788188155)
                    .withPeerAsn(2937989151061187405L)
                    .withBfdConfiguration(
                        new BfdConfiguration().withIntervalInMilliSeconds(2082895999).withMultiplier(49091821))
                    .withIngressAclId("qnucs")
                    .withEgressAclId("hsidsjtdlpbnin"))
            .withNetworkToNetworkInterconnectId("vdlhydwbdbfgr")
            .withImportRoutePolicyId("unytjlkesm")
            .withExportRoutePolicyId("athu")
            .withImportRoutePolicy(
                new ImportRoutePolicy().withImportIpv4RoutePolicyId("h").withImportIpv6RoutePolicyId("an"))
            .withExportRoutePolicy(new ExportRoutePolicy().withExportIpv4RoutePolicyId("llbvgwzsfftedous")
                .withExportIpv6RoutePolicyId("tjtgravaqogfkb"));
        model = BinaryData.fromObject(model).toObject(ExternalNetworkProperties.class);
        Assertions.assertEquals("auzlqbtxxw", model.annotation());
        Assertions.assertEquals(PeeringOption.OPTIONA, model.peeringOption());
        Assertions.assertEquals("yzbfvxovqkx", model.optionBProperties().importRouteTargets().get(0));
        Assertions.assertEquals("wmwwmjswen", model.optionBProperties().exportRouteTargets().get(0));
        Assertions.assertEquals("me", model.optionBProperties().routeTargets().importIpv4RouteTargets().get(0));
        Assertions.assertEquals("eojhtollhsvi",
            model.optionBProperties().routeTargets().importIpv6RouteTargets().get(0));
        Assertions.assertEquals("pnovyoanfbcs",
            model.optionBProperties().routeTargets().exportIpv4RouteTargets().get(0));
        Assertions.assertEquals("gywvtxig", model.optionBProperties().routeTargets().exportIpv6RouteTargets().get(0));
        Assertions.assertEquals("azlsvbzfcpuo", model.optionAProperties().primaryIpv4Prefix());
        Assertions.assertEquals("dwjcciklhs", model.optionAProperties().primaryIpv6Prefix());
        Assertions.assertEquals("krdre", model.optionAProperties().secondaryIpv4Prefix());
        Assertions.assertEquals("olr", model.optionAProperties().secondaryIpv6Prefix());
        Assertions.assertEquals(1582673883, model.optionAProperties().mtu());
        Assertions.assertEquals(1788188155, model.optionAProperties().vlanId());
        Assertions.assertEquals(2937989151061187405L, model.optionAProperties().peerAsn());
        Assertions.assertEquals(2082895999, model.optionAProperties().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(49091821, model.optionAProperties().bfdConfiguration().multiplier());
        Assertions.assertEquals("qnucs", model.optionAProperties().ingressAclId());
        Assertions.assertEquals("hsidsjtdlpbnin", model.optionAProperties().egressAclId());
        Assertions.assertEquals("vdlhydwbdbfgr", model.networkToNetworkInterconnectId());
        Assertions.assertEquals("unytjlkesm", model.importRoutePolicyId());
        Assertions.assertEquals("athu", model.exportRoutePolicyId());
        Assertions.assertEquals("h", model.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("an", model.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("llbvgwzsfftedous", model.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("tjtgravaqogfkb", model.exportRoutePolicy().exportIpv6RoutePolicyId());
    }
}
