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

    public sealed class HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs : global::Pulumi.ResourceArgs
    {
        [Input("dealertingEvaluationWindow", required: true)]
        public Input<int> DealertingEvaluationWindow { get; set; } = null!;

        [Input("dealertingSamples", required: true)]
        public Input<int> DealertingSamples { get; set; } = null!;

        [Input("violatingEvaluationWindow", required: true)]
        public Input<int> ViolatingEvaluationWindow { get; set; } = null!;

        [Input("violatingSamples", required: true)]
        public Input<int> ViolatingSamples { get; set; } = null!;

        public HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs()
        {
        }
        public static new HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs Empty => new HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholdsArgs();
    }
}
