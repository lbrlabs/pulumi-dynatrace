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

    public sealed class HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsArgs : global::Pulumi.ResourceArgs
    {
        [Input("eventThresholds", required: true)]
        public Input<Inputs.HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsEventThresholdsArgs> EventThresholds { get; set; } = null!;

        [Input("failedConnectionsNumberPerMinute", required: true)]
        public Input<int> FailedConnectionsNumberPerMinute { get; set; } = null!;

        [Input("newConnectionFailuresPercentage", required: true)]
        public Input<int> NewConnectionFailuresPercentage { get; set; } = null!;

        public HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsArgs()
        {
        }
        public static new HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsArgs Empty => new HostAnomaliesV2NetworkNetworkTcpProblemsDetectionCustomThresholdsArgs();
    }
}
