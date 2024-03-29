// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionCustomThresholdsArgs : global::Pulumi.ResourceArgs
    {
        [Input("droppedPacketsPercentage", required: true)]
        public Input<int> DroppedPacketsPercentage { get; set; } = null!;

        [Input("eventThresholds", required: true)]
        public Input<Inputs.HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionCustomThresholdsEventThresholdsArgs> EventThresholds { get; set; } = null!;

        [Input("totalPacketsRate", required: true)]
        public Input<int> TotalPacketsRate { get; set; } = null!;

        public HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionCustomThresholdsArgs()
        {
        }
        public static new HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionCustomThresholdsArgs Empty => new HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionCustomThresholdsArgs();
    }
}
