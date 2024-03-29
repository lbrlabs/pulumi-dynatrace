// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholds
    {
        public readonly Outputs.HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholds EventThresholds;
        public readonly int RetransmissionRatePercentage;
        public readonly int RetransmittedPacketsNumberPerMinute;

        [OutputConstructor]
        private HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholds(
            Outputs.HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionCustomThresholdsEventThresholds eventThresholds,

            int retransmissionRatePercentage,

            int retransmittedPacketsNumberPerMinute)
        {
            EventThresholds = eventThresholds;
            RetransmissionRatePercentage = retransmissionRatePercentage;
            RetransmittedPacketsNumberPerMinute = retransmittedPacketsNumberPerMinute;
        }
    }
}
