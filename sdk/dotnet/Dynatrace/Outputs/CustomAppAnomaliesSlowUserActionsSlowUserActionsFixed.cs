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
    public sealed class CustomAppAnomaliesSlowUserActionsSlowUserActionsFixed
    {
        public readonly Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralerting DurationAvoidOveralerting;
        public readonly Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdAllFixed DurationThresholdAllFixed;
        public readonly Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdSlowest DurationThresholdSlowest;
        public readonly string Sensitivity;

        [OutputConstructor]
        private CustomAppAnomaliesSlowUserActionsSlowUserActionsFixed(
            Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationAvoidOveralerting durationAvoidOveralerting,

            Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdAllFixed durationThresholdAllFixed,

            Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsFixedDurationThresholdSlowest durationThresholdSlowest,

            string sensitivity)
        {
            DurationAvoidOveralerting = durationAvoidOveralerting;
            DurationThresholdAllFixed = durationThresholdAllFixed;
            DurationThresholdSlowest = durationThresholdSlowest;
            Sensitivity = sensitivity;
        }
    }
}
