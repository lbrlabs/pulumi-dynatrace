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

    public sealed class HostAnomaliesNetworkUtilizationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("thresholds")]
        public Input<Inputs.HostAnomaliesNetworkUtilizationThresholdsGetArgs>? Thresholds { get; set; }

        public HostAnomaliesNetworkUtilizationGetArgs()
        {
        }
        public static new HostAnomaliesNetworkUtilizationGetArgs Empty => new HostAnomaliesNetworkUtilizationGetArgs();
    }
}
