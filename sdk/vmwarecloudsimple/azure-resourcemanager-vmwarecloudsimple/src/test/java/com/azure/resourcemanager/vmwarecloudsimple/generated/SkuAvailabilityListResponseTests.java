// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.SkuAvailabilityInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.SkuAvailabilityListResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SkuAvailabilityListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkuAvailabilityListResponse model = BinaryData.fromString(
            "{\"nextLink\":\"ciwwzjuqkhr\",\"value\":[{\"dedicatedAvailabilityZoneId\":\"wkuofoskghsauu\",\"dedicatedAvailabilityZoneName\":\"jmvxie\",\"dedicatedPlacementGroupId\":\"ugidyjrr\",\"dedicatedPlacementGroupName\":\"y\",\"limit\":1774598517,\"resourceType\":\"v\",\"skuId\":\"csonpclhoco\",\"skuName\":\"lkevle\"},{\"dedicatedAvailabilityZoneId\":\"zfbuhf\",\"dedicatedAvailabilityZoneName\":\"faxkffeii\",\"dedicatedPlacementGroupId\":\"lvmezyvshxmzsbbz\",\"dedicatedPlacementGroupName\":\"gigr\",\"limit\":2011180934,\"resourceType\":\"ur\",\"skuId\":\"xxjnspydptk\",\"skuName\":\"nkoukn\"},{\"dedicatedAvailabilityZoneId\":\"dwtiukbldngkp\",\"dedicatedAvailabilityZoneName\":\"ipazyxoegukgjnpi\",\"dedicatedPlacementGroupId\":\"gygev\",\"dedicatedPlacementGroupName\":\"ntypmrbpizcdrqj\",\"limit\":1233826604,\"resourceType\":\"ydnfyhxdeoejz\",\"skuId\":\"w\",\"skuName\":\"sjttgzfbish\"},{\"dedicatedAvailabilityZoneId\":\"khaj\",\"dedicatedAvailabilityZoneName\":\"yeamdphagalpb\",\"dedicatedPlacementGroupId\":\"wgipwhono\",\"dedicatedPlacementGroupName\":\"gshwankixz\",\"limit\":1192449755,\"resourceType\":\"jeputtmrywn\",\"skuId\":\"oqftiyqzrnkcq\",\"skuName\":\"xlwhzlsicoh\"}]}")
            .toObject(SkuAvailabilityListResponse.class);
        Assertions.assertEquals("ciwwzjuqkhr", model.nextLink());
        Assertions.assertEquals("wkuofoskghsauu", model.value().get(0).dedicatedAvailabilityZoneId());
        Assertions.assertEquals("jmvxie", model.value().get(0).dedicatedAvailabilityZoneName());
        Assertions.assertEquals("ugidyjrr", model.value().get(0).dedicatedPlacementGroupId());
        Assertions.assertEquals("y", model.value().get(0).dedicatedPlacementGroupName());
        Assertions.assertEquals(1774598517, model.value().get(0).limit());
        Assertions.assertEquals("v", model.value().get(0).resourceType());
        Assertions.assertEquals("csonpclhoco", model.value().get(0).skuId());
        Assertions.assertEquals("lkevle", model.value().get(0).skuName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkuAvailabilityListResponse model = new SkuAvailabilityListResponse().withNextLink("ciwwzjuqkhr")
            .withValue(Arrays.asList(
                new SkuAvailabilityInner().withDedicatedAvailabilityZoneId("wkuofoskghsauu")
                    .withDedicatedAvailabilityZoneName("jmvxie")
                    .withDedicatedPlacementGroupId("ugidyjrr")
                    .withDedicatedPlacementGroupName("y")
                    .withLimit(1774598517)
                    .withResourceType("v")
                    .withSkuId("csonpclhoco")
                    .withSkuName("lkevle"),
                new SkuAvailabilityInner().withDedicatedAvailabilityZoneId("zfbuhf")
                    .withDedicatedAvailabilityZoneName("faxkffeii")
                    .withDedicatedPlacementGroupId("lvmezyvshxmzsbbz")
                    .withDedicatedPlacementGroupName("gigr")
                    .withLimit(2011180934)
                    .withResourceType("ur")
                    .withSkuId("xxjnspydptk")
                    .withSkuName("nkoukn"),
                new SkuAvailabilityInner().withDedicatedAvailabilityZoneId("dwtiukbldngkp")
                    .withDedicatedAvailabilityZoneName("ipazyxoegukgjnpi")
                    .withDedicatedPlacementGroupId("gygev")
                    .withDedicatedPlacementGroupName("ntypmrbpizcdrqj")
                    .withLimit(1233826604)
                    .withResourceType("ydnfyhxdeoejz")
                    .withSkuId("w")
                    .withSkuName("sjttgzfbish"),
                new SkuAvailabilityInner().withDedicatedAvailabilityZoneId("khaj")
                    .withDedicatedAvailabilityZoneName("yeamdphagalpb")
                    .withDedicatedPlacementGroupId("wgipwhono")
                    .withDedicatedPlacementGroupName("gshwankixz")
                    .withLimit(1192449755)
                    .withResourceType("jeputtmrywn")
                    .withSkuId("oqftiyqzrnkcq")
                    .withSkuName("xlwhzlsicoh")));
        model = BinaryData.fromObject(model).toObject(SkuAvailabilityListResponse.class);
        Assertions.assertEquals("ciwwzjuqkhr", model.nextLink());
        Assertions.assertEquals("wkuofoskghsauu", model.value().get(0).dedicatedAvailabilityZoneId());
        Assertions.assertEquals("jmvxie", model.value().get(0).dedicatedAvailabilityZoneName());
        Assertions.assertEquals("ugidyjrr", model.value().get(0).dedicatedPlacementGroupId());
        Assertions.assertEquals("y", model.value().get(0).dedicatedPlacementGroupName());
        Assertions.assertEquals(1774598517, model.value().get(0).limit());
        Assertions.assertEquals("v", model.value().get(0).resourceType());
        Assertions.assertEquals("csonpclhoco", model.value().get(0).skuId());
        Assertions.assertEquals("lkevle", model.value().get(0).skuName());
    }
}
