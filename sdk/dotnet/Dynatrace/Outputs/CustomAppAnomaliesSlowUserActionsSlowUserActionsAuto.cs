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
    public sealed class CustomAppAnomaliesSlowUserActionsSlowUserActionsAuto
    {
        public readonly Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationAvoidOveralerting DurationAvoidOveralerting;
        public readonly Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAll DurationThresholdAll;
        public readonly Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest DurationThresholdSlowest;

        [OutputConstructor]
        private CustomAppAnomaliesSlowUserActionsSlowUserActionsAuto(
            Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationAvoidOveralerting durationAvoidOveralerting,

            Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdAll durationThresholdAll,

            Outputs.CustomAppAnomaliesSlowUserActionsSlowUserActionsAutoDurationThresholdSlowest durationThresholdSlowest)
        {
            DurationAvoidOveralerting = durationAvoidOveralerting;
            DurationThresholdAll = durationThresholdAll;
            DurationThresholdSlowest = durationThresholdSlowest;
        }
    }
}
