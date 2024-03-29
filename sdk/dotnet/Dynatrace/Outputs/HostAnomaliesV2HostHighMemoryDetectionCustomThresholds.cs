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
    public sealed class HostAnomaliesV2HostHighMemoryDetectionCustomThresholds
    {
        public readonly Outputs.HostAnomaliesV2HostHighMemoryDetectionCustomThresholdsEventThresholds EventThresholds;
        public readonly int PageFaultsPerSecondNonWindows;
        public readonly int PageFaultsPerSecondWindows;
        public readonly int UsedMemoryPercentageNonWindows;
        public readonly int UsedMemoryPercentageWindows;

        [OutputConstructor]
        private HostAnomaliesV2HostHighMemoryDetectionCustomThresholds(
            Outputs.HostAnomaliesV2HostHighMemoryDetectionCustomThresholdsEventThresholds eventThresholds,

            int pageFaultsPerSecondNonWindows,

            int pageFaultsPerSecondWindows,

            int usedMemoryPercentageNonWindows,

            int usedMemoryPercentageWindows)
        {
            EventThresholds = eventThresholds;
            PageFaultsPerSecondNonWindows = pageFaultsPerSecondNonWindows;
            PageFaultsPerSecondWindows = pageFaultsPerSecondWindows;
            UsedMemoryPercentageNonWindows = usedMemoryPercentageNonWindows;
            UsedMemoryPercentageWindows = usedMemoryPercentageWindows;
        }
    }
}
