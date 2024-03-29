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

    public sealed class WebAppAnomaliesTrafficSpikesTrafficSpikesArgs : global::Pulumi.ResourceArgs
    {
        [Input("minutesAbnormalState", required: true)]
        public Input<double> MinutesAbnormalState { get; set; } = null!;

        [Input("trafficSpikePercentage", required: true)]
        public Input<double> TrafficSpikePercentage { get; set; } = null!;

        public WebAppAnomaliesTrafficSpikesTrafficSpikesArgs()
        {
        }
        public static new WebAppAnomaliesTrafficSpikesTrafficSpikesArgs Empty => new WebAppAnomaliesTrafficSpikesTrafficSpikesArgs();
    }
}
