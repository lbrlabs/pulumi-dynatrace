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

    public sealed class HostAnomaliesGcThresholdsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("suspensionPercentage", required: true)]
        public Input<int> SuspensionPercentage { get; set; } = null!;

        [Input("timePercentage", required: true)]
        public Input<int> TimePercentage { get; set; } = null!;

        public HostAnomaliesGcThresholdsGetArgs()
        {
        }
        public static new HostAnomaliesGcThresholdsGetArgs Empty => new HostAnomaliesGcThresholdsGetArgs();
    }
}
