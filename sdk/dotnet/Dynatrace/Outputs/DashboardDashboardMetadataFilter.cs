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
    public sealed class DashboardDashboardMetadataFilter
    {
        public readonly ImmutableArray<Outputs.DashboardDashboardMetadataFilterManagementZone> ManagementZones;
        public readonly string? Timeframe;
        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        public readonly string? Unknowns;

        [OutputConstructor]
        private DashboardDashboardMetadataFilter(
            ImmutableArray<Outputs.DashboardDashboardMetadataFilterManagementZone> managementZones,

            string? timeframe,

            string? unknowns)
        {
            ManagementZones = managementZones;
            Timeframe = timeframe;
            Unknowns = unknowns;
        }
    }
}
